import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyMicrocomponentComponent } from './my-microcomponent.component';

describe('MyMicrocomponentComponent', () => {
  let component: MyMicrocomponentComponent;
  let fixture: ComponentFixture<MyMicrocomponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MyMicrocomponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyMicrocomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
