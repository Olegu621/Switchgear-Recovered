            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Trace;
            import android.util.Base64;
            import android.util.Xml;
            import android.view.View;
            import android.view.ViewParent;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.TextView;
            import androidx.core.R$styleable;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.lang.reflect.Proxy;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1843d;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.KSerializer;
            import okio.Utf8;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j13 {

                /* JADX INFO: renamed from: f */
                public static final C2131r4 f11996f;

                /* JADX INFO: renamed from: g */
                public static final C2131r4 f11997g;

                /* JADX INFO: renamed from: h */
                public static final C2131r4 f11998h;

                /* JADX INFO: renamed from: i */
                public static final C2131r4 f11999i;

                /* JADX INFO: renamed from: j */
                public static final C2131r4 f12000j;

                /* JADX INFO: renamed from: n */
                public static Method f12004n = null;

                /* JADX INFO: renamed from: o */
                public static boolean f12005o = false;

                /* JADX INFO: renamed from: t */
                public static boolean f12010t = true;

                /* JADX INFO: renamed from: u */
                public static long f12011u;

                /* JADX INFO: renamed from: v */
                public static Method f12012v;

                /* JADX INFO: renamed from: w */
                public static Method f12013w;

                /* JADX INFO: renamed from: x */
                public static Method f12014x;

                /* JADX INFO: renamed from: y */
                public static Method f12015y;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12016a;

                /* JADX INFO: renamed from: b */
                public static final float[][] f11992b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

                /* JADX INFO: renamed from: c */
                public static final float[][] f11993c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

                /* JADX INFO: renamed from: d */
                public static final float[] f11994d = {95.047f, 100.0f, 108.883f};

                /* JADX INFO: renamed from: e */
                public static final float[][] f11995e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

                /* JADX INFO: renamed from: k */
                public static final kd0 f12001k = new kd0(false);

                /* JADX INFO: renamed from: l */
                public static final kd0 f12002l = new kd0(true);

                /* JADX INFO: renamed from: m */
                public static final Object f12003m = new Object();

                /* JADX INFO: renamed from: p */
                public static final String[] f12006p = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

                /* JADX INFO: renamed from: q */
                public static final String[] f12007q = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

                /* JADX INFO: renamed from: r */
                public static final String[] f12008r = {FirebaseAnalytics.Param.ITEMS};

                /* JADX INFO: renamed from: s */
                public static final String[] f12009s = {FirebaseAnalytics.Param.AFFILIATION, FirebaseAnalytics.Param.COUPON, FirebaseAnalytics.Param.CREATIVE_NAME, FirebaseAnalytics.Param.CREATIVE_SLOT, FirebaseAnalytics.Param.CURRENCY, "_ct", FirebaseAnalytics.Param.DISCOUNT, FirebaseAnalytics.Param.INDEX, FirebaseAnalytics.Param.ITEM_ID, FirebaseAnalytics.Param.ITEM_BRAND, FirebaseAnalytics.Param.ITEM_CATEGORY, FirebaseAnalytics.Param.ITEM_CATEGORY2, FirebaseAnalytics.Param.ITEM_CATEGORY3, FirebaseAnalytics.Param.ITEM_CATEGORY4, FirebaseAnalytics.Param.ITEM_CATEGORY5, FirebaseAnalytics.Param.ITEM_LIST_NAME, FirebaseAnalytics.Param.ITEM_LIST_ID, FirebaseAnalytics.Param.ITEM_NAME, FirebaseAnalytics.Param.ITEM_VARIANT, FirebaseAnalytics.Param.LOCATION_ID, FirebaseAnalytics.Param.PAYMENT_TYPE, FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.PROMOTION_ID, FirebaseAnalytics.Param.PROMOTION_NAME, FirebaseAnalytics.Param.QUANTITY, FirebaseAnalytics.Param.SHIPPING, FirebaseAnalytics.Param.SHIPPING_TIER, FirebaseAnalytics.Param.TAX, FirebaseAnalytics.Param.TRANSACTION_ID, FirebaseAnalytics.Param.VALUE, "item_list", "checkout_step", "checkout_option", "item_location_id"};

                static {
/* 76 */            int i = 8;
/* 81 */            f11996f = new C2131r4("COMPLETING_ALREADY", i);
/* 90 */            f11997g = new C2131r4("COMPLETING_WAITING_CHILDREN", i);
/* 99 */            f11998h = new C2131r4("COMPLETING_RETRY", i);
/* 108 */           f11999i = new C2131r4("TOO_LATE_TO_CANCEL", i);
/* 117 */           f12000j = new C2131r4("SEALED", i);
                }

                public /* synthetic */ j13(int i) {
/* 1 */             this.f12016a = i;
                }

                /* JADX INFO: renamed from: A */
                public static String m5636A(String str) {
                    return str.length() <= 127 ? str : str.substring(0, 127);
                }

                /* JADX INFO: renamed from: B */
                public static final Object m5637B(Object obj) {
                    ix0 ix0Var;
/* 9 */             jx0 jx0Var = obj instanceof jx0 ? (jx0) obj : null;
                    return (jx0Var == null || (ix0Var = jx0Var.f12532a) == null) ? obj : ix0Var;
                }

                /* JADX INFO: renamed from: C */
                public static final kx2 m5638C(c10 c10Var, CoroutineContext coroutineContext, Object obj) {
/* 3 */             kx2 kx2Var = null;
/* 4 */             if ((c10Var instanceof a20) && coroutineContext.get(lx2.f13526a) != null) {
/* 15 */                a20 callerFrame = (a20) c10Var;
/* 19 */                while (!(callerFrame instanceof q80) && (callerFrame = callerFrame.getCallerFrame()) != null) {
/* 31 */                    if (callerFrame instanceof kx2) {
/* 34 */                        kx2Var = (kx2) callerFrame;
                                break;
                            }
                        }
/* 36 */                if (kx2Var != null) {
/* 38 */                    kx2Var.m6306Y(coroutineContext, obj);
                        }
                    }
/* 41 */            return kx2Var;
                }

                /* JADX INFO: renamed from: D */
                public static float m5639D() {
/* 15 */            return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
                }

                /* JADX INFO: renamed from: E */
                public static boolean m5640E(byte b) {
                    return b > -65;
                }

                /* JADX INFO: renamed from: a */
                public static String m5641a(String str, Object... objArr) {
                    int length;
                    int length2;
                    int iIndexOf;
                    String strM3785k;
/* 1 */             int i = 0;
/* 2 */             int i2 = 0;
                    while (true) {
/* 3 */                 length = objArr.length;
/* 4 */                 if (i2 >= length) {
                            break;
                        }
/* 6 */                 Object obj = objArr[i2];
/* 8 */                 if (obj == null) {
/* 10 */                    strM3785k = "null";
                        } else {
                            try {
/* 13 */                        strM3785k = obj.toString();
                            } catch (Exception e) {
/* 38 */                        String strM3508l = AbstractC0886en.m3508l(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
/* 60 */                        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM3508l), (Throwable) e);
/* 77 */                        strM3785k = fm0.m3785k("<", strM3508l, " threw ", e.getClass().getName(), ">");
                            }
                        }
/* 81 */                objArr[i2] = strM3785k;
/* 83 */                i2++;
                    }
/* 95 */            StringBuilder sb = new StringBuilder(str.length() + (length * 16));
/* 98 */            int i3 = 0;
                    while (true) {
/* 99 */                length2 = objArr.length;
/* 100 */               if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                            break;
                        }
/* 112 */               sb.append((CharSequence) str, i3, iIndexOf);
/* 119 */               sb.append(objArr[i]);
/* 115 */               i++;
/* 122 */               i3 = iIndexOf + 2;
                    }
/* 132 */           sb.append((CharSequence) str, i3, str.length());
/* 135 */           if (i < length2) {
/* 139 */               sb.append(" [");
/* 146 */               sb.append(objArr[i]);
/* 150 */               for (int i4 = i + 1; i4 < objArr.length; i4++) {
/* 154 */                   sb.append(", ");
/* 161 */                   sb.append(objArr[i4]);
                        }
/* 168 */               sb.append(']');
                    }
/* 171 */           return sb.toString();
                }

                /* JADX INFO: renamed from: b */
                public static Object m5642b(Class cls, InvocationHandler invocationHandler) {
/* 1 */             if (invocationHandler == null) {
/* 3 */                 return null;
                    }
/* 19 */            return cls.cast(Proxy.newProxyInstance(j13.class.getClassLoader(), new Class[]{cls}, invocationHandler));
                }

                /* JADX INFO: renamed from: c */
                public static final void m5643c(int i) {
/* 2 */             if (i >= 1) {
/* 4 */                 return;
                    }
/* 11 */            ds0.m3200q(fm0.m3781g(i, "Expected positive parallelism level, but got "));
                }

                /* JADX INFO: renamed from: d */
                public static n62 m5644d(Bundle bundle, Bundle bundle2) {
/* 1 */             if (bundle == null) {
/* 3 */                 if (bundle2 == null) {
/* 7 */                     return new n62();
                        }
/* 13 */                HashMap map = new HashMap();
/* 28 */                for (String str : bundle2.keySet()) {
/* 36 */                    str.getClass();
/* 43 */                    map.put(str, bundle2.get(str));
                        }
/* 49 */                return new n62(map);
                    }
/* 55 */            ClassLoader classLoader = n62.class.getClassLoader();
/* 59 */            classLoader.getClass();
/* 62 */            bundle.setClassLoader(classLoader);
/* 67 */            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
/* 73 */            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
/* 77 */            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
/* 130 */               f42.m3656l("Invalid bundle passed as restored state");
/* 133 */               return null;
                    }
/* 93 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 96 */            int size = parcelableArrayList.size();
/* 101 */           for (int i = 0; i < size; i++) {
/* 103 */               Object obj = parcelableArrayList.get(i);
/* 107 */               obj.getClass();
/* 116 */               linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                    }
/* 124 */           return new n62(linkedHashMap);
                }

                /* JADX INFO: renamed from: g */
                public static final CoroutineContext m5645g(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
/* 1 */             Boolean bool = Boolean.FALSE;
/* 3 */             p10 p10Var = p10.f14947a;
/* 11 */            boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, p10Var)).booleanValue();
/* 21 */            boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, p10Var)).booleanValue();
/* 25 */            if (!zBooleanValue && !zBooleanValue2) {
/* 29 */                return coroutineContext.plus(coroutineContext2);
                    }
/* 36 */            h22 h22Var = new h22();
/* 39 */            h22Var.f8873a = coroutineContext2;
/* 41 */            C1846g c1846g = C1846g.f12919a;
/* 53 */            CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(c1846g, new o10(2));
/* 55 */            if (zBooleanValue2) {
/* 67 */                h22Var.f8873a = ((CoroutineContext) h22Var.f8873a).fold(c1846g, n10.f14091a);
                    }
/* 73 */            return coroutineContext3.plus((CoroutineContext) h22Var.f8873a);
                }

                /* JADX INFO: renamed from: h */
                public static RunnableC1901ls m5646h(Context context) {
                    C2466xm c2466xmM7599Y;
/* 1 */             context.getClass();
/* 4 */             sx1 sx1Var = sx1.f16851g;
                    synchronized (sx1Var.f16852a) {
/* 9 */                 c2466xmM7599Y = sx1Var.f16853b;
/* 11 */                if (c2466xmM7599Y == null) {
/* 27 */                    c2466xmM7599Y = py0.m7599Y(new C2076pn(10, sx1Var, new C2303vq(context)));
/* 31 */                    sx1Var.f16853b = c2466xmM7599Y;
                        }
                    }
/* 44 */            C2357x6 c2357x6 = new C2357x6(new nd1(context, 1), 12);
/* 56 */            return w11.m9399I(c2466xmM7599Y, new gr0(c2357x6), pg3.m7428g());
                }

                /* JADX INFO: renamed from: i */
                public static final KSerializer m5647i(KSerializer kSerializer) {
/* 1 */             kSerializer.getClass();
                    return kSerializer.getDescriptor().mo132c() ? kSerializer : new bp1(kSerializer);
                }

                /* JADX INFO: renamed from: j */
                public static void m5648j(Exception exc) {
/* 3 */             if (exc instanceof InvocationTargetException) {
/* 5 */                 Throwable cause = exc.getCause();
/* 11 */                if (cause instanceof RuntimeException) {
/* 19 */                    throw ((RuntimeException) cause);
                        }
/* 13 */                ds0.m3199p(cause);
                    }
                }

                /* JADX INFO: renamed from: k */
                public static int m5649k(float f) {
/* 5 */             if (f < 1.0f) {
/* 7 */                 return -16777216;
                    }
/* 14 */            if (f > 99.0f) {
/* 16 */                return -1;
                    }
/* 24 */            float f2 = (f + 16.0f) / 116.0f;
/* 38 */            float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
/* 41 */            float f4 = f2 * f2 * f2;
/* 53 */            boolean z = f4 > 0.008856452f;
/* 61 */            float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
/* 62 */            if (!z) {
/* 67 */                f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
                    }
/* 69 */            float[] fArr = f11994d;
/* 84 */            return AbstractC0196bx.m1449a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
                }

                /* JADX INFO: renamed from: l */
                public static boolean m5650l() {
                    return Build.VERSION.SDK_INT >= 26;
                }

                /* JADX INFO: renamed from: m */
                public static boolean m5651m() {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 7 */                 return nq2.m7032c();
                    }
                    try {
/* 19 */                if (f12012v == null) {
/* 31 */                    f12011u = Trace.class.getField("TRACE_TAG_APP").getLong(null);
/* 43 */                    f12012v = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                        }
/* 63 */                return ((Boolean) f12012v.invoke(null, Long.valueOf(f12011u))).booleanValue();
                    } catch (Exception e) {
/* 69 */                m5648j(e);
/* 72 */                return false;
                    }
                }

                /* JADX INFO: renamed from: n */
                public static float m5652n(int i) {
/* 4 */             float f = i / 255.0f;
/* 18 */            return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
                }

                /* JADX INFO: renamed from: o */
                public static final CoroutineContext m5653o(y10 y10Var, CoroutineContext coroutineContext) {
/* 6 */             CoroutineContext coroutineContextM5645g = m5645g(y10Var.mo4406c(), coroutineContext, true);
/* 10 */            m60 m60Var = z80.f19975a;
                    return (coroutineContextM5645g == m60Var || coroutineContextM5645g.get(InterfaceC1843d.f12918S) != null) ? coroutineContextM5645g : coroutineContextM5645g.plus(m60Var);
                }

                /* JADX INFO: renamed from: p */
                public static void m5654p(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
/* 1 */             if (inputConnection == null || editorInfo.hintText != null) {
/* 20 */                return;
                    }
/* 13 */            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
                    }
                }

                /* JADX INFO: renamed from: q */
                public static rl0 m5655q(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
                    int next;
/* 11 */            do {
/* 3 */                 next = xmlResourceParser.next();
/* 9 */                 if (next == 2) {
                            break;
                        }
/* 11 */            } while (next != 1);
/* 14 */            if (next != 2) {
/* 322 */               throw new XmlPullParserException("No start tag found");
                    }
/* 21 */            xmlResourceParser.require(2, null, "font-family");
/* 32 */            if (!xmlResourceParser.getName().equals("font-family")) {
/* 311 */               m5661w(xmlResourceParser);
/* 16 */                return null;
                    }
/* 40 */            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamily);
/* 46 */            String string = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderAuthority);
/* 52 */            String string2 = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderPackage);
/* 58 */            String string3 = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderQuery);
/* 65 */            int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.FontFamily_fontProviderCerts, 0);
/* 71 */            int integer = typedArrayObtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchStrategy, 1);
/* 79 */            int integer2 = typedArrayObtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchTimeout, 500);
/* 85 */            String string4 = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderSystemFontFamily);
/* 89 */            typedArrayObtainAttributes.recycle();
/* 93 */            if (string != null && string2 != null && string3 != null) {
/* 103 */               while (xmlResourceParser.next() != 3) {
/* 105 */                   m5661w(xmlResourceParser);
                        }
/* 120 */               return new ul0(new C0168b5(string, string2, string3, m5656r(resources, resourceId)), integer, integer2, string4);
                    }
/* 126 */           ArrayList arrayList = new ArrayList();
/* 133 */           while (xmlResourceParser.next() != 3) {
/* 139 */               if (xmlResourceParser.getEventType() == 2) {
/* 152 */                   if (xmlResourceParser.getName().equals("font")) {
/* 160 */                       TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamilyFont);
/* 179 */                       int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontWeight) ? R$styleable.FontFamilyFont_fontWeight : R$styleable.FontFamilyFont_android_fontWeight, 400);
/* 205 */                       boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontStyle) ? R$styleable.FontFamilyFont_fontStyle : R$styleable.FontFamilyFont_android_fontStyle, 0);
/* 218 */                       int i2 = typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_ttcIndex) ? R$styleable.FontFamilyFont_ttcIndex : R$styleable.FontFamilyFont_android_ttcIndex;
/* 233 */                       String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontVariationSettings) ? R$styleable.FontFamilyFont_fontVariationSettings : R$styleable.FontFamilyFont_android_fontVariationSettings);
/* 237 */                       int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
/* 252 */                       int i4 = typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_font) ? R$styleable.FontFamilyFont_font : R$styleable.FontFamilyFont_android_font;
/* 254 */                       int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
/* 258 */                       String string6 = typedArrayObtainAttributes2.getString(i4);
/* 262 */                       typedArrayObtainAttributes2.recycle();
/* 269 */                       while (xmlResourceParser.next() != 3) {
/* 271 */                           m5661w(xmlResourceParser);
                                }
/* 280 */                       arrayList.add(new tl0(i, i3, resourceId2, string6, string5, z));
                            } else {
/* 285 */                       m5661w(xmlResourceParser);
                            }
                        }
                    }
/* 294 */           if (arrayList.isEmpty()) {
/* 16 */                return null;
                    }
/* 307 */           return new sl0((tl0[]) arrayList.toArray(new tl0[0]));
                }

                /* JADX INFO: renamed from: r */
                public static List m5656r(Resources resources, int i) {
/* 1 */             if (i == 0) {
/* 3 */                 return Collections.EMPTY_LIST;
                    }
/* 6 */             TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
                    try {
/* 14 */                if (typedArrayObtainTypedArray.length() == 0) {
/* 16 */                    return Collections.EMPTY_LIST;
                        }
/* 26 */                ArrayList arrayList = new ArrayList();
/* 35 */                if (ql0.m7941a(typedArrayObtainTypedArray, 0) == 1) {
/* 42 */                    for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
/* 44 */                        int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
/* 48 */                        if (resourceId != 0) {
/* 50 */                            String[] stringArray = resources.getStringArray(resourceId);
/* 56 */                            ArrayList arrayList2 = new ArrayList();
/* 61 */                            for (String str : stringArray) {
/* 69 */                                arrayList2.add(Base64.decode(str, 0));
                                    }
/* 75 */                            arrayList.add(arrayList2);
                                }
                            }
                        } else {
/* 81 */                    String[] stringArray2 = resources.getStringArray(i);
/* 87 */                    ArrayList arrayList3 = new ArrayList();
/* 92 */                    for (String str2 : stringArray2) {
/* 100 */                       arrayList3.add(Base64.decode(str2, 0));
                            }
/* 106 */                   arrayList.add(arrayList3);
                        }
/* 112 */               return arrayList;
                    } finally {
/* 113 */               typedArrayObtainTypedArray.recycle();
                    }
                }

                /* JADX INFO: renamed from: s */
                public static final void m5657s(C0890er c0890er, c10 c10Var, boolean z) {
                    Object objMo3559h;
/* 1 */             Object objM3570t = c0890er.m3570t();
/* 5 */             Throwable thMo3558g = c0890er.mo3558g(objM3570t);
/* 9 */             if (thMo3558g != null) {
/* 11 */                m42 m42Var = o42.f14612b;
/* 15 */                objMo3559h = new n42(thMo3558g);
                    } else {
/* 19 */                m42 m42Var2 = o42.f14612b;
/* 21 */                objMo3559h = c0890er.mo3559h(objM3570t);
                    }
/* 25 */            if (!z) {
/* 84 */                c10Var.resumeWith(objMo3559h);
/* 87 */                return;
                    }
/* 27 */            c10Var.getClass();
/* 30 */            p80 p80Var = (p80) c10Var;
/* 32 */            d10 d10Var = p80Var.f15020e;
/* 34 */            Object obj = p80Var.f15022i;
/* 36 */            CoroutineContext context = d10Var.getContext();
/* 40 */            Object objM1741c = co2.m1741c(context, obj);
/* 53 */            kx2 kx2VarM5638C = objM1741c != co2.f3022a ? m5638C(d10Var, context, objM1741c) : null;
                    try {
/* 54 */                d10Var.resumeWith(objMo3559h);
                    } finally {
/* 72 */                if (kx2VarM5638C == null || kx2VarM5638C.m6305X()) {
/* 80 */                    co2.m1739a(context, objM1741c);
                        }
                    }
                }

                /* JADX INFO: renamed from: t */
                public static final void m5658t(ty0 ty0Var) {
/* 1 */             ty0Var.getClass();
/* 4 */             az0 az0Var = az0.f2143a;
                }

                /* JADX INFO: renamed from: u */
                public static final void m5659u(rh2 rh2Var) {
/* 1 */             rh2Var.getClass();
/* 4 */             vh2 vh2Var = vh2.f18183a;
                }

                /* JADX INFO: renamed from: v */
                public static void m5660v(int i, String str) {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 11 */                nq2.m7033d(i, m5636A(str));
/* 14 */                return;
                    }
/* 15 */            String strM5636A = m5636A(str);
                    try {
/* 23 */                if (f12015y == null) {
/* 41 */                    f12015y = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                        }
/* 60 */                f12015y.invoke(null, Long.valueOf(f12011u), strM5636A, Integer.valueOf(i));
                    } catch (Exception e) {
/* 65 */                m5648j(e);
                    }
                }

                /* JADX INFO: renamed from: w */
                public static void m5661w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
/* 1 */             int i = 1;
/* 2 */             while (i > 0) {
/* 4 */                 int next = xmlPullParser.next();
/* 9 */                 if (next == 2) {
/* 18 */                    i++;
                        } else if (next == 3) {
/* 15 */                    i--;
                        }
                    }
                }

                /* JADX INFO: renamed from: x */
                public static final long m5662x(String str, long j, long j2, long j3) {
                    String property;
/* 1 */             int i = ik2.f9695a;
                    try {
/* 3 */                 property = System.getProperty(str);
                    } catch (SecurityException unused) {
/* 8 */                 property = null;
                    }
/* 9 */             if (property == null) {
/* 11 */                return j;
                    }
/* 12 */            Long lM6238N = StringsKt.m6238N(property);
/* 20 */            if (lM6238N == null) {
/* 116 */               throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
                    }
/* 22 */            long jLongValue = lM6238N.longValue();
/* 28 */            if (j2 <= jLongValue && jLongValue <= j3) {
/* 34 */                return jLongValue;
                    }
/* 83 */            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
                }

                /* JADX INFO: renamed from: y */
                public static int m5663y(int i, int i2, String str) {
/* 21 */            return (int) m5662x(str, i, 1L, (i2 & 8) != 0 ? AbstractC0208c9.API_PRIORITY_OTHER : 2097150);
                }

                /* JADX INFO: renamed from: z */
                public static void m5664z(AbstractC1934mo abstractC1934mo, ArrayList arrayList) {
/* 3 */             if (abstractC1934mo instanceof AbstractC1971no) {
/* 27 */                throw null;
                    }
/* 7 */             if (abstractC1934mo instanceof C1001hr) {
/* 13 */                arrayList.add(((C1001hr) abstractC1934mo).f9208a);
                    } else {
/* 22 */                arrayList.add(new C0150ao(abstractC1934mo));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:106:0x0064 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:20:0x004a  */
                /* JADX WARN: Code duplicated, block: B:24:0x0057  */
                /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:31:0x006d  */
                /* JADX WARN: Code duplicated, block: B:44:0x009b  */
                /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
                /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
                /* JADX WARN: Code duplicated, block: B:80:0x0067 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:83:0x0050 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:84:0x0093 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:85:0x008e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:86:0x00d9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:87:0x00d4 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:92:0x006b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:96:0x0097 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:97:0x0132 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:98:0x012d A[SYNTHETIC] */
                /* JADX INFO: renamed from: e */
                public final String m5665e(byte[] bArr, int i, int i2) throws qz0 {
                    int i3;
                    byte b;
                    int i4;
                    byte b2;
                    byte b3;
                    byte b4;
                    switch (this.f12016a) {
                        case 0:
/* 50 */                    if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
/* 337 */                       C1697u2.m5440p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 340 */                       return null;
                            }
/* 52 */                    int i5 = i + i2;
/* 54 */                    char[] cArr = new char[i2];
/* 57 */                    int i6 = 0;
/* 58 */                    while (i < i5) {
/* 60 */                        byte b5 = bArr[i];
/* 62 */                        if (b5 < 0) {
/* 73 */                            while (i < i5) {
/* 75 */                                i3 = i + 1;
/* 77 */                                b = bArr[i];
/* 79 */                                if (b < 0) {
/* 81 */                                    i4 = i6 + 1;
/* 84 */                                    cArr[i6] = (char) b;
/* 86 */                                    while (i3 < i5) {
/* 88 */                                        b2 = bArr[i3];
/* 90 */                                        if (b2 >= 0) {
/* 92 */                                            i3++;
/* 97 */                                            cArr[i4] = (char) b2;
/* 94 */                                            i4++;
                                                } else {
/* 101 */                                           i6 = i4;
/* 102 */                                           i = i3;
                                                }
                                            }
/* 101 */                                   i6 = i4;
/* 102 */                                   i = i3;
                                        } else if (b < -32) {
/* 108 */                                   if (i3 < i5) {
/* 147 */                                       throw qz0.m8029a();
                                            }
/* 110 */                                   i += 2;
/* 112 */                                   byte b6 = bArr[i3];
/* 114 */                                   int i7 = i6 + 1;
/* 118 */                                   if (b >= -62 || w11.m9451u(b6)) {
/* 142 */                                       throw qz0.m8029a();
                                            }
/* 134 */                                   cArr[i6] = (char) ((b6 & Utf8.REPLACEMENT_BYTE) | ((b & 31) << 6));
/* 136 */                                   i6 = i7;
                                        } else {
/* 150 */                                   if (b >= -16) {
/* 220 */                                       if (i3 < i5 - 2) {
/* 311 */                                           throw qz0.m8029a();
                                                }
/* 224 */                                       b4 = bArr[i3];
/* 226 */                                       int i8 = i + 3;
/* 228 */                                       byte b7 = bArr[i + 2];
/* 230 */                                       i += 4;
/* 232 */                                       byte b8 = bArr[i8];
/* 234 */                                       int i9 = i6 + 1;
/* 240 */                                       if (!w11.m9451u(b4)) {
/* 249 */                                           if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !w11.m9451u(b7) && !w11.m9451u(b8)) {
/* 279 */                                               int i10 = ((b4 & Utf8.REPLACEMENT_BYTE) << 12) | ((b & 7) << 18) | ((b7 & Utf8.REPLACEMENT_BYTE) << 6) | (b8 & Utf8.REPLACEMENT_BYTE);
/* 287 */                                               cArr[i6] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
/* 296 */                                               cArr[i9] = (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
/* 298 */                                               i6 += 2;
                                                    }
                                                }
/* 306 */                                       throw qz0.m8029a();
                                            }
/* 154 */                                   if (i3 < i5 - 1) {
/* 217 */                                       throw qz0.m8029a();
                                            }
/* 156 */                                   int i11 = i + 2;
/* 158 */                                   b3 = bArr[i3];
/* 160 */                                   i += 3;
/* 162 */                                   byte b9 = bArr[i11];
/* 164 */                                   int i12 = i6 + 1;
/* 170 */                                   if (!w11.m9451u(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || w11.m9451u(b9)))) {
/* 212 */                                       throw qz0.m8029a();
                                            }
/* 203 */                                   cArr[i6] = (char) (((b3 & Utf8.REPLACEMENT_BYTE) << 6) | ((b & 15) << 12) | (b9 & Utf8.REPLACEMENT_BYTE));
/* 205 */                                   i6 = i12;
                                        }
                                    }
/* 314 */                           return new String(cArr, 0, i6);
                                }
/* 64 */                        i++;
/* 69 */                        cArr[i6] = (char) b5;
/* 66 */                        i6++;
                            }
/* 73 */                    while (i < i5) {
/* 75 */                        i3 = i + 1;
/* 77 */                        b = bArr[i];
/* 79 */                        if (b < 0) {
/* 106 */                           if (b < -32) {
/* 108 */                               if (i3 < i5) {
/* 147 */                                   throw qz0.m8029a();
                                        }
/* 110 */                               i += 2;
/* 112 */                               byte b10 = bArr[i3];
/* 114 */                               int i13 = i6 + 1;
/* 118 */                               if (b >= -62) {
                                        }
/* 142 */                               throw qz0.m8029a();
                                    }
/* 150 */                           if (b >= -16) {
/* 154 */                               if (i3 < i5 - 1) {
/* 217 */                                   throw qz0.m8029a();
                                        }
/* 156 */                               int i14 = i + 2;
/* 158 */                               b3 = bArr[i3];
/* 160 */                               i += 3;
/* 162 */                               byte b11 = bArr[i14];
/* 164 */                               int i15 = i6 + 1;
/* 170 */                               if (w11.m9451u(b3)) {
                                        }
/* 212 */                               throw qz0.m8029a();
                                    }
/* 220 */                           if (i3 < i5 - 2) {
/* 311 */                               throw qz0.m8029a();
                                    }
/* 224 */                           b4 = bArr[i3];
/* 226 */                           int i16 = i + 3;
/* 228 */                           byte b12 = bArr[i + 2];
/* 230 */                           i += 4;
/* 232 */                           byte b13 = bArr[i16];
/* 234 */                           int i17 = i6 + 1;
/* 240 */                           if (!w11.m9451u(b4)) {
/* 249 */                               if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                                        }
                                    }
/* 306 */                           throw qz0.m8029a();
                                }
/* 81 */                        i4 = i6 + 1;
/* 84 */                        cArr[i6] = (char) b;
/* 86 */                        while (i3 < i5) {
/* 88 */                            b2 = bArr[i3];
/* 90 */                            if (b2 >= 0) {
/* 92 */                                i3++;
/* 97 */                                cArr[i4] = (char) b2;
/* 94 */                                i4++;
                                    } else {
/* 101 */                               i6 = i4;
/* 102 */                               i = i3;
                                    }
                                }
/* 101 */                       i6 = i4;
/* 102 */                       i = i3;
                            }
/* 314 */                   return new String(cArr, 0, i6);
                        default:
/* 8 */                     Charset charset = fz0.f8401a;
/* 10 */                    String str = new String(bArr, i, i2, charset);
/* 20 */                    if (str.indexOf(Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
/* 43 */                        throw qz0.m8029a();
                            }
/* 38 */                    return str;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:104:0x023c  */
                /* JADX WARN: Code duplicated, block: B:129:0x0237 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:130:0x022f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:131:0x022e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:71:0x0183  */
                /* JADX WARN: Code duplicated, block: B:72:0x0187  */
                /* JADX WARN: Code duplicated, block: B:74:0x018a  */
                /* JADX WARN: Code duplicated, block: B:79:0x01a0  */
                /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
                /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
                /* JADX WARN: Code duplicated, block: B:86:0x01c1  */
                /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
                /* JADX WARN: Code duplicated, block: B:93:0x01ec  */
                /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
                /* JADX WARN: Code duplicated, block: B:97:0x01fe  */
                /* JADX INFO: renamed from: f */
                public final int m5666f(String str, byte[] bArr, int i, int i2) {
                    int i3;
                    char cCharAt;
                    int i4;
                    int i5;
                    char cCharAt2;
                    char cCharAt3;
                    int i6;
                    int i7;
                    char cCharAt4;
/* 13 */            char c = 2048;
/* 15 */            char c2 = 128;
/* 17 */            char c3 = 55296;
                    switch (this.f12016a) {
                        case 0:
/* 360 */                   int length = str.length();
/* 364 */                   int i8 = i2 + i;
/* 365 */                   int i9 = 0;
/* 366 */                   while (i9 < length) {
/* 368 */                       int i10 = i9 + i;
/* 370 */                       if (i10 >= i8 || (cCharAt3 = str.charAt(i9)) >= 128) {
/* 386 */                           if (i9 == length) {
/* 388 */                               return i + length;
                                    }
/* 392 */                           i3 = i + i9;
/* 393 */                           while (i9 < length) {
/* 395 */                               cCharAt = str.charAt(i9);
/* 401 */                               if (cCharAt >= 128 && i3 < i8) {
/* 408 */                                   bArr[i3] = (byte) cCharAt;
/* 405 */                                   i3++;
                                        } else if (cCharAt < 2048 || i3 > i8 - 2) {
/* 448 */                                   if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i8 - 3) {
/* 491 */                                       if (i3 > i8 - 4) {
/* 571 */                                           if (55296 > cCharAt && cCharAt <= 57343 && ((i4 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
/* 602 */                                               throw new l13(i9, length);
                                                    }
/* 603 */                                           pk3.m7473i(cCharAt, i3);
/* 606 */                                           return 0;
                                                }
/* 493 */                                       i5 = i9 + 1;
/* 499 */                                       if (i5 != str.length()) {
/* 501 */                                           cCharAt2 = str.charAt(i5);
/* 509 */                                           if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                                               int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                                               bArr[i3] = (byte) ((codePoint >>> 18) | 240);
/* 534 */                                               bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
/* 536 */                                               int i11 = i3 + 3;
/* 544 */                                               bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
/* 546 */                                               i3 += 4;
/* 552 */                                               bArr[i11] = (byte) ((codePoint & 63) | 128);
/* 554 */                                               i9 = i5;
                                                    } else {
/* 559 */                                               i9 = i5;
                                                    }
                                                }
/* 567 */                                       throw new l13(i9 - 1, length);
                                            }
/* 466 */                                   bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                                   int i12 = i3 + 2;
/* 478 */                                   bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                                   i3 += 3;
/* 486 */                                   bArr[i12] = (byte) ((cCharAt & '?') | 128);
/* 555 */                                   i9++;
                                        } else {
/* 425 */                                   int i13 = i3 + 1;
/* 432 */                                   bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
/* 434 */                                   i3 += 2;
/* 442 */                                   bArr[i13] = (byte) ((cCharAt & '?') | 128);
                                        }
/* 555 */                               i9++;
                                    }
/* 608 */                           return i3;
                                }
/* 381 */                       bArr[i10] = (byte) cCharAt3;
/* 383 */                       i9++;
                            }
/* 386 */                   if (i9 == length) {
/* 388 */                       return i + length;
                            }
/* 392 */                   i3 = i + i9;
/* 393 */                   while (i9 < length) {
/* 395 */                       cCharAt = str.charAt(i9);
/* 401 */                       if (cCharAt >= 128) {
/* 419 */                           if (cCharAt < 2048) {
/* 448 */                               if (cCharAt < 55296) {
/* 466 */                                   bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                                   int i14 = i3 + 2;
/* 478 */                                   bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                                   i3 += 3;
/* 486 */                                   bArr[i14] = (byte) ((cCharAt & '?') | 128);
                                        } else {
/* 466 */                                   bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                                   int i15 = i3 + 2;
/* 478 */                                   bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                                   i3 += 3;
/* 486 */                                   bArr[i15] = (byte) ((cCharAt & '?') | 128);
                                        }
/* 491 */                               if (i3 > i8 - 4) {
/* 571 */                                   if (55296 > cCharAt) {
                                            }
/* 603 */                                   pk3.m7473i(cCharAt, i3);
/* 606 */                                   return 0;
                                        }
/* 493 */                               i5 = i9 + 1;
/* 499 */                               if (i5 != str.length()) {
/* 501 */                                   cCharAt2 = str.charAt(i5);
/* 509 */                                   if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                                       int codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                                       bArr[i3] = (byte) ((codePoint2 >>> 18) | 240);
/* 534 */                                       bArr[i3 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
/* 536 */                                       int i16 = i3 + 3;
/* 544 */                                       bArr[i3 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
/* 546 */                                       i3 += 4;
/* 552 */                                       bArr[i16] = (byte) ((codePoint2 & 63) | 128);
/* 554 */                                       i9 = i5;
                                            } else {
/* 559 */                                       i9 = i5;
                                            }
                                        }
/* 567 */                               throw new l13(i9 - 1, length);
                                    }
/* 448 */                           if (cCharAt < 55296) {
/* 466 */                               bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                               int i17 = i3 + 2;
/* 478 */                               bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                               i3 += 3;
/* 486 */                               bArr[i17] = (byte) ((cCharAt & '?') | 128);
                                    } else {
/* 466 */                               bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                               int i18 = i3 + 2;
/* 478 */                               bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                               i3 += 3;
/* 486 */                               bArr[i18] = (byte) ((cCharAt & '?') | 128);
                                    }
/* 491 */                           if (i3 > i8 - 4) {
/* 571 */                               if (55296 > cCharAt) {
                                        }
/* 603 */                               pk3.m7473i(cCharAt, i3);
/* 606 */                               return 0;
                                    }
/* 493 */                           i5 = i9 + 1;
/* 499 */                           if (i5 != str.length()) {
/* 501 */                               cCharAt2 = str.charAt(i5);
/* 509 */                               if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                                   int codePoint3 = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                                   bArr[i3] = (byte) ((codePoint3 >>> 18) | 240);
/* 534 */                                   bArr[i3 + 1] = (byte) (((codePoint3 >>> 12) & 63) | 128);
/* 536 */                                   int i19 = i3 + 3;
/* 544 */                                   bArr[i3 + 2] = (byte) (((codePoint3 >>> 6) & 63) | 128);
/* 546 */                                   i3 += 4;
/* 552 */                                   bArr[i19] = (byte) ((codePoint3 & 63) | 128);
/* 554 */                                   i9 = i5;
                                        } else {
/* 559 */                                   i9 = i5;
                                        }
                                    }
/* 567 */                           throw new l13(i9 - 1, length);
                                }
/* 419 */                       if (cCharAt < 2048) {
/* 448 */                           if (cCharAt < 55296) {
/* 466 */                               bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                               int i110 = i3 + 2;
/* 478 */                               bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                               i3 += 3;
/* 486 */                               bArr[i110] = (byte) ((cCharAt & '?') | 128);
                                    } else {
/* 466 */                               bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                               int i111 = i3 + 2;
/* 478 */                               bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                               i3 += 3;
/* 486 */                               bArr[i111] = (byte) ((cCharAt & '?') | 128);
                                    }
/* 491 */                           if (i3 > i8 - 4) {
/* 571 */                               if (55296 > cCharAt) {
                                        }
/* 603 */                               pk3.m7473i(cCharAt, i3);
/* 606 */                               return 0;
                                    }
/* 493 */                           i5 = i9 + 1;
/* 499 */                           if (i5 != str.length()) {
/* 501 */                               cCharAt2 = str.charAt(i5);
/* 509 */                               if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                                   int codePoint4 = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                                   bArr[i3] = (byte) ((codePoint4 >>> 18) | 240);
/* 534 */                                   bArr[i3 + 1] = (byte) (((codePoint4 >>> 12) & 63) | 128);
/* 536 */                                   int i112 = i3 + 3;
/* 544 */                                   bArr[i3 + 2] = (byte) (((codePoint4 >>> 6) & 63) | 128);
/* 546 */                                   i3 += 4;
/* 552 */                                   bArr[i112] = (byte) ((codePoint4 & 63) | 128);
/* 554 */                                   i9 = i5;
                                        } else {
/* 559 */                                   i9 = i5;
                                        }
                                    }
/* 567 */                           throw new l13(i9 - 1, length);
                                }
/* 448 */                       if (cCharAt < 55296) {
/* 466 */                           bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                           int i113 = i3 + 2;
/* 478 */                           bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                           i3 += 3;
/* 486 */                           bArr[i113] = (byte) ((cCharAt & '?') | 128);
                                } else {
/* 466 */                           bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                           int i114 = i3 + 2;
/* 478 */                           bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                           i3 += 3;
/* 486 */                           bArr[i114] = (byte) ((cCharAt & '?') | 128);
                                }
/* 491 */                       if (i3 > i8 - 4) {
/* 571 */                           if (55296 > cCharAt) {
                                    }
/* 603 */                           pk3.m7473i(cCharAt, i3);
/* 606 */                           return 0;
                                }
/* 493 */                       i5 = i9 + 1;
/* 499 */                       if (i5 != str.length()) {
/* 501 */                           cCharAt2 = str.charAt(i5);
/* 509 */                           if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                               int codePoint5 = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                               bArr[i3] = (byte) ((codePoint5 >>> 18) | 240);
/* 534 */                               bArr[i3 + 1] = (byte) (((codePoint5 >>> 12) & 63) | 128);
/* 536 */                               int i115 = i3 + 3;
/* 544 */                               bArr[i3 + 2] = (byte) (((codePoint5 >>> 6) & 63) | 128);
/* 546 */                               i3 += 4;
/* 552 */                               bArr[i115] = (byte) ((codePoint5 & 63) | 128);
/* 554 */                               i9 = i5;
                                    } else {
/* 559 */                               i9 = i5;
                                    }
                                }
/* 567 */                       throw new l13(i9 - 1, length);
/* 555 */                       i9++;
                            }
/* 608 */                   return i3;
                        default:
                            long j = i;
/* 25 */                    long j2 = ((long) i2) + j;
/* 26 */                    int length2 = str.length();
/* 34 */                    if (length2 > i2 || bArr.length - i2 < i) {
/* 359 */                       throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                            }
/* 40 */                    int i20 = 0;
/* 43 */                    while (i20 < length2 && (cCharAt4 = str.charAt(i20)) < 128) {
/* 54 */                        ny2.m7078j(bArr, j, (byte) cCharAt4);
/* 57 */                        i20++;
/* 51 */                        j++;
                            }
/* 62 */                    if (i20 != length2) {
/* 67 */                        while (i20 < length2) {
/* 69 */                            char cCharAt5 = str.charAt(i20);
/* 73 */                            if (cCharAt5 >= c2 || j >= j2) {
/* 91 */                                if (cCharAt5 >= c || j > j2 - 2) {
/* 122 */                                   i6 = i20;
/* 125 */                                   if ((cCharAt5 >= c3 && 57343 >= cCharAt5) || j > j2 - 3) {
/* 187 */                                       if (j > j2 - 4) {
/* 277 */                                           if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i7 = i6 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i7)))) {
/* 303 */                                               throw new l13(i6, length2);
                                                    }
/* 327 */                                           throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                                }
/* 189 */                                       i20 = i6 + 1;
/* 191 */                                       if (i20 != length2) {
/* 193 */                                           char cCharAt6 = str.charAt(i20);
/* 201 */                                           if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
/* 203 */                                               int codePoint6 = Character.toCodePoint(cCharAt5, cCharAt6);
/* 214 */                                               ny2.m7078j(bArr, j, (byte) ((codePoint6 >>> 18) | 240));
/* 231 */                                               ny2.m7078j(bArr, j + 1, (byte) (((codePoint6 >>> 12) & 63) | 128));
/* 234 */                                               long j3 = j + 3;
/* 242 */                                               ny2.m7078j(bArr, j + 2, (byte) (((codePoint6 >>> 6) & 63) | 128));
/* 245 */                                               j += 4;
/* 251 */                                               ny2.m7078j(bArr, j3, (byte) ((codePoint6 & 63) | 128));
                                                    }
                                                } else {
/* 265 */                                           i20 = i6;
                                                }
/* 273 */                                       throw new l13(i20 - 1, length2);
                                            }
/* 151 */                                   ny2.m7078j(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
/* 156 */                                   long j4 = j + 2;
/* 166 */                                   ny2.m7078j(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | c2));
/* 169 */                                   j += 3;
/* 177 */                                   ny2.m7078j(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                                        } else {
/* 99 */                                    i6 = i20;
/* 100 */                                   long j5 = j + 1;
/* 107 */                                   ny2.m7078j(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
/* 110 */                                   j += 2;
/* 116 */                                   ny2.m7078j(bArr, j5, (byte) ((cCharAt5 & '?') | c2));
                                        }
/* 119 */                               i20 = i6;
                                    } else {
/* 82 */                                ny2.m7078j(bArr, j, (byte) cCharAt5);
/* 79 */                                j++;
                                    }
/* 254 */                           i20++;
/* 256 */                           c = 2048;
/* 258 */                           c2 = 128;
/* 260 */                           c3 = 55296;
                                }
                            }
/* 64 */                    return (int) j;
                    }
                }
            }
