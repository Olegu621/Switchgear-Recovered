            package com.quago.mobile.sdk;

            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum EnumC0727f {
                /* JADX INFO: Fake field, exist only in values array */
                GEOMAGNETIC_ROTATION_VECTOR(1),
                /* JADX INFO: Fake field, exist only in values array */
                MOTION_POINTER_DOWN(2),
                /* JADX INFO: Fake field, exist only in values array */
                MOTION_MOVE(3),
                /* JADX INFO: Fake field, exist only in values array */
                MOTION_POINTER_UP(4),
                /* JADX INFO: Fake field, exist only in values array */
                MOTION_UP(5),
                /* JADX INFO: Fake field, exist only in values array */
                KEY_DOWN(10),
                /* JADX INFO: Fake field, exist only in values array */
                KEY_UP(11),
                /* JADX INFO: Fake field, exist only in values array */
                BATTERY_CHANGE(20),
                /* JADX INFO: Fake field, exist only in values array */
                MAGNETIC_FIELD(21),
                /* JADX INFO: Fake field, exist only in values array */
                MAGNETIC_FIELD(22),
                /* JADX INFO: Fake field, exist only in values array */
                STEP_DETECTOR(23),
                /* JADX INFO: Fake field, exist only in values array */
                PROXIMITY(24),
                /* JADX INFO: Fake field, exist only in values array */
                LIGHT(25),
                /* JADX INFO: Fake field, exist only in values array */
                PRESSURE(26),
                /* JADX INFO: Fake field, exist only in values array */
                AMBIENT_TEMPERATURE(27),
                /* JADX INFO: Fake field, exist only in values array */
                STEP_DETECTOR(28),
                /* JADX INFO: Fake field, exist only in values array */
                GEOMAGNETIC_ROTATION_VECTOR(29),
                ON_RESUME(40),
                ON_PAUSE(41),
                ON_STOP(42),
                /* JADX INFO: Fake field, exist only in values array */
                TEXT(50),
                /* JADX INFO: Fake field, exist only in values array */
                CUSTOM(200);


                /* JADX INFO: renamed from: e */
                public static final Map f5430e;

                /* JADX INFO: renamed from: a */
                public final int f5432a;

                static {
/* 64 */            QuagoSettings.SensoryType sensoryType = QuagoSettings.SensoryType.BATTERY;
/* 280 */           HashMap map = new HashMap();
/* 288 */           for (EnumC0727f enumC0727f : values()) {
/* 298 */               boolean zContainsKey = map.containsKey(Integer.valueOf(enumC0727f.f5432a));
/* 302 */               int i = enumC0727f.f5432a;
/* 304 */               if (zContainsKey) {
/* 322 */                   f42.m3663s(fm0.m3781g(i, "[Error] Duplicated id for BiometricType enum = "));
/* 325 */                   return;
                        }
/* 310 */               map.put(Integer.valueOf(i), enumC0727f);
                    }
/* 330 */           f5430e = Collections.unmodifiableMap(map);
                }

                EnumC0727f(int i) {
/* 4 */             this.f5432a = i;
                }
            }
