export interface SearchData {
  result: string;
  [`group-list`]: SearchGroupData[];
}

export interface SearchGroupData {
  ownerImage: string;
  ownerName: string;
  image: string | null;
  name: string;
  categories: Array<"알고리즘" | "CS" | "블로깅" | "개발서적" | "강의"> | null;
  description: string;
  memberCounts: number;
  maxMemberCounts: number;
}
