import { IconDefinition } from "@fortawesome/fontawesome-svg-core";

export class PromotionalItem {
  Title: string = "";
  Icon: IconDefinition;

  constructor(title: string, icon: IconDefinition) {
    this.Title = title;
    this.Icon = icon;
  }
}