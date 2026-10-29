            package com.supercell.titan;

            import com.quago.mobile.sdk.Quago;
            import com.quago.mobile.sdk.QuagoSettings;
            import java.util.Objects;
            import p000.c02;
            import p000.d02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class QuagoManager {

                /* JADX INFO: renamed from: a */
                public static boolean f5888a = false;

                /* JADX INFO: renamed from: b */
                public static boolean f5889b = false;

                /* JADX INFO: renamed from: c */
                public static GameApp f5890c = null;

                /* JADX INFO: renamed from: d */
                public static QuagoManager f5891d = null;

                public QuagoManager(GameApp gameApp) {
/* 4 */             f5891d = this;
/* 6 */             f5890c = gameApp;
                }

                public static void beginSegment(String str) {
/* 3 */             if (!f5888a || f5889b) {
/* 12 */                return;
                    }
/* 9 */             Quago.beginSegment(str);
                }

                public static void enable(boolean z, int i, boolean z2) {
                    QuagoSettings.QuagoFlavor quagoFlavor;
/* 3 */             if (f5888a) {
/* 5 */                 return;
                    }
/* 6 */             QuagoSettings.QuagoFlavor quagoFlavor2 = QuagoSettings.QuagoFlavor.PRODUCTION;
/* 9 */             if (i == 1) {
/* 25 */                quagoFlavor = QuagoSettings.QuagoFlavor.DEVELOPMENT;
                    } else if (i != 2) {
/* 19 */                quagoFlavor = i != 3 ? quagoFlavor2 : QuagoSettings.QuagoFlavor.UNAUTHENTIC;
                    } else {
/* 22 */                quagoFlavor = QuagoSettings.QuagoFlavor.AUTHENTIC;
                    }
/* 27 */            Objects.toString(quagoFlavor);
/* 30 */            if (z) {
/* 34 */                f5891d.getClass();
/* 37 */                Objects.toString(quagoFlavor);
/* 70 */                QuagoSettings.Builder builderOverrideLogger = QuagoSettings.create((String) f5890c.getBuildConfigFromGame("QUAGO_APP_TOKEN"), quagoFlavor).setLogLevel(quagoFlavor == quagoFlavor2 ? QuagoSettings.LogLevel.DISABLED : QuagoSettings.LogLevel.INFO).overrideLogger(new c02());
/* 74 */                if (!z2) {
/* 81 */                    builderOverrideLogger.setJsonCallback(new d02());
                        }
/* 86 */                Quago.initialize(f5890c, builderOverrideLogger);
                    } else {
/* 90 */                f5889b = true;
                    }
/* 92 */            f5888a = true;
                }

                public static void endSegment() {
/* 3 */             if (!f5888a || f5889b) {
/* 12 */                return;
                    }
/* 9 */             Quago.endSegment();
                }

                public static native void onLog(int i, String str, String str2);

                public static void onPause() {
/* 3 */             if (!f5888a || f5889b) {
/* 12 */                return;
                    }
/* 9 */             Quago.onPause();
                }

                public static void onResume() {
/* 3 */             if (!f5888a || f5889b) {
/* 12 */                return;
                    }
/* 9 */             Quago.onResume();
                }

                public static native void sendJsonSegments(String str, byte[] bArr);

                public static void setAdditionalId(String str) {
/* 3 */             if (!f5888a || f5889b) {
/* 12 */                return;
                    }
/* 9 */             Quago.setAdditionalId(str);
                }

                public static void setAppToken(String str) {
                }

                public static void setKeyValue(String str, String str2) {
/* 3 */             if (!f5888a || f5889b) {
/* 24 */                return;
                    }
/* 15 */            if (str.equals("PlayerId")) {
/* 17 */                Quago.setUserId(str2);
                    } else {
/* 21 */                Quago.setKeyValues(str, str2);
                    }
                }
            }
