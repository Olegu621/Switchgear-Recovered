            package p000;

            import android.R;
            import android.animation.ObjectAnimator;
            import android.animation.StateListAnimator;
            import android.content.res.Configuration;
            import android.graphics.Typeface;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.TotalCaptureResult;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Base64;
            import android.util.Range;
            import android.view.Surface;
            import android.view.View;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$integer;
            import com.google.android.material.appbar.AppBarLayout;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayOutputStream;
            import java.io.Closeable;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.TreeMap;
            import java.util.zip.DataFormatException;
            import java.util.zip.Deflater;
            import java.util.zip.DeflaterOutputStream;
            import java.util.zip.Inflater;
            import kotlin.Pair;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class jb1 implements r43 {

                /* JADX INFO: renamed from: a */
                public static volatile Handler f12169a;

                /* JADX INFO: renamed from: b */
                public static final byte[] f12170b = new byte[0];

                /* JADX INFO: renamed from: c */
                public static final C2131r4 f12171c = new C2131r4("NULL", 8);

                /* JADX INFO: renamed from: d */
                public static final int[] f12172d = {R.attr.stateListAnimator};

                /* JADX INFO: renamed from: e */
                public static q62 f12173e;

                /* JADX INFO: renamed from: A */
                public static final ArrayList m5735A(C0168b5 c0168b5, List list, boolean z) {
/* 1 */             c0168b5.getClass();
/* 4 */             list.getClass();
/* 9 */             if (z) {
/* 17 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 20 */                Iterator it = list.iterator();
/* 28 */                while (it.hasNext()) {
/* 40 */                    arrayList.add(m5766z(c0168b5, (v21) it.next()));
                        }
/* 44 */                return arrayList;
                    }
/* 51 */            ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list, 10));
/* 54 */            Iterator it2 = list.iterator();
/* 62 */            while (it2.hasNext()) {
/* 68 */                v21 v21Var = (v21) it2.next();
/* 70 */                v21Var.getClass();
/* 74 */                KSerializer kSerializerM6041Q = kb1.m6041Q(c0168b5, v21Var, false);
/* 78 */                if (kSerializerM6041Q == null) {
/* 80 */                    return null;
                        }
/* 82 */                arrayList2.add(kSerializerM6041Q);
                    }
/* 86 */            return arrayList2;
                }

                /* JADX INFO: renamed from: B */
                public static void m5736B(AppBarLayout appBarLayout, float f) {
/* 7 */             int integer = appBarLayout.getResources().getInteger(R$integer.app_bar_elevation_anim_duration);
/* 13 */            StateListAnimator stateListAnimator = new StateListAnimator();
                    long j = integer;
/* 46 */            stateListAnimator.addState(new int[]{R.attr.state_enabled, R$attr.state_liftable, -R$attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
/* 65 */            stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
/* 84 */            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
/* 87 */            appBarLayout.setStateListAnimator(stateListAnimator);
                }

                /* JADX INFO: renamed from: C */
                public static void m5737C(C2088pz c2088pz, View view, float[] fArr) {
/* 13 */            Class<?> cls = view.getClass();
/* 29 */            String str = "set" + c2088pz.f15342b;
                    try {
/* 35 */                int iM3520y = AbstractC0886en.m3520y(c2088pz.f15343c);
/* 41 */                Class cls2 = Integer.TYPE;
/* 43 */                Class cls3 = Float.TYPE;
/* 45 */                boolean z = true;
                        switch (iM3520y) {
                            case 0:
/* 354 */                       cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
/* 357 */                       return;
                            case 1:
/* 331 */                       cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
/* 334 */                       return;
                            case 2:
/* 309 */                       cls.getMethod(str, cls2).invoke(view, Integer.valueOf((m5753m((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m5753m((int) (fArr[3] * 255.0f)) << 24) | (m5753m((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m5753m((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
/* 312 */                       return;
                            case 3:
/* 147 */                       Method method = cls.getMethod(str, Drawable.class);
/* 213 */                       int iM5753m = (m5753m((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m5753m((int) (fArr[3] * 255.0f)) << 24) | (m5753m((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m5753m((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
/* 216 */                       ColorDrawable colorDrawable = new ColorDrawable();
/* 219 */                       colorDrawable.setColor(iM5753m);
/* 226 */                       method.invoke(view, colorDrawable);
/* 229 */                       return;
                            case 4:
/* 140 */                       throw new RuntimeException("unable to interpolate strings " + c2088pz.f15342b);
                            case 5:
/* 94 */                        Method method2 = cls.getMethod(str, Boolean.TYPE);
/* 104 */                       if (fArr[0] <= 0.5f) {
/* 107 */                           z = false;
                                }
/* 117 */                       method2.invoke(view, Boolean.valueOf(z));
/* 120 */                       return;
                            case 6:
/* 78 */                        cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
/* 81 */                        return;
                            default:
/* 416 */                       return;
                        }
                    } catch (IllegalAccessException e) {
/* 365 */               StringBuilder sbM3513q = AbstractC0886en.m3513q("cannot access method ", str, " on View \"");
/* 373 */               sbM3513q.append(de3.m3040v(view));
/* 376 */               sbM3513q.append("\"");
/* 383 */               AbstractC1245n0.m4876d("CustomSupport", sbM3513q.toString());
/* 386 */               e.printStackTrace();
                    } catch (NoSuchMethodException e2) {
/* 392 */               StringBuilder sbM3513q2 = AbstractC0886en.m3513q("no method ", str, " on View \"");
/* 400 */               sbM3513q2.append(de3.m3040v(view));
/* 403 */               sbM3513q2.append("\"");
/* 410 */               AbstractC1245n0.m4876d("CustomSupport", sbM3513q2.toString());
/* 413 */               e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
/* 359 */               e3.printStackTrace();
                    }
                }

                /* JADX INFO: renamed from: D */
                public static void m5738D(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
/* 5 */             if (status.m2006D1()) {
/* 7 */                 taskCompletionSource.setResult(obj);
                    } else {
/* 15 */                taskCompletionSource.setException(i13.m4438q(status));
                    }
                }

                /* JADX INFO: renamed from: E */
                public static String m5739E(String str, JSONObject jSONObject) {
/* 2 */             if (jSONObject != null && jSONObject.has(str)) {
                        try {
/* 11 */                    Object obj = jSONObject.get(str);
/* 17 */                    if (obj instanceof String) {
/* 19 */                        String str2 = (String) obj;
/* 25 */                        if (str2.isEmpty()) {
/* 1 */                             return null;
                                }
/* 28 */                        return str2;
                            }
/* 29 */                    if (obj != null && !(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
/* 39 */                        String strValueOf = String.valueOf(obj);
/* 47 */                        if (strValueOf.isEmpty()) {
/* 1 */                             return null;
                                }
/* 50 */                        return strValueOf;
                            }
                        } catch (JSONException unused) {
                        }
                    }
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: F */
                public static void m5740F(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
/* 1 */             byte[] bArr = new byte[i];
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 15 */                bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
                    }
/* 20 */            byteArrayOutputStream.write(bArr);
                }

                /* JADX INFO: renamed from: G */
                public static void m5741G(ByteArrayOutputStream byteArrayOutputStream, int i) {
/* 3 */             m5740F(byteArrayOutputStream, i, 2);
                }

                /* JADX WARN: Code duplicated, block: B:116:0x0170  */
                /* JADX INFO: renamed from: H */
                public static void m5742H(int i, TaskCompletionSource taskCompletionSource) {
/* 3 */             String strM7614x0 = py0.m7614x0(i);
/* 8 */             Status status = new Status(i, strM7614x0, null, null);
/* 12 */            int i2 = 8;
/* 14 */            if (i != 1) {
/* 17 */                if (i == 2) {
/* 384 */                   i2 = 26502;
                        } else if (i == 3) {
/* 381 */                   i2 = 26503;
                        } else if (i == 4) {
/* 378 */                   i2 = 26504;
                        } else if (i == 5) {
/* 375 */                   i2 = 26505;
                        } else if (i == 6) {
/* 372 */                   i2 = 26506;
                        } else if (i == 7) {
/* 369 */                   i2 = 26507;
                        } else if (i == 1500) {
/* 366 */                   i2 = 26540;
                        } else if (i == 1501) {
/* 363 */                   i2 = 26541;
                        } else if (i == 7) {
/* 369 */                   i2 = 26507;
                        } else if (i == 8) {
/* 360 */                   i2 = 26508;
                        } else if (i == 9) {
/* 357 */                   i2 = 26509;
                        } else if (i == 500) {
/* 354 */                   i2 = 26520;
                        } else if (i == 9006) {
/* 351 */                   i2 = 26625;
                        } else if (i == 9200) {
/* 348 */                   i2 = 26650;
                        } else if (i != 9202) {
                            switch (i) {
                                case 9000:
/* 342 */                           i2 = 26620;
                                    break;
                                case 9001:
/* 339 */                           i2 = 26621;
                                    break;
                                case 9002:
/* 336 */                           i2 = 26622;
                                    break;
                                case 9003:
/* 333 */                           i2 = 26623;
                                    break;
                                case 9004:
/* 330 */                           i2 = 26624;
                                    break;
                                default:
                                    switch (i) {
                                        case 9009:
/* 327 */                                   i2 = 26626;
                                            break;
                                        case 9010:
/* 324 */                                   i2 = 26627;
                                            break;
                                        case 9011:
/* 321 */                                   i2 = 26628;
                                            break;
                                        case 9012:
/* 318 */                                   i2 = 26629;
                                            break;
                                        default:
                                            switch (i) {
                                                case 9016:
/* 315 */                                           i2 = 26630;
                                                    break;
                                                case 9017:
/* 312 */                                           i2 = 26631;
                                                    break;
                                                case 9018:
/* 309 */                                           i2 = 26632;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 10000:
/* 305 */                                                   i2 = 26700;
                                                            break;
                                                        case 10001:
/* 301 */                                                   i2 = 26701;
                                                            break;
                                                        case 10002:
/* 297 */                                                   i2 = 26702;
                                                            break;
                                                        case 10003:
/* 293 */                                                   i2 = 26703;
                                                            break;
                                                        case 10004:
/* 289 */                                                   i2 = 26704;
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 1000:
/* 285 */                                                           i2 = 26530;
                                                                    break;
                                                                case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
/* 281 */                                                           i2 = 26531;
                                                                    break;
                                                                case 1002:
/* 277 */                                                           i2 = 26532;
                                                                    break;
                                                                case 1003:
/* 273 */                                                           i2 = 26533;
                                                                    break;
                                                                case 1004:
/* 269 */                                                           i2 = 26534;
                                                                    break;
                                                                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
/* 265 */                                                           i2 = 26535;
                                                                    break;
                                                                case 1006:
/* 261 */                                                           i2 = 26536;
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 2000:
/* 257 */                                                                   i2 = 26550;
                                                                            break;
                                                                        case 2001:
/* 253 */                                                                   i2 = 26551;
                                                                            break;
                                                                        case 2002:
/* 249 */                                                                   i2 = 26552;
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 3000:
/* 245 */                                                                           i2 = 26560;
                                                                                    break;
                                                                                case 3001:
/* 241 */                                                                           i2 = 26561;
                                                                                    break;
                                                                                case 3002:
/* 237 */                                                                           i2 = 26562;
                                                                                    break;
                                                                                case 3003:
/* 233 */                                                                           i2 = 26563;
                                                                                    break;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 4000:
/* 229 */                                                                                   i2 = 26570;
                                                                                            break;
                                                                                        case 4001:
/* 225 */                                                                                   i2 = 26571;
                                                                                            break;
                                                                                        case 4002:
/* 221 */                                                                                   i2 = 26572;
                                                                                            break;
                                                                                        case 4003:
/* 217 */                                                                                   i2 = 26573;
                                                                                            break;
                                                                                        case 4004:
/* 213 */                                                                                   i2 = 26574;
                                                                                            break;
                                                                                        case 4005:
/* 209 */                                                                                   i2 = 26575;
                                                                                            break;
                                                                                        case 4006:
/* 205 */                                                                                   i2 = 26576;
                                                                                            break;
                                                                                        default:
                                                                                            switch (i) {
                                                                                                case 6000:
/* 201 */                                                                                           i2 = 26580;
                                                                                                    break;
                                                                                                case 6001:
/* 197 */                                                                                           i2 = 26581;
                                                                                                    break;
                                                                                                case 6002:
/* 193 */                                                                                           i2 = 26582;
                                                                                                    break;
                                                                                                case 6003:
/* 189 */                                                                                           i2 = 26583;
                                                                                                    break;
                                                                                                case 6004:
/* 185 */                                                                                           i2 = 26584;
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (i) {
                                                                                                        case 6500:
/* 181 */                                                                                                   i2 = 26590;
                                                                                                            break;
                                                                                                        case 6501:
/* 177 */                                                                                                   i2 = 26591;
                                                                                                            break;
                                                                                                        case 6502:
/* 173 */                                                                                                   i2 = 26592;
                                                                                                            break;
                                                                                                        case 6503:
/* 169 */                                                                                                   i2 = 26593;
                                                                                                            break;
                                                                                                        case 6504:
/* 165 */                                                                                                   i2 = 26594;
                                                                                                            break;
                                                                                                        case 6505:
/* 161 */                                                                                                   i2 = 26595;
                                                                                                            break;
                                                                                                        case 6506:
/* 157 */                                                                                                   i2 = 26596;
                                                                                                            break;
                                                                                                        case 6507:
/* 153 */                                                                                                   i2 = 26597;
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (i) {
                                                                                                                case 7000:
/* 149 */                                                                                                           i2 = 26600;
                                                                                                                    break;
                                                                                                                case 7001:
/* 145 */                                                                                                           i2 = 26601;
                                                                                                                    break;
                                                                                                                case 7002:
/* 141 */                                                                                                           i2 = 26602;
                                                                                                                    break;
                                                                                                                case 7003:
/* 137 */                                                                                                           i2 = 26603;
                                                                                                                    break;
                                                                                                                case 7004:
/* 133 */                                                                                                           i2 = 26604;
                                                                                                                    break;
                                                                                                                case 7005:
/* 129 */                                                                                                           i2 = 26605;
                                                                                                                    break;
                                                                                                                case 7006:
/* 125 */                                                                                                           i2 = 26606;
                                                                                                                    break;
                                                                                                                case 7007:
/* 121 */                                                                                                           i2 = 26607;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (i) {
                                                                                                                        case 8000:
/* 117 */                                                                                                                   i2 = 26610;
                                                                                                                            break;
                                                                                                                        case 8001:
/* 113 */                                                                                                                   i2 = 26611;
                                                                                                                            break;
                                                                                                                        case 8002:
/* 109 */                                                                                                                   i2 = 26612;
                                                                                                                            break;
                                                                                                                        case 8003:
/* 105 */                                                                                                                   i2 = 26613;
                                                                                                                            break;
                                                                                                                        default:
/* 102 */                                                                                                                   i2 = i;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
/* 345 */                   i2 = 26652;
                        }
                    }
/* 386 */           if (i2 != i) {
/* 397 */               if (!py0.m7614x0(i).equals(strM7614x0)) {
                            switch (i) {
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 10:
                                    break;
                                case 9:
                                default:
/* 414 */                           status = new Status(i2, strM7614x0, null, null);
                                    break;
                            }
                        } else {
/* 405 */                   status = new Status(i2, hu0.m4337f0(i2), null, null);
                        }
                    }
/* 421 */           taskCompletionSource.setException(i13.m4438q(status));
                }

                /* JADX INFO: renamed from: I */
                public static void m5743I(TaskCompletionSource taskCompletionSource) {
/* 1 */             if (taskCompletionSource != null) {
/* 19 */                taskCompletionSource.trySetException(new C1020i9(new Status(4, hu0.m4337f0(4), null, null)));
                    }
                }

                /* JADX INFO: renamed from: d */
                public static void m5744d(CaptureRequest.Builder builder, nq1 nq1Var) {
/* 7 */             nq1 nq1VarM7021d = nq1.m7021d(C1974nr.m7034b(nq1Var).f14413b);
/* 23 */            for (C1888lf c1888lf : nq1VarM7021d.mo7024c()) {
/* 33 */                CaptureRequest.Key key = (CaptureRequest.Key) c1888lf.f13220c;
                        try {
/* 39 */                    builder.set(key, nq1VarM7021d.mo7025e(c1888lf));
                        } catch (IllegalArgumentException unused) {
/* 59 */                    hu0.m4325T("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public static void m5745e(CaptureRequest.Builder builder, int i, C1924me c1924me) {
                    Map mapUnmodifiableMap;
/* 2 */             if (i == 3 && c1924me.f13704a) {
/* 10 */                HashMap map = new HashMap();
/* 20 */                map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
/* 23 */                mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    } else {
/* 29 */                if (i != 4) {
/* 55 */                    c1924me.getClass();
                        } else if (c1924me.f13705b) {
/* 37 */                    HashMap map2 = new HashMap();
/* 47 */                    map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
/* 50 */                    mapUnmodifiableMap = Collections.unmodifiableMap(map2);
                        }
/* 58 */                mapUnmodifiableMap = Collections.EMPTY_MAP;
                    }
/* 72 */            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
/* 90 */                builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
                    }
                }

                /* JADX INFO: renamed from: f */
                public static final j11 m5746f(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 13 */            j11 j11Var = decoder instanceof j11 ? (j11) decoder : null;
/* 14 */            if (j11Var != null) {
/* 16 */                return j11Var;
                    }
/* 27 */            ds0.m3206w(j22.m5667a(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
/* 6 */             return null;
                }

                /* JADX INFO: renamed from: g */
                public static final p11 m5747g(Encoder encoder) {
/* 1 */             encoder.getClass();
/* 13 */            p11 p11Var = encoder instanceof p11 ? (p11) encoder : null;
/* 14 */            if (p11Var != null) {
/* 16 */                return p11Var;
                    }
/* 27 */            ds0.m3206w(j22.m5667a(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
/* 6 */             return null;
                }

                /* JADX INFO: renamed from: h */
                public static final void m5748h() {
/* 5 */             if (Looper.getMainLooper() == null) {
/* 7 */                 return;
                    }
/* 8 */             Looper mainLooper = Looper.getMainLooper();
/* 24 */            Intrinsics.m6216a(mainLooper != null ? mainLooper.getThread() : null, Thread.currentThread());
                }

                /* JADX INFO: renamed from: i */
                public static CaptureRequest m5749i(C1803jr c1803jr, CameraDevice cameraDevice, HashMap map, boolean z, C1924me c1924me) throws CameraAccessException {
                    CaptureRequest.Builder builderCreateCaptureRequest;
/* 2 */             if (cameraDevice != null) {
/* 5 */                 ArrayList arrayList = c1803jr.f12441a;
/* 7 */                 nq1 nq1Var = c1803jr.f12442b;
/* 9 */                 int i = c1803jr.f12443c;
/* 11 */                TreeMap treeMap = nq1Var.f14411a;
/* 13 */                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 19 */                ArrayList arrayList2 = new ArrayList();
/* 22 */                Iterator it = listUnmodifiableList.iterator();
/* 30 */                while (it.hasNext()) {
/* 42 */                    Surface surface = (Surface) map.get((d70) it.next());
/* 44 */                    if (surface == null) {
/* 52 */                        C1951n4.m6859j("DeferrableSurface not in configuredSurfaceMap");
/* 1 */                         return null;
                            }
/* 46 */                    arrayList2.add(surface);
                        }
/* 60 */                if (!arrayList2.isEmpty()) {
/* 63 */                    InterfaceC2188so interfaceC2188so = c1803jr.f12447g;
/* 70 */                    if (i == 5 && interfaceC2188so != null && (interfaceC2188so.mo1588i() instanceof TotalCaptureResult)) {
/* 82 */                        hu0.m4312F0("Camera2CaptureRequestBuilder");
/* 91 */                        builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) interfaceC2188so.mo1588i());
                            } else {
/* 96 */                        hu0.m4312F0("Camera2CaptureRequestBuilder");
/* 99 */                        if (i == 5) {
/* 106 */                           builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
                                } else {
/* 111 */                           builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
                                }
                            }
/* 115 */                   m5745e(builderCreateCaptureRequest, i, c1924me);
/* 118 */                   C1888lf c1888lf = C1803jr.f12440j;
/* 120 */                   Object objMo7025e = C2069pg.f15101f;
                            try {
/* 122 */                       objMo7025e = nq1Var.mo7025e(c1888lf);
                            } catch (IllegalArgumentException unused) {
                            }
/* 126 */                   Range range = (Range) objMo7025e;
/* 128 */                   Objects.requireNonNull(range);
/* 131 */                   Object objMo7025e2 = C2069pg.f15101f;
/* 137 */                   if (!range.equals(objMo7025e2)) {
/* 139 */                       CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                                try {
/* 143 */                           objMo7025e2 = nq1Var.mo7025e(C1803jr.f12440j);
                                } catch (IllegalArgumentException unused2) {
                                }
/* 147 */                       Range range2 = (Range) objMo7025e2;
/* 149 */                       Objects.requireNonNull(range2);
/* 152 */                       builderCreateCaptureRequest.set(key, range2);
                            }
/* 159 */                   if (c1803jr.m5892a() == 1 || c1803jr.m5893b() == 1) {
/* 207 */                       builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                            } else if (c1803jr.m5892a() == 2) {
/* 180 */                       builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
                            } else if (c1803jr.m5893b() == 2) {
/* 196 */                       builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                            }
/* 210 */                   C1888lf c1888lf2 = C1803jr.f12438h;
/* 216 */                   if (treeMap.containsKey(c1888lf2)) {
/* 226 */                       builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) nq1Var.mo7025e(c1888lf2));
                            }
/* 229 */                   C1888lf c1888lf3 = C1803jr.f12439i;
/* 235 */                   if (treeMap.containsKey(c1888lf3)) {
/* 253 */                       builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) nq1Var.mo7025e(c1888lf3)).byteValue()));
                            }
/* 256 */                   m5744d(builderCreateCaptureRequest, nq1Var);
/* 259 */                   Iterator it2 = arrayList2.iterator();
/* 267 */                   while (it2.hasNext()) {
/* 275 */                       builderCreateCaptureRequest.addTarget((Surface) it2.next());
                            }
/* 281 */                   builderCreateCaptureRequest.setTag(c1803jr.f12446f);
/* 284 */                   return builderCreateCaptureRequest.build();
                        }
                    }
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: j */
                public static HashMap m5750j(C0210cb c0210cb, String str) {
/* 3 */             HashMap map = new HashMap();
/* 23 */            c0210cb.getClass();
/* 51 */            map.put("Authorization", "Basic " + Base64.encodeToString((str + ":").getBytes(), 2));
/* 58 */            map.put("Accept", "application/vnd+hsapi-v2+json");
/* 61 */            return map;
                }

                /* JADX INFO: renamed from: k */
                public static CaptureRequest m5751k(C1803jr c1803jr, CameraDevice cameraDevice, C1924me c1924me) throws CameraAccessException {
/* 1 */             if (cameraDevice == null) {
/* 3 */                 return null;
                    }
/* 5 */             int i = c1803jr.f12443c;
/* 9 */             hu0.m4312F0("Camera2CaptureRequestBuilder");
/* 12 */            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
/* 16 */            m5745e(builderCreateCaptureRequest, i, c1924me);
/* 21 */            m5744d(builderCreateCaptureRequest, c1803jr.f12442b);
/* 24 */            return builderCreateCaptureRequest.build();
                }

                /* JADX INFO: renamed from: l */
                public static final byte m5752l(char c) {
/* 3 */             if (c < '~') {
/* 7 */                 return C1939mt.f14016b[c];
                    }
/* 10 */            return (byte) 0;
                }

                /* JADX INFO: renamed from: m */
                public static int m5753m(int i) {
/* 5 */             int i2 = (i & (~(i >> 31))) - 255;
/* 10 */            return (i2 & (i2 >> 31)) + 255;
                }

                /* JADX INFO: renamed from: n */
                public static final void m5754n(Closeable closeable, Throwable th) {
/* 1 */             if (closeable != null) {
/* 3 */                 if (th == null) {
/* 5 */                     closeable.close();
/* 8 */                     return;
                        }
                        try {
/* 9 */                     closeable.close();
                        } catch (Throwable th2) {
/* 14 */                    jf0.m5798a(th, th2);
                        }
                    }
                }

                /* JADX INFO: renamed from: o */
                public static byte[] m5755o(byte[] bArr) {
/* 4 */             Deflater deflater = new Deflater(1);
/* 9 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 14 */                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                        try {
/* 17 */                    deflaterOutputStream.write(bArr);
/* 20 */                    deflaterOutputStream.close();
/* 23 */                    deflater.end();
/* 26 */                    return byteArrayOutputStream.toByteArray();
                        } catch (Throwable th) {
                            try {
/* 34 */                        deflaterOutputStream.close();
                            } catch (Throwable th2) {
/* 39 */                        th.addSuppressed(th2);
                            }
/* 42 */                    throw th;
                        }
                    } catch (Throwable th3) {
/* 43 */                deflater.end();
/* 46 */                throw th3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:20:0x005b  */
                /* JADX INFO: renamed from: p */
                public static final KSerializer m5756p(mt1 mt1Var, Encoder encoder, Object obj) {
                    KSerializer kSerializer;
/* 1 */             mt1Var.getClass();
/* 4 */             obj.getClass();
/* 7 */             C0168b5 c0168b5Mo1497a = encoder.mo1497a();
/* 11 */            C0857dv c0857dv = mt1Var.f14021a;
/* 13 */            c0168b5Mo1497a.getClass();
/* 25 */            if (yy1.m10225t(c0857dv).isInstance(obj)) {
/* 36 */                Map map = (Map) ((Map) c0168b5Mo1497a.f2212c).get(c0857dv);
/* 55 */                kSerializer = map != null ? (KSerializer) map.get(j22.m5667a(obj.getClass())) : null;
/* 56 */                if (kSerializer == null) {
/* 59 */                    kSerializer = null;
                        }
/* 60 */                if (kSerializer == null) {
/* 67 */                    Object obj2 = ((Map) c0168b5Mo1497a.f2213d).get(c0857dv);
/* 81 */                    Function1 function1 = gs2.m4012c(1, obj2) ? (Function1) obj2 : null;
/* 82 */                    if (function1 != null) {
/* 89 */                        kSerializer = (KSerializer) function1.invoke(obj);
                            } else {
/* 92 */                        kSerializer = null;
                            }
                        }
                    } else {
/* 92 */                kSerializer = null;
                    }
/* 93 */            if (kSerializer != null) {
/* 117 */               return kSerializer;
                    }
/* 99 */            C0857dv c0857dvM5667a = j22.m5667a(obj.getClass());
/* 103 */           String strM3242b = c0857dvM5667a.m3242b();
/* 107 */           if (strM3242b == null) {
/* 109 */               strM3242b = String.valueOf(c0857dvM5667a);
                    }
/* 113 */           kb1.m6043S(strM3242b, c0857dv);
/* 116 */           throw null;
                }

                /* JADX INFO: renamed from: q */
                public static Handler m5757q() {
/* 3 */             if (f12169a != null) {
/* 5 */                 return f12169a;
                    }
                    synchronized (jb1.class) {
                        try {
/* 13 */                    if (f12169a == null) {
/* 23 */                        f12169a = he3.m4181b(Looper.getMainLooper());
                            }
                        } catch (Throwable th) {
/* 33 */                    throw th;
                        }
                    }
/* 29 */            return f12169a;
                }

                /* JADX INFO: renamed from: r */
                public static boolean m5758r() {
/* 1 */             String str = Build.MANUFACTURER;
/* 3 */             Locale locale = Locale.ENGLISH;
                    return str.toLowerCase(locale).equals("lge") || str.toLowerCase(locale).equals("samsung");
                }

                /* JADX INFO: renamed from: s */
                public static Typeface m5759s(Configuration configuration, Typeface typeface) {
/* 5 */             if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0) {
/* 47 */                return null;
                    }
/* 1 */             return Typeface.create(typeface, qj3.m7892c(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
                }

                /* JADX INFO: renamed from: t */
                public static void m5760t(JSONObject jSONObject, HashMap map) {
/* 1 */             if (jSONObject == null) {
/* 52 */                return;
                    }
/* 4 */             Iterator<String> itKeys = jSONObject.keys();
/* 12 */            while (itKeys.hasNext()) {
/* 14 */                String next = itKeys.next();
                        try {
/* 20 */                    Object obj = jSONObject.get(next);
/* 26 */                    if (obj instanceof String) {
/* 30 */                        map.put(next, (String) obj);
                            } else if (obj != null && !(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
/* 48 */                        map.put(next, String.valueOf(obj));
                            }
                        } catch (JSONException unused) {
                        }
                    }
                }

                /* JADX INFO: renamed from: u */
                public static final KSerializer m5761u(o21 o21Var, List list, ArrayList arrayList) {
                    KSerializer rt0Var;
                    KSerializer i22Var;
                    KSerializer b10Var;
/* 1 */             o21Var.getClass();
/* 4 */             list.getClass();
/* 59 */            if (o21Var.equals(j22.m5667a(Collection.class)) ? true : o21Var.equals(j22.m5667a(List.class)) ? true : o21Var.equals(j22.m5667a(List.class)) ? true : o21Var.equals(j22.m5667a(ArrayList.class))) {
/* 69 */                rt0Var = new C0950gd((KSerializer) arrayList.get(0), 0);
                    } else if (o21Var.equals(j22.m5667a(HashSet.class))) {
/* 94 */                rt0Var = new C0950gd((KSerializer) arrayList.get(0), 1);
                    } else {
/* 136 */               if (o21Var.equals(j22.m5667a(Set.class)) ? true : o21Var.equals(j22.m5667a(Set.class)) ? true : o21Var.equals(j22.m5667a(LinkedHashSet.class))) {
/* 146 */                   rt0Var = new C0950gd((KSerializer) arrayList.get(0), 2);
                        } else if (o21Var.equals(j22.m5667a(HashMap.class))) {
/* 177 */                   rt0Var = new rt0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
                        } else {
/* 218 */                   if (o21Var.equals(j22.m5667a(Map.class)) ? true : o21Var.equals(j22.m5667a(Map.class)) ? true : o21Var.equals(j22.m5667a(LinkedHashMap.class))) {
/* 234 */                       rt0Var = new rt0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
                            } else {
/* 249 */                       if (o21Var.equals(j22.m5667a(Map.Entry.class))) {
/* 255 */                           KSerializer kSerializer = (KSerializer) arrayList.get(0);
/* 261 */                           KSerializer kSerializer2 = (KSerializer) arrayList.get(1);
/* 263 */                           kSerializer.getClass();
/* 266 */                           kSerializer2.getClass();
/* 271 */                           i22Var = new ec1(kSerializer, kSerializer2, 0);
                                } else {
/* 287 */                           if (o21Var.equals(j22.m5667a(Pair.class))) {
/* 293 */                               KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
/* 299 */                               KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
/* 301 */                               kSerializer3.getClass();
/* 304 */                               kSerializer4.getClass();
/* 309 */                               b10Var = new ec1(kSerializer3, kSerializer4, 1);
                                    } else if (o21Var.equals(j22.m5667a(zr2.class))) {
/* 330 */                               KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
/* 336 */                               KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
/* 342 */                               KSerializer kSerializer7 = (KSerializer) arrayList.get(2);
/* 344 */                               kSerializer5.getClass();
/* 347 */                               kSerializer6.getClass();
/* 350 */                               kSerializer7.getClass();
/* 355 */                               b10Var = new b10(kSerializer5, kSerializer6, kSerializer7);
                                    } else if (yy1.m10224s(o21Var).isArray()) {
/* 377 */                               C0857dv c0857dv = ((js2) ((v21) list.get(0))).f12473a;
/* 383 */                               KSerializer kSerializer8 = (KSerializer) arrayList.get(0);
/* 385 */                               kSerializer8.getClass();
/* 390 */                               i22Var = new i22(c0857dv, kSerializer8);
                                    } else {
/* 394 */                               rt0Var = null;
                                    }
/* 312 */                           rt0Var = b10Var;
                                }
/* 274 */                       rt0Var = i22Var;
                            }
                        }
                    }
/* 395 */           if (rt0Var != null) {
/* 420 */               return rt0Var;
                    }
/* 399 */           Object[] array = arrayList.toArray(new KSerializer[0]);
/* 403 */           array.getClass();
/* 406 */           KSerializer[] kSerializerArr = (KSerializer[]) array;
/* 415 */           return i13.m4431h(o21Var, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
                }

                /* JADX INFO: renamed from: v */
                public static JSONObject m5762v(String str) {
/* 2 */             if (str != null && !str.isEmpty()) {
                        try {
/* 17 */                    return new JSONObject(str.trim());
                        } catch (JSONException unused) {
                        }
                    }
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: w */
                public static byte[] m5763w(InputStream inputStream, int i) throws IOException {
/* 1 */             byte[] bArr = new byte[i];
/* 3 */             int i2 = 0;
/* 4 */             while (i2 < i) {
/* 8 */                 int i3 = inputStream.read(bArr, i2, i - i2);
/* 12 */                if (i3 < 0) {
/* 22 */                    f42.m3656l(fm0.m3781g(i, "Not enough bytes to read: "));
/* 25 */                    return null;
                        }
/* 14 */                i2 += i3;
                    }
/* 27 */            return bArr;
                }

                /* JADX INFO: renamed from: x */
                public static byte[] m5764x(FileInputStream fileInputStream, int i, int i2) {
/* 3 */             Inflater inflater = new Inflater();
                    try {
/* 6 */                 byte[] bArr = new byte[i2];
/* 10 */                byte[] bArr2 = new byte[2048];
/* 13 */                int i3 = 0;
/* 14 */                int iInflate = 0;
/* 19 */                while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
/* 29 */                    int i4 = fileInputStream.read(bArr2);
/* 33 */                    if (i4 < 0) {
/* 87 */                        throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                            }
/* 35 */                    inflater.setInput(bArr2, 0, i4);
                            try {
/* 44 */                        iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
/* 45 */                        i3 += i4;
                            } catch (DataFormatException e) {
/* 59 */                        throw new IllegalStateException(e.getMessage());
                            }
                        }
/* 88 */                if (i3 == i) {
/* 94 */                    if (!inflater.finished()) {
/* 107 */                       throw new IllegalStateException("Inflater did not finish");
                            }
/* 96 */                    inflater.end();
/* 99 */                    return bArr;
                        }
/* 138 */               throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
                    } catch (Throwable th) {
/* 139 */               inflater.end();
/* 142 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: y */
                public static long m5765y(InputStream inputStream, int i) {
/* 1 */             byte[] bArrM5763w = m5763w(inputStream, i);
/* 5 */             long j = 0;
/* 8 */             for (int i2 = 0; i2 < i; i2++) {
/* 18 */                j += ((long) (bArrM5763w[i2] & 255)) << (i2 * 8);
                    }
/* 22 */            return j;
                }

                /* JADX INFO: renamed from: z */
                public static final KSerializer m5766z(C0168b5 c0168b5, v21 v21Var) {
/* 1 */             c0168b5.getClass();
/* 4 */             v21Var.getClass();
/* 8 */             KSerializer kSerializerM6041Q = kb1.m6041Q(c0168b5, v21Var, true);
/* 12 */            if (kSerializerM6041Q != null) {
/* 14 */                return kSerializerM6041Q;
                    }
/* 19 */            xe2.m9761E(((js2) v21Var).f12473a);
/* 23 */            throw null;
                }

                @Override // p000.r43
                /* JADX INFO: renamed from: a */
                public void mo1184a() {
                }

                @Override // p000.r43
                /* JADX INFO: renamed from: b */
                public void mo1185b() {
                }
            }
