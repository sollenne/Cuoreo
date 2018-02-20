import { Injectable } from '@angular/core';
import { MatSidenav } from '@angular/material';

@Injectable()

export class SidenavService {
  public sidenav: MatSidenav;

  constructor() { }

  public setSidenav = (nav: MatSidenav): void => {
    this.sidenav = nav;
  }

  public open = (): Promise<any> => {
    return this.sidenav.open();
  }

  public close = (): Promise<any> => {
    return this.sidenav.close();
  }

  public toggle = (): Promise<any> => {
    return this.sidenav.toggle();
  }

}
