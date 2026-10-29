            package io.sentry.android.core;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.C1443f;
            import io.sentry.C1486i0;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.android.core.internal.util.C1220g;
            import io.sentry.util.AbstractC1716o;
            import java.nio.charset.Charset;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.android.core.w1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1282w1 extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public final InterfaceC1389c1 f10381a;

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f10382b;

                /* JADX INFO: renamed from: c */
                public final C1220g f10383c = new C1220g(0, 60000);

                /* JADX INFO: renamed from: d */
                public final char[] f10384d = new char[64];

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ SystemEventsBreadcrumbsIntegration f10385e;

                public C1282w1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC1389c1 interfaceC1389c1, SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f10385e = systemEventsBreadcrumbsIntegration;
/* 23 */            this.f10381a = interfaceC1389c1;
/* 25 */            this.f10382b = sentryAndroidOptions;
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    C1279v1 c1279v1;
                    Bundle extras;
                    int i;
/* 1 */             String action = intent.getAction();
/* 7 */             boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
/* 11 */            SentryAndroidOptions sentryAndroidOptions = this.f10382b;
/* 13 */            String str = null;
/* 14 */            if (!zEquals) {
/* 64 */                c1279v1 = null;
                    } else {
/* 22 */                if (this.f10383c.m4844a()) {
/* 60 */                    return;
                        }
/* 25 */                Float fM4937b = C1272t0.m4937b(intent, sentryAndroidOptions);
/* 47 */                c1279v1 = new C1279v1(C1272t0.m4939d(intent, sentryAndroidOptions), fM4937b != null ? Integer.valueOf(fM4937b.intValue()) : null);
/* 50 */                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = this.f10385e;
/* 58 */                if (c1279v1.equals(systemEventsBreadcrumbsIntegration.f9896W)) {
/* 60 */                    return;
                        } else {
/* 61 */                    systemEventsBreadcrumbsIntegration.f9896W = c1279v1;
                        }
                    }
/* 71 */            C1443f c1443f = new C1443f(System.currentTimeMillis());
/* 76 */            c1443f.f10930e = "system";
/* 80 */            c1443f.f10932i = "device.event";
/* 82 */            if (action != null) {
/* 85 */                int length = action.length();
/* 89 */                char[] cArr = this.f10384d;
/* 91 */                int length2 = cArr.length;
/* 92 */                int i2 = length - 1;
                        while (true) {
/* 94 */                    if (i2 >= 0) {
/* 96 */                        char cCharAt = action.charAt(i2);
/* 102 */                       if (cCharAt == '.') {
/* 108 */                           str = new String(cArr, length2, cArr.length - length2);
                                    break;
                                }
/* 112 */                       if (length2 == 0) {
/* 114 */                           Charset charset = AbstractC1716o.f11743a;
/* 118 */                           int iLastIndexOf = action.lastIndexOf(".");
/* 122 */                           if (iLastIndexOf >= 0 && action.length() > (i = iLastIndexOf + 1)) {
/* 132 */                               str = action.substring(i);
                                        break;
                                    }
                                    break;
                                }
/* 137 */                       length2--;
/* 139 */                       cArr[length2] = cCharAt;
/* 141 */                       i2--;
                            }
/* 144 */                   str = action;
                            break;
                        }
                    }
/* 145 */           if (str != null) {
/* 149 */               c1443f.m5209d(str, "action");
                    }
/* 152 */           if (c1279v1 != null) {
/* 154 */               Integer num = c1279v1.f10374a;
/* 156 */               if (num != null) {
/* 160 */                   c1443f.m5209d(num, FirebaseAnalytics.Param.LEVEL);
                        }
/* 163 */               Boolean bool = c1279v1.f10375b;
/* 165 */               if (bool != null) {
/* 169 */                   c1443f.m5209d(bool, "charging");
                        }
                    } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
/* 197 */               HashMap map = new HashMap(extras.size());
/* 212 */               for (String str2 : extras.keySet()) {
                            try {
/* 220 */                       Object obj = extras.get(str2);
/* 224 */                       if (obj != null) {
/* 230 */                           map.put(str2, obj.toString());
                                }
                            } catch (Throwable th) {
/* 247 */                       sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th, "%s key of the %s action threw an error.", str2, action);
                            }
                        }
/* 253 */               c1443f.m5209d(map, "extras");
                    }
/* 258 */           c1443f.f10934w = EnumC1553m5.INFO;
/* 262 */           C1486i0 c1486i0 = new C1486i0();
/* 267 */           c1486i0.m5275d(intent, "android:intent");
/* 272 */           this.f10381a.mo5086f(c1443f, c1486i0);
                }
            }
