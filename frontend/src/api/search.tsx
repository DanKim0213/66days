import api from "./api";

export async function fetchSearchData(searchContent: string, pgNo: number) {
  try {
    const res = await api.get(
      `/api/v1/main-service/group/search?searchContent=${searchContent}&pgNo=${pgNo}`
    );
    if (res.status === 200) {
      return res.data;
    }

    throw new Error("unexpected res status: " + res.status);
  } catch (error) {
    console.log("search get data err: " + error);
  }
}
