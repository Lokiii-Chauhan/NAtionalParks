package com.lokiiichauhan.parks.data;

import com.lokiiichauhan.parks.model.Park;

import java.util.List;

public interface AsyncResponse {
    void processPark(List<Park> parks);
}
