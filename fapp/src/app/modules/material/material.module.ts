import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

/**
 * Keep each Material Module import separate for AOT Tree Shaking
 */
import { MatButtonModule } from "@angular/material/button";
import { MatSidenavModule } from "@angular/material/sidenav";

const modules = [
  CommonModule,
  BrowserAnimationsModule,
  MatSidenavModule,
  MatButtonModule,
];

@NgModule({
  imports: modules,
  exports: modules,
  declarations: [],
})
export class MaterialModule { }
