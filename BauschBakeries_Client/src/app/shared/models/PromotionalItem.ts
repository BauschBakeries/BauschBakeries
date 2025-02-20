import { IconDefinition } from "@fortawesome/fontawesome-svg-core";

export class PromotionalItem {
    Id: number;
    Title: string = "";
    Icon: IconDefinition;
    IsAvailable: boolean;

  constructor(id: number, title: string, icon: IconDefinition, isAvailable: boolean) {
    this.Id = id;
    this.Title = title;
    this.Icon = icon;
    this.IsAvailable = isAvailable;
  }
}