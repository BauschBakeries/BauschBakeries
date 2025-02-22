// Model for service area; name is self explainatory. Serivce area is defined by area table in backend.
// This is NOT the same as location list. Currently, location models are reserved for backend and admin
// use. Later, if stores are built, locations will be used, but again, do NOT publish locations to the public.
export class ServiceArea {
    Id: number;
    Title = "";
    IsAvailable: boolean;

  constructor(id: number, title: string, isAvailable: boolean) {
    this.Id = id;
    this.Title = title;
    this.IsAvailable = isAvailable;
  }
}
