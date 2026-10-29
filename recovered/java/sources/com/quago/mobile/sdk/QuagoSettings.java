            package com.quago.mobile.sdk;

            import com.quago.mobile.sdk.utils.IQuagoLog;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.TimeUnit;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class QuagoSettings {
                protected static C0740j0 LOG;
                protected String appToken;
                protected QuagoCallback callback;
                protected boolean disableInitSegment;
                protected boolean disableTouchSegment;
                protected boolean enableManualKeysDispatcher;
                protected boolean enableManualMotionDispatcher;
                protected QuagoFlavor flavor;
                protected boolean forceActivateAllSensors;
                protected IQuagoLog loggerCallback;
                protected Map<QuagoQueryMaxCount, Integer> maxCountMap;
                protected Map<SensoryType, Integer> sampleRateMap;
                protected Map<SensoryType, Boolean> segmentQueryFullRangeMap;
                protected int wrapper;
                protected LogLevel logLevel = LogLevel.INFO;
                protected QuagoTokenCallback tokenCallback = null;
                protected String wrapperVersion = "0";
                protected int maxSegments = -1;
                protected int autoMotionAmount = 50;
                protected long autoMotionIntervalMillis = 15000;
                protected long autoMaxDurationMillis = 300000;
                protected long touchSegmentDurationMillis = 1000;
                protected String defaultAdditionalId = null;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Builder {
                    protected QuagoSettings settings;

                    public Builder(String str, QuagoFlavor quagoFlavor) {
/* 5 */                 if (str == null || str.isEmpty()) {
/* 31 */                    C1951n4.m6859j("appToken can't be null or empty!");
/* 34 */                    throw null;
                        }
/* 13 */                if (quagoFlavor != null) {
/* 20 */                    this.settings = new QuagoSettings(str, quagoFlavor);
                        } else {
/* 25 */                    C1951n4.m6859j("flavor can't be null!");
/* 28 */                    throw null;
                        }
                    }

                    public QuagoSettings build() {
/* 1 */                 return this.settings;
                    }

                    public Builder disableInitSegment() {
/* 4 */                 this.settings.disableInitSegment = true;
/* 6 */                 return this;
                    }

                    public Builder disableTouchSegment() {
/* 4 */                 this.settings.disableTouchSegment = true;
/* 6 */                 return this;
                    }

                    public Builder enableManualKeysDispatcher() {
/* 4 */                 this.settings.enableManualKeysDispatcher = true;
/* 6 */                 return this;
                    }

                    public Builder enableManualTouchDispatcher() {
/* 4 */                 this.settings.enableManualMotionDispatcher = true;
/* 6 */                 return this;
                    }

                    public Builder overrideLogger(IQuagoLog iQuagoLog) {
/* 3 */                 this.settings.loggerCallback = iQuagoLog;
/* 5 */                 return this;
                    }

                    public Builder setDefaultAdditionId(String str) {
/* 1 */                 if (str != null && !str.isEmpty()) {
/* 11 */                    this.settings.defaultAdditionalId = str;
                        }
/* 13 */                return this;
                    }

                    public Builder setForceActivateAllSensors() {
/* 4 */                 this.settings.forceActivateAllSensors = true;
/* 6 */                 return this;
                    }

                    public Builder setJsonCallback(QuagoCallback quagoCallback) {
/* 1 */                 if (quagoCallback == null) {
/* 12 */                    QuagoSettings.LOG.m2613b("setJsonCallback", "callback is null - ignoring", new Object[0]);
/* 15 */                    return this;
                        }
/* 18 */                this.settings.callback = quagoCallback;
/* 20 */                return this;
                    }

                    public Builder setLogLevel(LogLevel logLevel) {
/* 1 */                 if (logLevel == null) {
/* 12 */                    QuagoSettings.LOG.m2613b("setLogLevel", "logLevel is null - ignoring", new Object[0]);
/* 15 */                    return this;
                        }
/* 18 */                this.settings.logLevel = logLevel;
/* 20 */                return this;
                    }

                    public Builder setMaxSegments(int i) {
/* 3 */                 this.settings.maxSegments = i;
/* 5 */                 return this;
                    }

                    public Builder setQueryMaxCount(QuagoQueryMaxCount quagoQueryMaxCount, int i) {
/* 1 */                 if (quagoQueryMaxCount != null && i >= 0) {
/* 14 */                    this.settings.maxCountMap.put(quagoQueryMaxCount, Integer.valueOf(i));
                        }
/* 17 */                return this;
                    }

                    public Builder setSampleRate(SensoryType sensoryType, long j) {
/* 1 */                 if (sensoryType == null) {
/* 3 */                     return this;
                        }
/* 19 */                this.settings.sampleRateMap.put(sensoryType, Integer.valueOf((int) TimeUnit.MILLISECONDS.toMicros(j)));
/* 22 */                return this;
                    }

                    public Builder setSegmentQueryFullRange(SensoryType sensoryType) {
/* 1 */                 if (sensoryType == null) {
/* 3 */                     return this;
                        }
/* 10 */                this.settings.segmentQueryFullRangeMap.put(sensoryType, Boolean.TRUE);
/* 13 */                return this;
                    }

                    public Builder setTokenCallback(QuagoTokenCallback quagoTokenCallback) {
/* 1 */                 if (quagoTokenCallback == null) {
/* 12 */                    QuagoSettings.LOG.m2613b("setTokenCallback", "callback is null - ignoring", new Object[0]);
/* 15 */                    return this;
                        }
/* 18 */                this.settings.tokenCallback = quagoTokenCallback;
/* 20 */                return this;
                    }

                    public Builder setTouchSegmentDurationMillis(long j) {
/* 3 */                 this.settings.touchSegmentDurationMillis = j;
/* 5 */                 return this;
                    }

                    public Builder setTrackingInterval(long j) {
/* 3 */                 this.settings.autoMotionIntervalMillis = j;
/* 5 */                 return this;
                    }

                    public Builder setTrackingMaxDuration(long j) {
/* 3 */                 this.settings.autoMaxDurationMillis = j;
/* 5 */                 return this;
                    }

                    public Builder setTrackingMotionAmount(int i) {
/* 3 */                 this.settings.autoMotionAmount = i;
/* 5 */                 return this;
                    }

                    public Builder setWrapperInfo(int i, String str) {
/* 1 */                 QuagoSettings quagoSettings = this.settings;
/* 3 */                 quagoSettings.wrapper = i;
/* 5 */                 quagoSettings.wrapperVersion = str;
/* 7 */                 return this;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum LogLevel {
                    VERBOSE(2),
                    DEBUG(3),
                    INFO(4),
                    WARNING(5),
                    ERROR(6),
                    DISABLED(10);

                    private static final Map<Integer, LogLevel> ENUMS_MAP;
                    public final int priority;

                    static {
/* 72 */                HashMap map = new HashMap();
/* 80 */                for (LogLevel logLevel : values()) {
/* 90 */                    map.put(Integer.valueOf(logLevel.priority), logLevel);
                        }
/* 100 */               ENUMS_MAP = Collections.unmodifiableMap(map);
                    }

                    LogLevel(int i) {
/* 4 */                 this.priority = i;
                    }

                    public static LogLevel getByPriority(int i) {
/* 7 */                 return ENUMS_MAP.get(Integer.valueOf(i));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface QuagoCallback {
                    void onJsonSegment(String str, String str2);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum QuagoFlavor {
                    AUTHENTIC(0),
                    UNAUTHENTIC(1),
                    PRODUCTION(2),
                    DEVELOPMENT(3);

                    private static final Map<Integer, QuagoFlavor> ENUMS_MAP;
                    public final int value;

                    static {
/* 49 */                HashMap map = new HashMap();
/* 57 */                for (QuagoFlavor quagoFlavor : values()) {
/* 67 */                    map.put(Integer.valueOf(quagoFlavor.value), quagoFlavor);
                        }
/* 77 */                ENUMS_MAP = Collections.unmodifiableMap(map);
                    }

                    QuagoFlavor(int i) {
/* 4 */                 this.value = i;
                    }

                    public static QuagoFlavor valueOf(int i) {
/* 7 */                 return ENUMS_MAP.get(Integer.valueOf(i));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum QuagoQueryMaxCount {
                    MOTION,
                    KEYS,
                    BATTERY,
                    ACCELEROMETER,
                    MAGNETIC_FIELD,
                    GYROSCOPE,
                    PROXIMITY,
                    LIGHT,
                    PRESSURE,
                    AMBIENT_TEMPERATURE,
                    STEP_DETECTOR,
                    GEOMAGNETIC_ROTATION_VECTOR,
                    RESOLUTION,
                    LIFECYCLE
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface QuagoTokenCallback {
                    void onToken(String str, String str2, String str3, String str4, int i);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum SensoryType {
                    BATTERY(0),
                    ACCELEROMETER(1),
                    MAGNETIC_FIELD(2),
                    GYROSCOPE(4),
                    PROXIMITY(8),
                    LIGHT(5),
                    PRESSURE(6),
                    AMBIENT_TEMPERATURE(13),
                    STEP_DETECTOR(18),
                    GEOMAGNETIC_ROTATION_VECTOR(20);

                    private static final Map<Integer, SensoryType> ENUMS_MAP;
                    public final int type;

                    static {
/* 117 */               HashMap map = new HashMap();
/* 125 */               for (SensoryType sensoryType : values()) {
/* 135 */                   map.put(Integer.valueOf(sensoryType.type), sensoryType);
                        }
/* 145 */               ENUMS_MAP = Collections.unmodifiableMap(map);
                    }

                    SensoryType(int i) {
/* 4 */                 this.type = i;
                    }

                    public static SensoryType valueOf(int i) {
/* 7 */                 return ENUMS_MAP.get(Integer.valueOf(i));
                    }
                }

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            LOG = new C0740j0("QuagoSettings");
                }

                public QuagoSettings(String str, QuagoFlavor quagoFlavor) {
/* 37 */            this.appToken = str;
/* 39 */            this.flavor = quagoFlavor;
/* 43 */            HashMap map = new HashMap();
/* 46 */            this.maxCountMap = map;
/* 56 */            map.put(QuagoQueryMaxCount.MOTION, 2000);
/* 69 */            this.maxCountMap.put(QuagoQueryMaxCount.KEYS, 250);
/* 82 */            this.maxCountMap.put(QuagoQueryMaxCount.ACCELEROMETER, 1000);
/* 89 */            this.maxCountMap.put(QuagoQueryMaxCount.BATTERY, 250);
/* 96 */            this.maxCountMap.put(QuagoQueryMaxCount.MAGNETIC_FIELD, 250);
/* 103 */           this.maxCountMap.put(QuagoQueryMaxCount.GYROSCOPE, 250);
/* 110 */           this.maxCountMap.put(QuagoQueryMaxCount.PROXIMITY, 250);
/* 117 */           this.maxCountMap.put(QuagoQueryMaxCount.LIGHT, 250);
/* 124 */           this.maxCountMap.put(QuagoQueryMaxCount.PRESSURE, 250);
/* 131 */           this.maxCountMap.put(QuagoQueryMaxCount.AMBIENT_TEMPERATURE, 250);
/* 138 */           this.maxCountMap.put(QuagoQueryMaxCount.STEP_DETECTOR, 250);
/* 145 */           this.maxCountMap.put(QuagoQueryMaxCount.GEOMAGNETIC_ROTATION_VECTOR, 250);
/* 156 */           this.maxCountMap.put(QuagoQueryMaxCount.RESOLUTION, 50);
/* 169 */           this.maxCountMap.put(QuagoQueryMaxCount.LIFECYCLE, 100);
/* 174 */           HashMap map2 = new HashMap();
/* 177 */           this.segmentQueryFullRangeMap = map2;
/* 179 */           SensoryType sensoryType = SensoryType.BATTERY;
/* 181 */           Boolean bool = Boolean.FALSE;
/* 183 */           map2.put(sensoryType, bool);
/* 186 */           Map<SensoryType, Boolean> map3 = this.segmentQueryFullRangeMap;
/* 188 */           SensoryType sensoryType2 = SensoryType.ACCELEROMETER;
/* 190 */           map3.put(sensoryType2, bool);
/* 193 */           Map<SensoryType, Boolean> map4 = this.segmentQueryFullRangeMap;
/* 195 */           SensoryType sensoryType3 = SensoryType.MAGNETIC_FIELD;
/* 197 */           map4.put(sensoryType3, bool);
/* 200 */           Map<SensoryType, Boolean> map5 = this.segmentQueryFullRangeMap;
/* 202 */           SensoryType sensoryType4 = SensoryType.GYROSCOPE;
/* 204 */           map5.put(sensoryType4, bool);
/* 207 */           Map<SensoryType, Boolean> map6 = this.segmentQueryFullRangeMap;
/* 209 */           SensoryType sensoryType5 = SensoryType.PROXIMITY;
/* 211 */           map6.put(sensoryType5, bool);
/* 214 */           Map<SensoryType, Boolean> map7 = this.segmentQueryFullRangeMap;
/* 216 */           SensoryType sensoryType6 = SensoryType.LIGHT;
/* 218 */           map7.put(sensoryType6, bool);
/* 221 */           Map<SensoryType, Boolean> map8 = this.segmentQueryFullRangeMap;
/* 223 */           SensoryType sensoryType7 = SensoryType.PRESSURE;
/* 225 */           map8.put(sensoryType7, bool);
/* 228 */           Map<SensoryType, Boolean> map9 = this.segmentQueryFullRangeMap;
/* 230 */           SensoryType sensoryType8 = SensoryType.AMBIENT_TEMPERATURE;
/* 232 */           map9.put(sensoryType8, bool);
/* 235 */           Map<SensoryType, Boolean> map10 = this.segmentQueryFullRangeMap;
/* 237 */           SensoryType sensoryType9 = SensoryType.STEP_DETECTOR;
/* 239 */           map10.put(sensoryType9, bool);
/* 242 */           Map<SensoryType, Boolean> map11 = this.segmentQueryFullRangeMap;
/* 244 */           SensoryType sensoryType10 = SensoryType.GEOMAGNETIC_ROTATION_VECTOR;
/* 246 */           map11.put(sensoryType10, bool);
/* 272 */           HashMap map12 = new HashMap();
/* 275 */           this.sampleRateMap = map12;
/* 277 */           map12.put(sensoryType2, 50000);
/* 282 */           this.sampleRateMap.put(sensoryType3, 500000);
/* 287 */           this.sampleRateMap.put(sensoryType4, 250000);
/* 297 */           this.sampleRateMap.put(sensoryType10, 0);
/* 302 */           this.sampleRateMap.put(sensoryType5, 50000);
/* 307 */           this.sampleRateMap.put(sensoryType6, 500000);
/* 312 */           this.sampleRateMap.put(sensoryType7, 500000);
/* 317 */           this.sampleRateMap.put(sensoryType8, 250000);
/* 322 */           this.sampleRateMap.put(sensoryType, 250000);
/* 327 */           this.sampleRateMap.put(sensoryType9, 0);
                }

                public static Builder create(String str, QuagoFlavor quagoFlavor) {
/* 3 */             return new Builder(str, quagoFlavor);
                }

                public String getAppToken() {
/* 1 */             return this.appToken;
                }

                public long getAutoMaxDurationMillis() {
/* 1 */             return this.autoMaxDurationMillis;
                }

                public int getAutoMotionAmount() {
/* 1 */             return this.autoMotionAmount;
                }

                public long getAutoMotionIntervalMillis() {
/* 1 */             return this.autoMotionIntervalMillis;
                }

                public QuagoCallback getCallback() {
/* 1 */             return this.callback;
                }

                public String getDefaultAdditionalId() {
/* 1 */             return this.defaultAdditionalId;
                }

                public QuagoFlavor getFlavor() {
/* 1 */             return this.flavor;
                }

                public int getMaxSegments() {
/* 1 */             return this.maxSegments;
                }

                public int getQueryMaxCount(QuagoQueryMaxCount quagoQueryMaxCount) {
                    Integer num;
/* 1 */             Map<QuagoQueryMaxCount, Integer> map = this.maxCountMap;
/* 4 */             if (map == null || !map.containsKey(quagoQueryMaxCount) || (num = this.maxCountMap.get(quagoQueryMaxCount)) == null) {
/* 3 */                 return 0;
                    }
/* 24 */            return num.intValue();
                }

                public int getSampleRate(SensoryType sensoryType) {
                    Integer num;
/* 1 */             Map<SensoryType, Integer> map = this.sampleRateMap;
/* 4 */             if (map == null || !map.containsKey(sensoryType) || (num = this.sampleRateMap.get(sensoryType)) == null) {
/* 3 */                 return -1;
                    }
/* 24 */            return num.intValue();
                }

                public boolean getSegmentQueryFullRange(SensoryType sensoryType) {
                    Boolean bool;
/* 1 */             Map<SensoryType, Boolean> map = this.segmentQueryFullRangeMap;
/* 4 */             if (map == null || !map.containsKey(sensoryType) || (bool = this.segmentQueryFullRangeMap.get(sensoryType)) == null) {
/* 3 */                 return false;
                    }
/* 24 */            return bool.booleanValue();
                }

                public QuagoTokenCallback getTokenCallback() {
/* 1 */             return this.tokenCallback;
                }

                public long getTouchSegmentDurationMillis() {
/* 1 */             return this.touchSegmentDurationMillis;
                }

                public int getWrapper() {
/* 1 */             return this.wrapper;
                }

                public String getWrapperVersion() {
/* 1 */             return this.wrapperVersion;
                }

                public boolean isForceActivateAllSensors() {
/* 1 */             return this.forceActivateAllSensors;
                }

                public boolean isInitSegmentDisabled() {
/* 1 */             return this.disableInitSegment;
                }

                public boolean isManualKeysDispatcherEnabled() {
/* 1 */             return this.enableManualKeysDispatcher;
                }

                public boolean isManualMotionDispatcherEnabled() {
/* 1 */             return this.enableManualMotionDispatcher;
                }

                public boolean isTouchSegmentDisabled() {
/* 1 */             return this.disableTouchSegment;
                }

                public void setAppToken(String str) {
/* 1 */             if (str == null || str.isEmpty()) {
/* 22 */                LOG.m2613b("setAppToken", "newAppToken is null or empty - ignoring!", new Object[0]);
                    } else {
/* 10 */                this.appToken = str;
                    }
                }
            }
