import { Component, OnInit } from '@angular/core';
import { CardComponent } from '@Shared/components/card/card.component';
import { ButtonComponent } from '@Shared/components/button/button.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faBreadSlice, faCake, faCookie, faSnowflake, faChevronRight } from '@fortawesome/free-solid-svg-icons';
import { PromotionalItem } from '@Models/PromotionalItem';
import { ServiceArea } from '@Shared/models/ServiceArea';

@Component({
  standalone: true,
  selector: 'app-home',
  imports: [CardComponent, ButtonComponent, FontAwesomeModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent implements OnInit {

  faChevronRight = faChevronRight;

  promotionalList: PromotionalItem[] = [];
  serviceAreaList: ServiceArea[] = [];

  // these json lists are for testing only; will be removed when backend is implemented
  promotionalJson = [
    { id: 1, name: 'Sweets', icon: 'faCookie', active: true },
    { id: 2, name: 'Breads', icon: 'faBreadSlice', active: true },
    { id: 3, name: 'Ceremonial', icon: 'faCake', active: true },
    { id: 4, name: 'Seasonal', icon: 'faSnowflake', active: true },
  ];

  serviceAreaListJson = [
    { id: 1, name: 'Muscatine', active: true },
    { id: 2, name: 'Iowa City', active: true },
    { id: 3, name: 'Ottumwa', active: true },
    { id: 4, name: 'Des Moines', active: true },
  ];

  iconMap: Record<string, any> = {
    faCookie: faCookie,
    faBreadSlice: faBreadSlice,
    faCake: faCake,
    faSnowflake: faSnowflake,
  };

  ngOnInit() {
    this.promotionalList = this.promotionalJson.map(
      (item) => new PromotionalItem(item.id, item.name, this.iconMap[item.icon], item.active)
    );
    this.serviceAreaList = this.serviceAreaListJson.map(
      (item) => new ServiceArea(item.id, item.name, item.active)
    );
  }
}
