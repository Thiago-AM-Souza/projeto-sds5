import { Seller } from "./seller"

export type Sale = {
    "id": number,
    "visited": number,
    "deals": number,
    "amount": number,
    "date": "2021-01-25",
    "seller": Seller;
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    first: boolean;
    size?: number;
    number: number;
    numberOfElements?: number;
    empty?: boolean;
}

export type SaleSum = {
    sellerName: string;
    sum: number;
}

export type SaleSucess = {
        sellerName: string;
        visited: number;
        sucess: number;
}