import { AfterViewInit, Component, ViewChild } from '@angular/core';
import { MatSidenav } from '@angular/material';
import { SidenavService } from './services/sidenav/sidenav.service';

@Component({
  selector: 'fapp-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent implements AfterViewInit {

  @ViewChild('nav') public sidenav: MatSidenav;

  constructor(
    private sidenavService: SidenavService,
  ) {}

  public ngAfterViewInit() {
    this.sidenavService.setSidenav(this.sidenav);
  }
}
