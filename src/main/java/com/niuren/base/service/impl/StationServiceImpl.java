package com.niuren.base.service.impl;import org.springframework.stereotype.Repository;import com.niuren.base.base.impl.BaseServiceImpl;import com.niuren.base.dao.impl.StationDaoImpl;import com.niuren.base.entity.Station;import com.niuren.base.service.StationService;@Repository("stationService")public class StationServiceImpl extends BaseServiceImpl<StationDaoImpl, Station> implements StationService {}