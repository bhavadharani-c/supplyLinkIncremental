import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { SupplierArrayComponent } from '../app/supplylink/components/supplierarray/supplierarray.component';

describe('SupplierArrayComponent', () => {

  let component: SupplierArrayComponent;
  let fixture: ComponentFixture<SupplierArrayComponent>;

  beforeEach(() => {

    TestBed.configureTestingModule({
      imports: [SupplierArrayComponent],
      providers: [
        {
          provide: ActivatedRoute,
          useValue: {
            queryParams: of({})
          }
        }
      ]
    });

    fixture = TestBed.createComponent(SupplierArrayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should display all suppliers when no query parameter is provided', () => {

    expect(component.supplierList.length).toBe(3);

    expect(component.supplierList[0].supplierName).toBe('Jessica Alba');
    expect(component.supplierList[1].supplierName).toBe('John Wane');
    expect(component.supplierList[2].supplierName).toBe('Kristan');
  });

  it('should read role from ActivatedRoute queryParams and filter suppliers', () => {

    TestBed.resetTestingModule();

    TestBed.configureTestingModule({
      imports: [SupplierArrayComponent],
      providers: [
        {
          provide: ActivatedRoute,
          useValue: {
            queryParams: of({ role: 'USER' })
          }
        }
      ]
    });

    const fixture = TestBed.createComponent(SupplierArrayComponent);
    const component = fixture.componentInstance;

    fixture.detectChanges();

    expect(component.supplierList.length).toBe(2);

    expect(component.supplierList[0].supplierName).toBe('Jessica Alba');
    expect(component.supplierList[1].supplierName).toBe('John Wane');

    expect(
      component.supplierList.every(
        supplier => supplier.role === 'USER'
      )
    ).toBeTruthy();
  });

  it('should filter ADMIN suppliers based on route query parameter', () => {

    TestBed.resetTestingModule();

    TestBed.configureTestingModule({
      imports: [SupplierArrayComponent],
      providers: [
        {
          provide: ActivatedRoute,
          useValue: {
            queryParams: of({ role: 'ADMIN' })
          }
        }
      ]
    });

    const fixture = TestBed.createComponent(SupplierArrayComponent);
    const component = fixture.componentInstance;

    fixture.detectChanges();

    expect(component.supplierList.length).toBe(1);
    expect(component.supplierList[0].supplierName).toBe('Kristan');
    expect(component.supplierList[0].role).toBe('ADMIN');
  });

});