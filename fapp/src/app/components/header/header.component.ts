import { Component, OnInit } from '@angular/core';
import { SidenavService } from '../../services/sidenav/sidenav.service';

@Component({
  selector: 'fapp-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})

export class HeaderComponent implements OnInit {

  constructor(
    private sidenavService: SidenavService,
  ) { }

  ngOnInit() {
  }

  public toggleSidenav = (): void => {
    this.sidenavService.toggle().then(() => {
      return;
    });
  }
}
