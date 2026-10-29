            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.location.LocationManager;
            import android.os.Build;
            import android.os.SystemClock;
            import android.util.AttributeSet;
            import android.util.Rational;
            import android.util.Size;
            import android.util.TypedValue;
            import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.internal.MethodInvocation;
            import com.google.android.gms.common.internal.TelemetryData;
            import com.google.android.gms.measurement.internal.zzaf;
            import com.google.android.gms.measurement.internal.zzol;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.usercentrics.sdk.UserDecision;
            import com.usercentrics.sdk.models.settings.ServicesIdStrategy$Companion;
            import com.usercentrics.sdk.p008ui.PredefinedUIResponse;
            import com.usercentrics.sdk.p008ui.color.UsercentricsShadedColor;
            import com.usercentrics.sdk.p009v2.settings.data.CustomizationColor;
            import com.usercentrics.sdk.p009v2.settings.data.CustomizationFont;
            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCustomization;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsLabels;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            import com.usercentrics.sdk.p009v2.translation.data.TranslationAriaLabels;
            import com.usercentrics.sdk.p009v2.translation.data.TranslationLabelsDto;
            import com.usercentrics.sdk.services.tcf.interfaces.IdAndName;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import java.io.ByteArrayOutputStream;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.KeyManagementException;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.EnumSet;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.locks.ReentrantLock;
            import javax.crypto.Cipher;
            import javax.crypto.spec.SecretKeySpec;
            import javax.inject.Provider;
            import javax.net.ssl.TrustManager;
            import javax.net.ssl.TrustManagerFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1848a;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 97 */    public final class ac1 implements yw1, sg0, xo0, OnCompleteListener, jd3, ul3 {

                /* JADX INFO: renamed from: e */
                public static ac1 f174e;

                /* JADX INFO: renamed from: f */
                public static ac1 f175f;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f176a;

                /* JADX INFO: renamed from: b */
                public Object f177b;

                /* JADX INFO: renamed from: c */
                public Object f178c;

                /* JADX INFO: renamed from: d */
                public Object f179d;

                public ac1(EnumSet enumSet) {
/* 3 */             this.f176a = 18;
/* 7 */             enumSet.getClass();
/* 13 */            this.f177b = enumSet;
                    try {
/* 19 */                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
/* 24 */                trustManagerFactory.init((KeyStore) null);
/* 27 */                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
/* 33 */                if (trustManagers.length == 1) {
/* 36 */                    TrustManager trustManager = trustManagers[0];
/* 40 */                    if (trustManager instanceof X509TrustManager) {
/* 44 */                        this.f178c = (X509TrustManager) trustManager;
/* 55 */                        this.f179d = new am2(m164A());
/* 98 */                        return;
                            }
                        }
/* 83 */                throw new IllegalStateException(("Unexpected default trust managers:" + Arrays.toString(trustManagers)).toString());
                    } catch (KeyManagementException e) {
/* 85 */                e.printStackTrace();
                    } catch (KeyStoreException e2) {
/* 95 */                e2.printStackTrace();
                    } catch (NoSuchAlgorithmException e3) {
/* 90 */                e3.printStackTrace();
                    }
                }

                /* JADX INFO: renamed from: B */
                public static HashMap m152B(ArrayList arrayList) {
/* 3 */             HashMap map = new HashMap();
/* 10 */            Iterator it = m161t(arrayList).iterator();
/* 18 */            while (it.hasNext()) {
/* 31 */                map.put((Rational) it.next(), new ArrayList());
                    }
/* 35 */            Iterator it2 = arrayList.iterator();
/* 43 */            while (it2.hasNext()) {
/* 49 */                Size size = (Size) it2.next();
/* 63 */                for (Rational rational : map.keySet()) {
/* 75 */                    if (AbstractC2177sd.m8480a(rational, size)) {
/* 83 */                        ((List) map.get(rational)).add(size);
                            }
                        }
                    }
/* 87 */            return map;
                }

                /* JADX INFO: renamed from: E */
                public static cv1 m153E(UsercentricsSettings usercentricsSettings) {
/* 1 */             List list = usercentricsSettings.f6717q;
/* 11 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 14 */            Iterator it = list.iterator();
/* 22 */            while (it.hasNext()) {
/* 35 */                arrayList.add(new bv1((String) it.next()));
                    }
/* 59 */            return new cv1(CollectionsKt.m6186E(new wa3(9), arrayList), new bv1(usercentricsSettings.f6704d));
                }

                /* JADX INFO: renamed from: F */
                public static C0875ec m154F(UsercentricsSettings usercentricsSettings, LegalBasisLocalization legalBasisLocalization) {
/* 9 */             TranslationLabelsDto translationLabelsDto = legalBasisLocalization.f6757a;
/* 11 */            String str = translationLabelsDto.f6792f;
/* 13 */            UsercentricsLabels usercentricsLabels = usercentricsSettings.f6701a;
/* 15 */            String str2 = usercentricsLabels.f6604g;
/* 17 */            String str3 = usercentricsLabels.f6606h;
/* 19 */            String str4 = usercentricsLabels.f6607h0;
/* 21 */            String str5 = usercentricsLabels.f6611j0;
/* 23 */            String str6 = usercentricsLabels.f6592a;
/* 25 */            String str7 = usercentricsLabels.f6594b;
/* 27 */            String str8 = translationLabelsDto.f6789c;
/* 29 */            str.getClass();
/* 32 */            str2.getClass();
/* 35 */            str3.getClass();
/* 38 */            str4.getClass();
/* 41 */            str5.getClass();
/* 44 */            str6.getClass();
/* 47 */            str7.getClass();
/* 50 */            str8.getClass();
/* 53 */            eq2 eq2Var = new eq2();
/* 56 */            eq2Var.f7832a = str;
/* 58 */            eq2Var.f7833b = str2;
/* 60 */            eq2Var.f7834c = str3;
/* 62 */            eq2Var.f7835d = str5;
/* 64 */            eq2Var.f7836e = str6;
/* 66 */            eq2Var.f7837f = str7;
/* 68 */            eq2Var.f7838i = str8;
/* 72 */            UsercentricsLabels usercentricsLabels2 = usercentricsSettings.f6701a;
/* 81 */            ru1 ru1Var = new ru1(0, usercentricsLabels2.f6610j, usercentricsLabels2.f6608i);
/* 92 */            ac1 ac1Var = new ac1(usercentricsLabels2.f6612k, usercentricsLabels2.f6614l, usercentricsLabels2.f6616m);
/* 101 */           ru1 ru1Var2 = new ru1(0, usercentricsLabels2.f6620o, usercentricsLabels2.f6618n);
/* 104 */           String str9 = usercentricsLabels2.f6622p;
/* 106 */           String str10 = usercentricsLabels2.f6624q;
/* 114 */           ru1 ru1Var3 = new ru1(0, usercentricsLabels2.f6628s, usercentricsLabels2.f6626r);
/* 123 */           ru1 ru1Var4 = new ru1(0, usercentricsLabels2.f6632u, usercentricsLabels2.f6630t);
/* 126 */           String str11 = usercentricsLabels2.f6634v;
/* 128 */           String str12 = usercentricsLabels2.f6636w;
/* 143 */           ru1 ru1Var5 = new ru1(0, usercentricsLabels2.f6640y, usercentricsLabels2.f6638x);
/* 148 */           String str13 = usercentricsLabels2.f6642z;
/* 150 */           String str14 = usercentricsLabels2.f6615l0;
/* 154 */           String str15 = usercentricsLabels2.f6546A;
/* 156 */           String str16 = usercentricsLabels2.f6548B;
/* 158 */           str13.getClass();
/* 161 */           str14.getClass();
/* 164 */           str15.getClass();
/* 167 */           str16.getClass();
/* 170 */           C2216tf c2216tf = new C2216tf();
/* 173 */           c2216tf.f17061a = str13;
/* 175 */           c2216tf.f17062b = str14;
/* 177 */           c2216tf.f17063c = str15;
/* 179 */           c2216tf.f17064d = str16;
/* 193 */           nv1 nv1Var = new nv1(ru1Var, ac1Var, ru1Var2, str9, str10, ru1Var3, ru1Var4, str11, str12, ru1Var5, c2216tf);
/* 198 */           TranslationAriaLabels translationAriaLabels = legalBasisLocalization.f6758b;
/* 207 */           String str17 = translationAriaLabels != null ? translationAriaLabels.f6764d : null;
/* 214 */           String str18 = translationAriaLabels != null ? translationAriaLabels.f6765e : null;
/* 222 */           String str19 = translationAriaLabels != null ? translationAriaLabels.f6767g : null;
/* 231 */           String str20 = translationAriaLabels != null ? translationAriaLabels.f6769i : null;
/* 240 */           String str21 = translationAriaLabels != null ? translationAriaLabels.f6772l : null;
/* 249 */           String str22 = translationAriaLabels != null ? translationAriaLabels.f6776p : null;
/* 258 */           String str23 = translationAriaLabels != null ? translationAriaLabels.f6783w : null;
/* 260 */           UsercentricsCustomization usercentricsCustomization = usercentricsSettings.f6721u;
/* 273 */           return new C0875ec(18, eq2Var, nv1Var, new au1(str17, str18, str19, str20, str21, str22, str23, usercentricsCustomization != null ? usercentricsCustomization.f6544g : null));
                }

                /* JADX INFO: renamed from: G */
                public static ac1 m155G(Context context, AttributeSet attributeSet, int[] iArr) {
/* 7 */             return new ac1(context, context.obtainStyledAttributes(attributeSet, iArr));
                }

                /* JADX INFO: renamed from: H */
                public static ac1 m156H(Context context, AttributeSet attributeSet, int[] iArr, int i) {
/* 8 */             return new ac1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
                }

                /* JADX INFO: renamed from: K */
                public static Double m157K(long j) {
/* 3 */             fb0.f8059b.getClass();
/* 12 */            if (fb0.m3687c(j, 0L) > 0) {
/* 29 */                return Double.valueOf(((double) ((int) (fb0.m3693i(j, ib0.SECONDS) * 1000.0d))) / 1000.0d);
                    }
/* 34 */            return null;
                }

                /* JADX INFO: renamed from: M */
                public static void m158M(List list, Size size, boolean z) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
/* 18 */                Size size3 = (Size) list.get(size2);
/* 28 */                if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                            break;
                        }
/* 41 */                arrayList.add(0, size3);
                    }
/* 47 */            list.removeAll(arrayList);
/* 50 */            Collections.reverse(list);
/* 53 */            if (z) {
/* 55 */                list.addAll(arrayList);
                    }
                }

                /* JADX INFO: renamed from: N */
                public static void m159N(List list, Size size, boolean z) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            for (int i = 0; i < list.size(); i++) {
/* 18 */                Size size2 = (Size) list.get(i);
/* 28 */                if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                            break;
                        }
/* 40 */                arrayList.add(0, size2);
                    }
/* 46 */            list.removeAll(arrayList);
/* 49 */            if (z) {
/* 51 */                list.addAll(arrayList);
                    }
                }

                /* JADX INFO: renamed from: i */
                public static String m160i(String str) {
/* 1 */             if (str == null || str.length() != 0) {
/* 10 */                return str;
                    }
/* 9 */             return null;
                }

                /* JADX INFO: renamed from: t */
                public static ArrayList m161t(ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 8 */             arrayList2.add(AbstractC2177sd.f16535a);
/* 13 */            arrayList2.add(AbstractC2177sd.f16537c);
/* 16 */            Iterator it = arrayList.iterator();
/* 24 */            while (it.hasNext()) {
/* 30 */                Size size = (Size) it.next();
/* 42 */                Rational rational = new Rational(size.getWidth(), size.getHeight());
/* 49 */                if (!arrayList2.contains(rational)) {
/* 51 */                    Iterator it2 = arrayList2.iterator();
/* 71 */                    do {
/* 59 */                        if (!it2.hasNext()) {
/* 74 */                            arrayList2.add(rational);
                                    break;
                                }
/* 71 */                    } while (!AbstractC2177sd.m8480a((Rational) it2.next(), size));
                        }
                    }
/* 78 */            return arrayList2;
                }

                /* JADX INFO: renamed from: w */
                public static Rational m162w(int i, boolean z) {
/* 3 */             if (i == -1) {
/* 2 */                 return null;
                    }
/* 5 */             if (i == 0) {
                        return z ? AbstractC2177sd.f16535a : AbstractC2177sd.f16536b;
                    }
/* 8 */             if (i == 1) {
                        return z ? AbstractC2177sd.f16537c : AbstractC2177sd.f16538d;
                    }
/* 26 */            hu0.m4325T("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
/* 2 */             return null;
                }

                /* JADX INFO: renamed from: x */
                public static yv1 m163x(LinkedHashMap linkedHashMap, String str, vv1 vv1Var) {
/* 5 */             Map map = (Map) linkedHashMap.get(str);
/* 7 */             if (map == null) {
/* 13 */                yv1 yv1Var = new yv1(vv1Var.f18368d);
/* 31 */                linkedHashMap.put(str, oc1.m7132f(new Pair(vv1Var.f18365a, yv1Var)));
/* 34 */                return yv1Var;
                    }
/* 41 */            yv1 yv1Var2 = (yv1) map.get(vv1Var.f18365a);
/* 43 */            if (yv1Var2 != null) {
/* 57 */                return yv1Var2;
                    }
/* 49 */            yv1 yv1Var3 = new yv1(vv1Var.f18368d);
/* 54 */            map.put(vv1Var.f18365a, yv1Var3);
/* 57 */            return yv1Var3;
                }

                /* JADX INFO: renamed from: A */
                public String[] m164A() {
/* 3 */             EnumSet enumSet = (EnumSet) this.f177b;
/* 9 */             String[] strArr = new String[enumSet.size()];
/* 11 */            Iterator it = enumSet.iterator();
/* 15 */            int i = 0;
/* 20 */            while (it.hasNext()) {
/* 34 */                strArr[i] = ((bm2) it.next()).toString();
/* 22 */                i++;
                    }
/* 38 */            return strArr;
                }

                /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                    	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                    	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
                    	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
                    */
                /* JADX INFO: renamed from: C */
                public p000.k61 m165C(
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r53v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    */
                /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                    	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                    	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
                    */

                /* JADX INFO: renamed from: D */
                public ur3 m166D(UsercentricsSettings usercentricsSettings) {
                    Object n42Var;
                    String strM160i;
                    String strM160i2;
                    String upperCase;
                    EnumC0958gl enumC0958gl;
                    Integer num;
                    CustomizationFont customizationFont;
                    Integer num2;
                    CustomizationFont customizationFont2;
                    String str;
                    String str2;
                    Float f;
                    Integer num3;
/* 5 */             UsercentricsCustomization usercentricsCustomization = usercentricsSettings.f6721u;
/* 13 */            CustomizationColor customizationColor = usercentricsCustomization != null ? usercentricsCustomization.f6543f : null;
/* 19 */            String str3 = customizationColor != null ? customizationColor.f6405a : null;
/* 22 */            if (str3 == null) {
/* 24 */                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 29 */            String strM170O = m170O("primary", str3, "#0045A5");
/* 33 */            UsercentricsShadedColor usercentricsShadedColorM7910u = qj3.m7910u(strM170O);
/* 42 */            String str4 = customizationColor != null ? customizationColor.f6414j : null;
/* 43 */            if (str4 == null) {
/* 45 */                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 54 */            UsercentricsShadedColor usercentricsShadedColorM7910u2 = qj3.m7910u(m170O("text", str4, "#303030"));
/* 63 */            String str5 = customizationColor != null ? customizationColor.f6416l : null;
/* 64 */            if (str5 == null) {
/* 66 */                str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 71 */            String strM170O2 = m170O("overlay", str5, "#333333");
/* 87 */            int iIntValue = (usercentricsCustomization == null || (num3 = usercentricsCustomization.f6540c) == null) ? 4 : num3.intValue();
                    try {
/* 89 */                m42 m42Var = o42.f14612b;
/* 109 */               n42Var = (usercentricsCustomization == null || (f = usercentricsCustomization.f6541d) == null) ? null : Double.valueOf(f.floatValue());
                    } catch (Throwable th) {
/* 111 */               m42 m42Var2 = o42.f14612b;
/* 115 */               n42Var = new n42(th);
                    }
/* 122 */           if (n42Var instanceof n42) {
/* 124 */               n42Var = null;
                    }
/* 125 */           Double d = (Double) n42Var;
/* 136 */           double dDoubleValue = d != null ? d.doubleValue() : 1.0d;
/* 144 */           String str6 = customizationColor != null ? customizationColor.f6415k : null;
/* 145 */           if (str6 == null) {
/* 147 */               str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 152 */           String strM170O3 = m170O("layerBackground", str6, "#FFFFFF");
/* 156 */           C2513yw c2513yw = C2566zw.Companion;
/* 158 */           c2513yw.getClass();
/* 161 */           C2566zw c2566zwM10188b = C2513yw.m10188b(strM170O3);
/* 175 */           CustomizationColor customizationColor2 = customizationColor;
/* 193 */           String str7 = strM170O;
/* 232 */           String strM3509m = AbstractC0886en.m3509m("#", C2513yw.m10187a(c2513yw, (int) Math.min(255.0d, ((double) c2566zwM10188b.f20357a) + 12.75d)), C2513yw.m10187a(c2513yw, (int) Math.min(255.0d, ((double) c2566zwM10188b.f20359c) + 12.75d)), C2513yw.m10187a(c2513yw, (int) Math.min(255.0d, ((double) c2566zwM10188b.f20358b) + 12.75d)));
/* 243 */           String str8 = customizationColor2 != null ? customizationColor2.f6424t : null;
/* 244 */           if (str8 == null) {
/* 246 */               str8 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 252 */           String strM170O4 = m170O("tabsBorderColor", str8, "#DDDDDD");
/* 264 */           String strM160i3 = m160i(customizationColor2 != null ? customizationColor2.f6407c : null);
/* 268 */           if (strM160i3 == null) {
/* 27 */                strM160i3 = "#0045A5";
                    }
/* 273 */           if (customizationColor2 == null || (str2 = customizationColor2.f6406b) == null || (strM160i = m160i(str2)) == null) {
/* 271 */               strM160i = "#FAFAFA";
                    }
/* 292 */           bx0 bx0Var = new bx0(iIntValue, strM160i, strM160i3);
/* 301 */           String strM160i4 = m160i(customizationColor2 != null ? customizationColor2.f6409e : null);
/* 27 */            String str9 = strM160i4 != null ? strM160i4 : "#0045A5";
/* 315 */           String strM160i5 = m160i(customizationColor2 != null ? customizationColor2.f6408d : null);
/* 325 */           bx0 bx0Var2 = new bx0(iIntValue, strM160i5 != null ? strM160i5 : "#FAFAFA", str9);
/* 334 */           String strM160i6 = m160i(customizationColor2 != null ? customizationColor2.f6411g : null);
/* 340 */           if (strM160i6 == null) {
/* 338 */               strM160i6 = "#F5F5F5";
                    }
/* 349 */           String strM160i7 = m160i(customizationColor2 != null ? customizationColor2.f6410f : null);
/* 353 */           if (strM160i7 == null) {
/* 48 */                strM160i7 = "#303030";
                    }
/* 359 */           bx0 bx0Var3 = new bx0(iIntValue, strM160i7, strM160i6);
/* 368 */           String strM160i8 = m160i(customizationColor2 != null ? customizationColor2.f6411g : null);
/* 372 */           if (strM160i8 == null) {
/* 338 */               strM160i8 = "#F5F5F5";
                    }
/* 381 */           String strM160i9 = m160i(customizationColor2 != null ? customizationColor2.f6410f : null);
/* 385 */           if (strM160i9 == null) {
/* 48 */                strM160i9 = "#303030";
                    }
/* 391 */           bx0 bx0Var4 = new bx0(iIntValue, strM160i9, strM160i8);
/* 400 */           String strM160i10 = m160i(customizationColor2 != null ? customizationColor2.f6425u : null);
/* 338 */           String str10 = strM160i10 != null ? strM160i10 : "#F5F5F5";
/* 408 */           if (customizationColor2 == null || (str = customizationColor2.f6426v) == null || (strM160i2 = m160i(str)) == null) {
/* 48 */                strM160i2 = "#303030";
                    }
/* 424 */           bx0 bx0Var5 = new bx0(iIntValue, strM160i2, str10);
/* 433 */           String strM160i11 = m160i(customizationColor2 != null ? customizationColor2.f6419o : null);
/* 437 */           if (strM160i11 == null) {
/* 439 */               strM160i11 = usercentricsShadedColorM7910u.f6237b;
                    }
/* 447 */           String strM160i12 = m160i(customizationColor2 != null ? customizationColor2.f6417m : null);
/* 451 */           if (strM160i12 == null) {
/* 453 */               strM160i12 = usercentricsShadedColorM7910u2.f6237b;
                    }
/* 461 */           String strM160i13 = m160i(customizationColor2 != null ? customizationColor2.f6421q : null);
/* 465 */           if (strM160i13 == null) {
/* 467 */               strM160i13 = usercentricsShadedColorM7910u2.f6238c;
                    }
/* 475 */           String strM160i14 = m160i(customizationColor2 != null ? customizationColor2.f6420p : null);
/* 479 */           if (strM160i14 == null) {
/* 150 */               strM160i14 = "#FFFFFF";
                    }
/* 488 */           String strM160i15 = m160i(customizationColor2 != null ? customizationColor2.f6422r : null);
/* 492 */           if (strM160i15 == null) {
/* 150 */               strM160i15 = "#FFFFFF";
                    }
/* 503 */           String strM160i16 = m160i(customizationColor2 != null ? customizationColor2.f6418n : null);
/* 507 */           if (strM160i16 == null) {
/* 150 */               strM160i16 = "#FFFFFF";
                    }
/* 512 */           strM160i11.getClass();
/* 515 */           strM160i12.getClass();
/* 518 */           strM160i13.getClass();
/* 521 */           xy1 xy1Var = new xy1();
/* 524 */           xy1Var.f19393a = strM160i11;
/* 526 */           xy1Var.f19395c = strM160i12;
/* 528 */           xy1Var.f19396d = strM160i13;
/* 530 */           xy1Var.f19397e = strM160i14;
/* 532 */           xy1Var.f19398f = strM160i16;
/* 534 */           xy1Var.f19394b = strM160i15;
/* 542 */           String strM160i17 = m160i(customizationColor2 != null ? customizationColor2.f6413i : null);
/* 551 */           String str11 = strM160i17 == null ? "#303030" : strM160i17;
/* 559 */           String strM160i18 = m160i(customizationColor2 != null ? customizationColor2.f6423s : null);
/* 563 */           if (strM160i18 != null) {
/* 566 */               str7 = strM160i18;
                    }
/* 578 */           ju1 ju1Var = new ju1(usercentricsShadedColorM7910u2, bx0Var, bx0Var2, bx0Var3, bx0Var5, bx0Var4, xy1Var, strM170O3, strM3509m, str11, str7, strM170O2, dDoubleValue, strM170O4);
/* 593 */           String strM160i19 = m160i((usercentricsCustomization == null || (customizationFont2 = usercentricsCustomization.f6542e) == null) ? null : customizationFont2.f6427a);
/* 620 */           lu1 lu1Var = new lu1(strM160i19 == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM160i19, (usercentricsCustomization == null || (customizationFont = usercentricsCustomization.f6542e) == null || (num2 = customizationFont.f6428b) == null) ? 14 : num2.intValue());
/* 634 */           int iIntValue2 = (usercentricsCustomization == null || (num = usercentricsCustomization.f6539b) == null) ? 8 : num.intValue();
/* 636 */           C0921fl c0921fl = EnumC0958gl.Companion;
/* 643 */           String str12 = usercentricsCustomization != null ? usercentricsCustomization.f6545h : null;
/* 644 */           c0921fl.getClass();
/* 647 */           if (str12 != null) {
/* 651 */               upperCase = str12.toUpperCase(Locale.ROOT);
/* 655 */               upperCase.getClass();
                    } else {
/* 659 */               upperCase = null;
                    }
/* 666 */           if (Intrinsics.m6216a(upperCase, "HORIZONTAL")) {
/* 668 */               enumC0958gl = EnumC0958gl.f8689a;
                    } else {
/* 682 */               enumC0958gl = Intrinsics.m6216a(upperCase, "VERTICAL") ? EnumC0958gl.f8690b : EnumC0958gl.f8691c;
                    }
/* 684 */           return new ur3(ju1Var, lu1Var, iIntValue2, enumC0958gl);
                }

                /* JADX INFO: renamed from: I */
                public void m167I(Activity activity, q83 q83Var) {
/* 3 */             WeakHashMap weakHashMap = (WeakHashMap) this.f179d;
/* 5 */             activity.getClass();
/* 10 */            ReentrantLock reentrantLock = (ReentrantLock) this.f178c;
/* 12 */            reentrantLock.lock();
                    try {
/* 25 */                if (q83Var.equals((q83) weakHashMap.get(activity))) {
/* 27 */                    reentrantLock.unlock();
/* 30 */                    return;
                        }
/* 37 */                reentrantLock.unlock();
/* 58 */                for (ge2 ge2Var : ((he2) ((fs0) this.f177b).f8339b).f9032b) {
/* 72 */                    if (ge2Var.f8570a.equals(activity)) {
/* 75 */                        ge2Var.f8572c = q83Var;
/* 79 */                        ge2Var.f8571b.accept(q83Var);
                            }
                        }
                    } catch (Throwable th) {
/* 85 */                reentrantLock.unlock();
/* 88 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: J */
                public void m168J() {
/* 5 */             ((TypedArray) this.f178c).recycle();
                }

                /* JADX INFO: renamed from: L */
                public PredefinedUIResponse m169L(wk2 wk2Var, ArrayList arrayList) {
                    ArrayList arrayListM35p;
                    Object n42Var;
                    u13 u13Var;
                    u13 u13Var2;
/* 3 */             a13 a13Var = (a13) this.f177b;
/* 5 */             arrayList.isEmpty();
/* 12 */            int iOrdinal = ((g13) this.f178c).ordinal();
/* 16 */            if (iOrdinal == 0) {
/* 343 */               List<UserDecision> listUserDecisionsGDPR = ya2.Companion.userDecisionsGDPR(arrayList);
/* 347 */               lz2 lz2Var = mz2.Companion;
/* 349 */               arrayListM35p = a13Var.m35p(listUserDecisionsGDPR);
                    } else if (iOrdinal == 1) {
/* 330 */               List<UserDecision> listUserDecisionsGDPR2 = ya2.Companion.userDecisionsGDPR(arrayList);
/* 334 */               lz2 lz2Var2 = mz2.Companion;
/* 336 */               arrayListM35p = a13Var.m35p(listUserDecisionsGDPR2);
                    } else {
/* 23 */                if (iOrdinal != 2) {
/* 324 */                   ds0.m3187b();
/* 21 */                    return null;
                        }
/* 25 */                ServicesIdStrategy$Companion servicesIdStrategy$Companion = ya2.Companion;
/* 27 */                ml2 ml2VarUserDecisionsTCF = servicesIdStrategy$Companion.userDecisionsTCF(arrayList);
/* 31 */                List<UserDecision> listUserDecisionsGDPR3 = servicesIdStrategy$Companion.userDecisionsGDPR(arrayList);
/* 35 */                lz2 lz2Var3 = mz2.Companion;
/* 37 */                ml2VarUserDecisionsTCF.getClass();
/* 40 */                listUserDecisionsGDPR3.getClass();
/* 43 */                boolean zM34o = a13Var.m34o();
/* 47 */                fb1 fb1Var = a13Var.f30a;
/* 49 */                if (zM34o) {
/* 63 */                    if (((ac2) fb1Var.f8068F.getValue()).m195b()) {
/* 65 */                        List<C1987o3> list = ml2VarUserDecisionsTCF.f13850d;
/* 69 */                        ArrayList arrayList2 = new ArrayList();
/* 80 */                        for (C1987o3 c1987o3 : list) {
/* 96 */                            Integer numValueOf = !c1987o3.f14598b ? null : Integer.valueOf(c1987o3.f14597a);
/* 100 */                           if (numValueOf != null) {
/* 102 */                               arrayList2.add(numValueOf);
                                    }
                                }
/* 114 */                       ((C2484y3) fb1Var.f8086X.getValue()).m10098f(arrayList2);
                            }
/* 121 */                   qk2 qk2Var = (qk2) a13Var.m32m();
/* 123 */                   qk2Var.getClass();
                            try {
/* 126 */                       m42 m42Var = o42.f14612b;
/* 128 */                       TCF2Settings tCF2SettingsM7928j = qk2Var.m7928j();
/* 132 */                       tCF2SettingsM7928j.getClass();
/* 135 */                       ml2 ml2VarM7921b = qk2Var.m7921b(ml2VarUserDecisionsTCF);
/* 139 */                       List list2 = ml2VarM7921b.f13849c;
/* 141 */                       List<kl2> list3 = ml2VarM7921b.f13848b;
/* 143 */                       List list4 = ml2VarM7921b.f13847a;
/* 145 */                       if (list4 != null) {
/* 147 */                           qk2Var.m7935t(list4);
                                }
/* 154 */                       if (list3 != null) {
/* 164 */                           for (kl2 kl2Var : list3) {
/* 172 */                               Boolean bool = kl2Var.f12875b;
/* 174 */                               int i = kl2Var.f12874a;
/* 178 */                               boolean zM6216a = Intrinsics.m6216a(bool, Boolean.TRUE);
/* 182 */                               ql2 ql2Var = qk2Var.f15610m;
/* 184 */                               if (zM6216a) {
/* 186 */                                   if (ql2Var != null && (u13Var = ql2Var.f15638q) != null) {
/* 192 */                                       u13Var.m8935b(i);
                                            }
                                        } else if (ql2Var != null && (u13Var2 = ql2Var.f15638q) != null) {
/* 202 */                                   u13Var2.m8937d(i);
                                        }
                                    }
                                }
/* 206 */                       if (list2 != null) {
/* 208 */                           qk2Var.m7936u(list2);
                                }
/* 211 */                       TCF2Settings tCF2SettingsM7928j2 = qk2Var.m7928j();
/* 215 */                       tCF2SettingsM7928j2.getClass();
/* 226 */                       qk2Var.m7937v(tCF2SettingsM7928j2, mn0.m6687c(qk2Var.m7929k()));
/* 231 */                       if (tCF2SettingsM7928j.f6470A) {
/* 233 */                           ql2 ql2Var2 = qk2Var.f15610m;
/* 235 */                           ql2Var2.getClass();
/* 240 */                           ql2Var2.f15647z.clear();
/* 243 */                           ql2 ql2Var3 = qk2Var.f15610m;
/* 245 */                           ql2Var3.getClass();
/* 250 */                           ql2Var3.f15640s.clear();
                                }
/* 253 */                       if (list4 != null || list3 != null || list2 != null) {
/* 259 */                           qk2Var.m7940y(wk2Var);
                                }
/* 262 */                       n42Var = Unit.f12910a;
                            } catch (Throwable th) {
/* 265 */                       m42 m42Var2 = o42.f14612b;
/* 269 */                       n42Var = new n42(th);
                            }
/* 273 */                   Throwable thM7099a = o42.m7099a(n42Var);
/* 277 */                   if (thM7099a != null) {
/* 295 */                       qk2Var.f15598a.mo2907b("Something went wrong with TCF updateChoices method: " + thM7099a, thM7099a);
                            }
                        } else {
/* 299 */                   i03 i03VarM3699e = fb1Var.m3699e();
/* 305 */                   a13.Companion.getClass();
/* 316 */                   i03VarM3699e.mo2907b("You *must* have the TCF settings enabled to do this operation: ".concat("saveDecisionsForTCF"), null);
                        }
/* 319 */               arrayListM35p = a13Var.m35p(listUserDecisionsGDPR3);
                    }
/* 362 */           a13Var.mo23c(wk2Var == wk2.FIRST_LAYER ? ez2.SAVE_FIRST_LAYER : ez2.SAVE_SECOND_LAYER);
/* 373 */           return new PredefinedUIResponse(av1.f2107c, arrayListM35p, (String) this.f179d);
                }

                /* JADX INFO: renamed from: O */
                public String m170O(String str, String str2, String str3) {
/* 3 */             C2566zw.Companion.getClass();
/* 31 */            String strSubstring = (str2.length() <= 0 || !C1848a.m6251b(str2.charAt(0), '#', false)) ? str2 : str2.substring(1);
/* 36 */            if (strSubstring.length() != 0 && strSubstring.length() == 6) {
/* 72 */                return str2;
                    }
/* 48 */            i03 i03Var = (i03) this.f177b;
/* 56 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("Configured color (", str2, ") for '", str, "' should be a valid hexadecimal, default color will be used ");
/* 60 */            sbM3514r.append(str3);
/* 68 */            i03Var.mo2908c(sbM3514r.toString(), null);
/* 71 */            return str3;
                }

                /* JADX INFO: renamed from: P */
                public synchronized void m171P(int i, int i2, long j, long j2) {
/* 10 */            ((ij3) this.f177b).f9640V.getClass();
/* 13 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 19 */            AtomicLong atomicLong = (AtomicLong) this.f179d;
/* 29 */            if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
/* 46 */                return;
                    }
/* 94 */            ((fc3) this.f178c).m3714c(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new C0193bu(this, jElapsedRealtime));
                }

                @Override // p000.yw1
                /* JADX INFO: renamed from: a */
                public byte[] mo172a(byte[] bArr, int i) throws GeneralSecurityException {
                    byte[] bArrM5962P;
/* 3 */             if (i > 16) {
/* 144 */               throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
                    }
/* 11 */            if (!pm2.m7478a(1)) {
/* 133 */               ds0.m3203t("Can not use AES-CMAC in FIPS-mode.");
/* 10 */                return null;
                    }
/* 23 */            Cipher cipher = (Cipher) he0.f9026b.f9028a.mo2941x("AES/ECB/NoPadding");
/* 29 */            cipher.init(1, (SecretKeySpec) this.f177b);
/* 42 */            int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
/* 50 */            if (iMax * 16 == bArr.length) {
/* 59 */                bArrM5962P = k50.m5961O(bArr, (iMax - 1) * 16, (byte[]) this.f178c, 0, 16);
                    } else {
/* 68 */                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
/* 73 */                if (bArrCopyOfRange.length >= 16) {
/* 127 */                   C1951n4.m6859j("x must be smaller than a block.");
/* 10 */                    return null;
                        }
/* 75 */                byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
/* 82 */                bArrCopyOf[bArrCopyOfRange.length] = -128;
/* 88 */                bArrM5962P = k50.m5962P(bArrCopyOf, (byte[]) this.f179d);
                    }
/* 92 */            byte[] bArrDoFinal = new byte[16];
/* 97 */            for (int i2 = 0; i2 < iMax - 1; i2++) {
/* 105 */               bArrDoFinal = cipher.doFinal(k50.m5961O(bArrDoFinal, 0, bArr, i2 * 16, 16));
                    }
/* 120 */           return Arrays.copyOf(cipher.doFinal(k50.m5962P(bArrM5962P, bArrDoFinal)), i);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x001a  */
                /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r10
  0x0033: PHI (r10v9 int) = (r10v1 int), (r10v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x006a  */
                /* JADX WARN: Code duplicated, block: B:14:0x006d  */
                @Override // p000.ul3
                /* JADX INFO: renamed from: b */
                public void mo173b(int i, Throwable th, byte[] bArr) {
                    yl3 yl3Var;
/* 3 */             sl3 sl3Var = (sl3) this.f177b;
/* 5 */             sl3Var.mo1375y();
/* 10 */            zzol zzolVar = (zzol) this.f179d;
/* 14 */            if (i == 200 || i == 204) {
/* 25 */                if (th == null) {
/* 31 */                    uh3 uh3Var = ((ij3) sl3Var.f16749a).f9655f;
/* 33 */                    ij3.m4555l(uh3Var);
/* 46 */                    uh3Var.f17534Y.m8511b(Long.valueOf(zzolVar.f4218a), "[sgtm] Upload succeeded for row_id");
/* 49 */                    yl3Var = yl3.SUCCESS;
                        } else {
/* 56 */                    uh3 uh3Var2 = ((ij3) sl3Var.f16749a).f9655f;
/* 58 */                    ij3.m4555l(uh3Var2);
/* 75 */                    uh3Var2.f17541w.m8513d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzolVar.f4218a), Integer.valueOf(i), th);
/* 105 */                   if (Arrays.asList(((String) vg3.f18165u.m9011a(null)).split(",")).contains(String.valueOf(i))) {
/* 107 */                       yl3Var = yl3.BACKOFF;
                            } else {
/* 110 */                       yl3Var = yl3.FAILURE;
                            }
                        }
                    } else if (i == 304) {
/* 24 */                i = 304;
/* 25 */                if (th == null) {
/* 31 */                    uh3 uh3Var3 = ((ij3) sl3Var.f16749a).f9655f;
/* 33 */                    ij3.m4555l(uh3Var3);
/* 46 */                    uh3Var3.f17534Y.m8511b(Long.valueOf(zzolVar.f4218a), "[sgtm] Upload succeeded for row_id");
/* 49 */                    yl3Var = yl3.SUCCESS;
                        } else {
/* 56 */                    uh3 uh3Var4 = ((ij3) sl3Var.f16749a).f9655f;
/* 58 */                    ij3.m4555l(uh3Var4);
/* 75 */                    uh3Var4.f17541w.m8513d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzolVar.f4218a), Integer.valueOf(i), th);
/* 105 */                   if (Arrays.asList(((String) vg3.f18165u.m9011a(null)).split(",")).contains(String.valueOf(i))) {
/* 107 */                       yl3Var = yl3.BACKOFF;
                            } else {
/* 110 */                       yl3Var = yl3.FAILURE;
                            }
                        }
                    } else {
/* 56 */                uh3 uh3Var5 = ((ij3) sl3Var.f16749a).f9655f;
/* 58 */                ij3.m4555l(uh3Var5);
/* 75 */                uh3Var5.f17541w.m8513d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzolVar.f4218a), Integer.valueOf(i), th);
/* 105 */               if (Arrays.asList(((String) vg3.f18165u.m9011a(null)).split(",")).contains(String.valueOf(i))) {
/* 107 */                   yl3Var = yl3.BACKOFF;
                        } else {
/* 110 */                   yl3Var = yl3.FAILURE;
                        }
                    }
/* 114 */           AtomicReference atomicReference = (AtomicReference) this.f178c;
/* 120 */           pn3 pn3VarM4567o = ((ij3) sl3Var.f16749a).m4567o();
/* 126 */           long j = zzolVar.f4218a;
/* 132 */           zzaf zzafVar = new zzaf(yl3Var.f19686a, j, zzolVar.f4223f);
/* 136 */           pn3VarM4567o.mo1375y();
/* 139 */           pn3VarM4567o.m9576A();
/* 157 */           pn3VarM4567o.m7518N(new js0(pn3VarM4567o, pn3VarM4567o.m7520P(true), zzafVar, 17, false));
/* 164 */           uh3 uh3Var6 = ((ij3) sl3Var.f16749a).f9655f;
/* 166 */           ij3.m4555l(uh3Var6);
/* 177 */           uh3Var6.f17534Y.m8512c(Long.valueOf(j), "[sgtm] Updated status for row_id", yl3Var);
                    synchronized (atomicReference) {
/* 181 */               atomicReference.set(yl3Var);
/* 184 */               atomicReference.notifyAll();
                    }
                }

                /* JADX INFO: renamed from: c */
                public PredefinedUIResponse m174c(wk2 wk2Var) {
                    ArrayList arrayListM24d;
                    Object n42Var;
/* 8 */             a13 a13Var = (a13) this.f177b;
/* 14 */            int iOrdinal = ((g13) this.f178c).ordinal();
/* 18 */            if (iOrdinal == 0) {
/* 449 */               lz2 lz2Var = mz2.Companion;
/* 451 */               arrayListM24d = a13Var.m24d();
                    } else if (iOrdinal == 1) {
/* 441 */               lz2 lz2Var2 = mz2.Companion;
/* 444 */               arrayListM24d = a13Var.m36q(false);
                    } else {
/* 25 */                if (iOrdinal != 2) {
/* 437 */                   ds0.m3187b();
/* 23 */                    return null;
                        }
/* 27 */                lz2 lz2Var3 = mz2.Companion;
/* 29 */                boolean zM34o = a13Var.m34o();
/* 33 */                fb1 fb1Var = a13Var.f30a;
/* 35 */                if (zM34o) {
/* 49 */                    if (((ac2) fb1Var.f8068F.getValue()).m195b()) {
/* 59 */                        ((C2484y3) fb1Var.f8086X.getValue()).m10093a();
                            }
/* 67 */                    qk2 qk2Var = (qk2) a13Var.m32m();
/* 69 */                    qk2Var.getClass();
                            try {
/* 72 */                        m42 m42Var = o42.f14612b;
/* 74 */                        ql2 ql2Var = qk2Var.f15610m;
/* 76 */                        ql2Var.getClass();
/* 81 */                        LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 86 */                        ArrayList arrayList = new ArrayList();
/* 91 */                        ArrayList arrayList2 = new ArrayList();
/* 96 */                        ArrayList arrayList3 = new ArrayList();
/* 101 */                       LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 104 */                       List listM7929k = qk2Var.m7929k();
/* 108 */                       ArrayList arrayList4 = b13.f2171a;
/* 110 */                       Iterator it = listM7929k.iterator();
/* 118 */                       while (it.hasNext()) {
/* 124 */                           TCFVendor tCFVendor = (TCFVendor) it.next();
/* 126 */                           int i = tCFVendor.f6209d;
/* 128 */                           List list = tCFVendor.f6214i;
/* 130 */                           List list2 = listM7929k;
/* 140 */                           if (arrayList4.contains(Integer.valueOf(i))) {
/* 142 */                               arrayList4 = arrayList4;
/* 144 */                               it = it;
                                    } else {
/* 154 */                               if (list.isEmpty()) {
/* 219 */                                   arrayList2.add(Integer.valueOf(i));
                                        } else {
/* 160 */                                   arrayList.add(Integer.valueOf(i));
/* 175 */                                   ArrayList arrayList5 = new ArrayList(C2122qw.m8020h(list, 10));
/* 178 */                                   Iterator it2 = list.iterator();
/* 186 */                                   while (it2.hasNext()) {
/* 200 */                                       arrayList5.add(Integer.valueOf(((IdAndName) it2.next()).f6157a));
                                            }
/* 207 */                                   linkedHashSet.addAll(arrayList5);
                                        }
/* 226 */                               arrayList3.add(Integer.valueOf(i));
/* 229 */                               List list3 = tCFVendor.f6211f;
/* 239 */                               ArrayList arrayList6 = new ArrayList(C2122qw.m8020h(list3, 10));
/* 242 */                               Iterator it3 = list3.iterator();
/* 250 */                               while (it3.hasNext()) {
/* 264 */                                   arrayList6.add(Integer.valueOf(((IdAndName) it3.next()).f6157a));
                                        }
/* 268 */                               linkedHashSet2.addAll(arrayList6);
                                    }
/* 271 */                           listM7929k = list2;
/* 273 */                           arrayList4 = arrayList4;
/* 275 */                           it = it;
                                }
/* 279 */                       List list4 = listM7929k;
/* 281 */                       TCF2Settings tCF2SettingsM7928j = qk2Var.m7928j();
/* 285 */                       tCF2SettingsM7928j.getClass();
/* 292 */                       qk2Var.m7937v(tCF2SettingsM7928j, mn0.m6687c(list4));
/* 297 */                       ql2Var.f15646y.m8936c(arrayList);
/* 302 */                       ql2Var.f15646y.m8938e(arrayList2);
/* 307 */                       ql2Var.f15647z.m8936c(arrayList3);
/* 317 */                       ql2Var.f15647z.m8938e(new ArrayList());
/* 322 */                       List list5 = qk2Var.f15613p.f6468c;
/* 330 */                       ql2Var.f15639r.m8936c(qk2.m7916c(linkedHashSet, list5));
/* 339 */                       ql2Var.f15640s.m8936c(qk2.m7916c(linkedHashSet2, list5));
/* 342 */                       TCF2Settings tCF2SettingsM7928j2 = qk2Var.m7928j();
/* 346 */                       tCF2SettingsM7928j2.getClass();
/* 351 */                       if (tCF2SettingsM7928j2.f6470A) {
/* 355 */                           ql2Var.f15647z.clear();
/* 360 */                           ql2Var.f15640s.clear();
                                }
/* 369 */                       ql2Var.f15638q.m8936c(qk2Var.m7925g());
/* 372 */                       qk2Var.m7940y(wk2Var);
/* 375 */                       n42Var = Unit.f12910a;
                            } catch (Throwable th) {
/* 378 */                       m42 m42Var2 = o42.f14612b;
/* 382 */                       n42Var = new n42(th);
                            }
/* 386 */                   Throwable thM7099a = o42.m7099a(n42Var);
/* 390 */                   if (thM7099a != null) {
/* 408 */                       qk2Var.f15598a.mo2907b("Something went wrong with TCF acceptAllDisclosed method: " + thM7099a, thM7099a);
                            }
                        } else {
/* 412 */                   i03 i03VarM3699e = fb1Var.m3699e();
/* 418 */                   a13.Companion.getClass();
/* 429 */                   i03VarM3699e.mo2907b("You *must* have the TCF settings enabled to do this operation: ".concat("acceptAllForTCF"), null);
                        }
/* 432 */               arrayListM24d = a13Var.m24d();
                    }
/* 464 */           a13Var.mo23c(wk2Var == wk2.FIRST_LAYER ? ez2.ACCEPT_ALL_FIRST_LAYER : ez2.ACCEPT_ALL_SECOND_LAYER);
/* 475 */           return new PredefinedUIResponse(av1.f2105a, arrayListM24d, (String) this.f179d);
                }

                /* JADX INFO: renamed from: d */
                public void m175d(double d, float f) {
/* 6 */             int length = ((float[]) this.f177b).length + 1;
/* 12 */            int iBinarySearch = Arrays.binarySearch((double[]) this.f178c, d);
/* 16 */            if (iBinarySearch < 0) {
/* 19 */                iBinarySearch = (-iBinarySearch) - 1;
                    }
/* 29 */            this.f178c = Arrays.copyOf((double[]) this.f178c, length);
/* 39 */            this.f177b = Arrays.copyOf((float[]) this.f177b, length);
/* 43 */            this.f179d = new double[length];
/* 47 */            double[] dArr = (double[]) this.f178c;
/* 54 */            System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
/* 61 */            ((double[]) this.f178c)[iBinarySearch] = d;
/* 67 */            ((float[]) this.f177b)[iBinarySearch] = f;
                }

                /* JADX INFO: renamed from: e */
                public void m176e() {
/* 17 */            for (Map.Entry entry : ((LinkedHashMap) this.f178c).entrySet()) {
/* 43 */                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
/* 55 */                    yv1 yv1Var = (yv1) entry2.getValue();
/* 60 */                    zv1 zv1Var = new zv1(this, entry, entry2, 0);
/* 63 */                    yv1Var.getClass();
/* 66 */                    yv1Var.f19819a = zv1Var;
                        }
                    }
/* 85 */            for (Map.Entry entry3 : ((LinkedHashMap) this.f179d).entrySet()) {
/* 111 */               for (Map.Entry entry4 : ((Map) entry3.getValue()).entrySet()) {
/* 123 */                   yv1 yv1Var2 = (yv1) entry4.getValue();
/* 128 */                   zv1 zv1Var2 = new zv1(this, entry3, entry4, 1);
/* 131 */                   yv1Var2.getClass();
/* 134 */                   yv1Var2.f19819a = zv1Var2;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public void m177f(lj2 lj2Var, Map.Entry entry) {
/* 6 */             lj2 lj2Var2 = (lj2) entry.getValue();
/* 22 */            C2180sg c2180sg = null;
/* 50 */            C2180sg c2180sg2 = new C2180sg(lj2Var.f13324g.f15102a, ((C0916fg) entry.getKey()).f8195d, lj2Var.f13320c ? (InterfaceC2559zp) this.f178c : null, ((C0916fg) entry.getKey()).f8197f, ((C0916fg) entry.getKey()).f8198g);
/* 59 */            int i = ((C0916fg) entry.getKey()).f8194c;
/* 61 */            lj2Var2.getClass();
/* 64 */            pg3.m7423a();
/* 67 */            lj2Var2.m6461a();
/* 76 */            de3.m3028j("Consumer can only be linked once.", !lj2Var2.f13327j);
/* 79 */            lj2Var2.f13327j = true;
/* 82 */            kj2 kj2Var = lj2Var2.f13329l;
/* 98 */            RunnableC1901ls runnableC1901lsM9399I = w11.m9399I(kj2Var.m2953c(), new jj2(lj2Var2, kj2Var, i, c2180sg2, c2180sg), pg3.m7436o());
/* 118 */           runnableC1901lsM9399I.mo3676a(new dp0(0, runnableC1901lsM9399I, new we2(4, this, lj2Var2)), pg3.m7436o());
                }

                /* JADX INFO: renamed from: g */
                public PredefinedUIResponse m178g(wk2 wk2Var, ArrayList arrayList) {
                    ArrayList arrayListM26g;
                    LinkedHashMap linkedHashMap;
                    Object n42Var;
/* 3 */             a13 a13Var = (a13) this.f177b;
/* 9 */             int iOrdinal = ((g13) this.f178c).ordinal();
/* 13 */            if (iOrdinal == 0) {
/* 327 */               lz2 lz2Var = mz2.Companion;
/* 329 */               arrayListM26g = a13Var.m26g();
                    } else if (iOrdinal == 1) {
/* 320 */               lz2 lz2Var2 = mz2.Companion;
/* 322 */               arrayListM26g = a13Var.m36q(true);
                    } else {
/* 20 */                if (iOrdinal != 2) {
/* 316 */                   ds0.m3187b();
/* 18 */                    return null;
                        }
/* 28 */                List list = ya2.Companion.userDecisionsTCF(arrayList).f13847a;
/* 30 */                if (list != null) {
/* 34 */                    ArrayList<jl2> arrayList2 = new ArrayList();
/* 45 */                    for (Object obj : list) {
/* 56 */                        if (((jl2) obj).f12355c != null) {
/* 58 */                            arrayList2.add(obj);
                                }
                            }
/* 68 */                    int iM6962c = nc1.m6962c(C2122qw.m8020h(arrayList2, 10));
/* 74 */                    if (iM6962c < 16) {
/* 76 */                        iM6962c = 16;
                            }
/* 79 */                    linkedHashMap = new LinkedHashMap(iM6962c);
/* 90 */                    for (jl2 jl2Var : arrayList2) {
/* 100 */                       Integer numValueOf = Integer.valueOf(jl2Var.f12353a);
/* 104 */                       Boolean bool = jl2Var.f12355c;
/* 106 */                       bool.getClass();
/* 109 */                       linkedHashMap.put(numValueOf, bool);
                            }
                        } else {
/* 113 */                   linkedHashMap = null;
                        }
/* 114 */               lz2 lz2Var3 = mz2.Companion;
/* 116 */               boolean zM34o = a13Var.m34o();
/* 120 */               fb1 fb1Var = a13Var.f30a;
/* 122 */               if (zM34o) {
/* 136 */                   if (((ac2) fb1Var.f8068F.getValue()).m195b()) {
/* 144 */                       C2484y3 c2484y3 = (C2484y3) fb1Var.f8086X.getValue();
/* 150 */                       if (c2484y3.m10094b()) {
/* 154 */                           c2484y3.m10098f(nd0.f14189a);
                                }
                            }
/* 161 */                   qk2 qk2Var = (qk2) a13Var.m32m();
/* 163 */                   qk2Var.getClass();
                            try {
/* 166 */                       m42 m42Var = o42.f14612b;
/* 168 */                       ql2 ql2Var = qk2Var.f15610m;
/* 170 */                       ql2Var.getClass();
/* 175 */                       ql2Var.f15646y.clear();
/* 184 */                       ql2Var.f15639r.m8938e(qk2Var.m7923e());
/* 187 */                       TCF2Settings tCF2SettingsM7928j = qk2Var.m7928j();
/* 191 */                       if (tCF2SettingsM7928j == null || !tCF2SettingsM7928j.f6517k0) {
/* 205 */                           ql2Var.f15647z.clear();
/* 212 */                           ql2Var.f15647z.m8936c(qk2Var.f15614q);
/* 221 */                           ql2Var.f15640s.m8938e(qk2Var.m7923e());
                                } else {
/* 197 */                           qk2Var.m7930l(ql2Var, linkedHashMap);
                                }
/* 230 */                       ql2Var.f15638q.m8938e(qk2Var.m7925g());
/* 233 */                       TCF2Settings tCF2SettingsM7928j2 = qk2Var.m7928j();
/* 237 */                       tCF2SettingsM7928j2.getClass();
/* 248 */                       qk2Var.m7937v(tCF2SettingsM7928j2, mn0.m6687c(qk2Var.m7929k()));
/* 251 */                       qk2Var.m7940y(wk2Var);
/* 254 */                       n42Var = Unit.f12910a;
                            } catch (Throwable th) {
/* 257 */                       m42 m42Var2 = o42.f14612b;
/* 261 */                       n42Var = new n42(th);
                            }
/* 265 */                   Throwable thM7099a = o42.m7099a(n42Var);
/* 269 */                   if (thM7099a != null) {
/* 287 */                       qk2Var.f15598a.mo2907b("Something went wrong with TCF denyAllDisclosed method: " + thM7099a, thM7099a);
                            }
                        } else {
/* 291 */                   i03 i03VarM3699e = fb1Var.m3699e();
/* 297 */                   a13.Companion.getClass();
/* 308 */                   i03VarM3699e.mo2907b("You *must* have the TCF settings enabled to do this operation: ".concat("denyAllForTCF"), null);
                        }
/* 311 */               arrayListM26g = a13Var.m26g();
                    }
/* 342 */           a13Var.mo23c(wk2Var == wk2.FIRST_LAYER ? ez2.DENY_ALL_FIRST_LAYER : ez2.DENY_ALL_SECOND_LAYER);
/* 353 */           return new PredefinedUIResponse(av1.f2106b, arrayListM26g, (String) this.f179d);
                }

                @Override // javax.inject.Provider
                public Object get() {
                    switch (this.f176a) {
                        case 10:
/* 97 */                    return new C0875ec((Context) ((Provider) this.f177b).get(), (s52) ((Provider) this.f178c).get(), (C1830kg) ((p62) this.f179d).get(), 28, false);
                        default:
/* 55 */                    return new yr2(new q62(9), new p62(8), (n60) ((C0168b5) this.f177b).get(), (f31) ((eq2) this.f178c).get(), (ra2) ((ra2) this.f179d).get());
                    }
                }

                /* JADX INFO: renamed from: h */
                public Object m179h() {
                    Object objRemoveLast;
                    synchronized (this.f179d) {
/* 8 */                 objRemoveLast = ((ArrayDeque) this.f177b).removeLast();
                    }
/* 13 */            return objRemoveLast;
                }

                /* JADX INFO: renamed from: j */
                public void m180j(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
/* 5 */             HashMap map = (HashMap) this.f177b;
/* 15 */            fz1 fz1Var = new fz1(byteArrayOutputStream, map, (HashMap) this.f178c, (cp1) this.f179d);
/* 18 */            if (obj == null) {
/* 20 */                return;
                    }
/* 29 */            cp1 cp1Var = (cp1) map.get(obj.getClass());
/* 31 */            if (cp1Var != null) {
/* 33 */                cp1Var.mo3633a(obj, fz1Var);
/* 36 */                return;
                    }
/* 60 */            throw new wd0("No encoder for " + obj.getClass());
                }

                /* JADX INFO: renamed from: k */
                public void m181k(mw0 mw0Var) throws Exception {
                    Object objM179h;
/* 1 */             gw0 gw0VarMo1727x0 = mw0Var.mo1727x0();
/* 15 */            InterfaceC2188so interfaceC2188so = gw0VarMo1727x0 instanceof C2225to ? ((C2225to) gw0VarMo1727x0).f17200a : null;
/* 22 */            if ((interfaceC2188so.mo1589j() != EnumC2114qo.f15672f && interfaceC2188so.mo1589j() != EnumC2114qo.f15670d) || interfaceC2188so.mo1586g() != EnumC2077po.f15198e || interfaceC2188so.mo1584e() != EnumC2151ro.f16207d) {
/* 54 */                ((f42) this.f178c).getClass();
/* 57 */                mw0Var.close();
/* 60 */                return;
                    }
                    synchronized (this.f179d) {
                        try {
/* 75 */                    objM179h = ((ArrayDeque) this.f177b).size() >= 3 ? m179h() : null;
/* 86 */                    ((ArrayDeque) this.f177b).addFirst(mw0Var);
                        } catch (Throwable th) {
/* 105 */                   throw th;
                        }
                    }
/* 94 */            if (((f42) this.f178c) == null || objM179h == null) {
/* 103 */               return;
                    }
/* 100 */           ((mw0) objM179h).close();
                }

                /* JADX INFO: renamed from: l */
                public q33 m182l(Class cls, String str) {
                    q33 q33VarMo94a;
/* 3 */             s33 s33Var = (s33) this.f178c;
/* 7 */             t33 t33Var = (t33) this.f177b;
/* 9 */             t33Var.getClass();
/* 12 */            LinkedHashMap linkedHashMap = t33Var.f16912a;
/* 18 */            q33 q33Var = (q33) linkedHashMap.get(str);
/* 24 */            if (!cls.isInstance(q33Var)) {
/* 61 */                qk1 qk1Var = new qk1((m20) this.f179d);
/* 68 */                qk1Var.f13548a.put(xt0.f19358W, str);
                        try {
/* 71 */                    q33VarMo94a = s33Var.mo95b(cls, qk1Var);
                        } catch (AbstractMethodError unused) {
/* 76 */                    q33VarMo94a = s33Var.mo94a(cls);
                        }
/* 80 */                q33VarMo94a.getClass();
/* 87 */                q33 q33Var2 = (q33) linkedHashMap.put(str, q33VarMo94a);
/* 89 */                if (q33Var2 != null) {
/* 91 */                    q33Var2.mo729b();
                        }
/* 94 */                return q33VarMo94a;
                    }
/* 33 */            a72 a72Var = s33Var instanceof a72 ? (a72) s33Var : null;
/* 34 */            if (a72Var != null) {
/* 36 */                q33Var.getClass();
/* 39 */                v61 v61Var = a72Var.f111d;
/* 41 */                if (v61Var != null) {
/* 43 */                    x62 x62Var = a72Var.f112e;
/* 45 */                    x62Var.getClass();
/* 48 */                    w11.m9421c(q33Var, x62Var, v61Var);
                        }
                    }
/* 51 */            q33Var.getClass();
/* 54 */            return q33Var;
                }

                /* JADX INFO: renamed from: m */
                public ColorStateList m183m(int i) {
                    int resourceId;
                    ColorStateList colorStateList;
/* 3 */             TypedArray typedArray = (TypedArray) this.f178c;
                    return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = v00.getColorStateList((Context) this.f177b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
                }

                /* JADX INFO: renamed from: n */
                public Drawable m184n(int i) {
                    int resourceId;
/* 3 */             TypedArray typedArray = (TypedArray) this.f178c;
                    return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : mn0.m6700p((Context) this.f177b, resourceId);
                }

                /* JADX INFO: renamed from: o */
                public Drawable m185o(int i) {
                    int resourceId;
                    Drawable drawableM9699d;
/* 9 */             if (!((TypedArray) this.f178c).hasValue(i) || (resourceId = ((TypedArray) this.f178c).getResourceId(i, 0)) == 0) {
/* 43 */                return null;
                    }
/* 22 */            C2491ya c2491yaM10132a = C2491ya.m10132a();
/* 28 */            Context context = (Context) this.f177b;
                    synchronized (c2491yaM10132a) {
/* 34 */                drawableM9699d = c2491yaM10132a.f19553a.m9699d(context, resourceId, true);
                    }
/* 39 */            return drawableM9699d;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
/* 3 */             h52 h52Var = (h52) this.f177b;
/* 7 */             String str = (String) this.f178c;
/* 11 */            ScheduledFuture scheduledFuture = (ScheduledFuture) this.f179d;
                    synchronized (h52Var.f8905a) {
/* 18 */                h52Var.f8905a.remove(str);
                    }
/* 23 */            scheduledFuture.cancel(false);
                }

                @Override // p000.xo0
                public void onFailure(Throwable th) {
/* 1 */             boolean z = th instanceof CancellationException;
/* 5 */             C2260um c2260um = (C2260um) this.f178c;
/* 8 */             if (z) {
/* 29 */                de3.m3028j(null, c2260um.m9041b(new pj2(((String) this.f179d).concat(" cancelled."), th)));
                    } else {
/* 33 */                c2260um.m9040a(null);
                    }
                }

                @Override // p000.xo0
                public void onSuccess(Object obj) {
/* 16 */            w11.m9392B(true, (s81) this.f177b, (C2260um) this.f178c, pg3.m7428g());
                }

                /* JADX INFO: renamed from: p */
                public Typeface m186p(int i, int i2, C1995ob c1995ob) {
/* 6 */             int resourceId = ((TypedArray) this.f178c).getResourceId(i, 0);
/* 10 */            if (resourceId == 0) {
/* 44 */                return null;
                    }
/* 17 */            if (((TypedValue) this.f179d) == null) {
/* 24 */                this.f179d = new TypedValue();
                    }
/* 29 */            Context context = (Context) this.f177b;
/* 34 */            TypedValue typedValue = (TypedValue) this.f179d;
/* 36 */            ThreadLocal threadLocal = d42.f6978a;
/* 42 */            if (context.isRestricted()) {
/* 44 */                return null;
                    }
/* 50 */            return d42.m2924b(context, resourceId, typedValue, i2, c1995ob, true, false);
                }

                /* JADX INFO: renamed from: q */
                public yv1 m187q(cu1 cu1Var) {
/* 1 */             cu1Var.getClass();
/* 4 */             vv1 vv1Var = cu1Var.f6911d;
/* 6 */             if (vv1Var == null) {
/* 8 */                 return null;
                    }
/* 10 */            String str = cu1Var.f6908a;
/* 12 */            List<pu1> list = cu1Var.f6914g;
/* 14 */            if (list == null || list.isEmpty()) {
/* 73 */                return m190u(str, vv1Var);
                    }
/* 25 */            ArrayList arrayList = new ArrayList();
/* 36 */            for (pu1 pu1Var : list) {
/* 48 */                m190u(pu1Var.f15285a, pu1Var.f15286b);
/* 53 */                arrayList.add(pu1Var.f15285a);
                    }
/* 61 */            ((LinkedHashMap) this.f177b).put(str, arrayList);
/* 68 */            return m163x((LinkedHashMap) this.f178c, str, vv1Var);
                }

                /* JADX INFO: renamed from: r */
                public Size[] m188r(int i) {
                    List arrayList;
                    ArrayList arrayList2;
/* 7 */             HashMap map = (HashMap) this.f179d;
/* 17 */            if (map.containsKey(Integer.valueOf(i))) {
/* 29 */                if (((Size[]) map.get(Integer.valueOf(i))) == null) {
/* 31 */                    return null;
                        }
/* 47 */                return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
                    }
/* 58 */            Size[] outputSizes = ((StreamConfigurationMap) ((ts0) this.f177b).f17248a).getOutputSizes(i);
/* 62 */            if (outputSizes == null || outputSizes.length == 0) {
/* 939 */               hu0.m4315H0("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
/* 942 */               return outputSizes;
                    }
/* 71 */            wc0 wc0Var = (wc0) this.f178c;
/* 73 */            wc0Var.getClass();
/* 82 */            ArrayList arrayList3 = new ArrayList(Arrays.asList(outputSizes));
/* 98 */            if (((ExtraSupportedOutputSizeQuirk) wc0Var.f18577b) != null) {
/* 140 */               Size[] sizeArr = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
/* 143 */               if (sizeArr.length > 0) {
/* 149 */                   arrayList3.addAll(Arrays.asList(sizeArr));
                        }
                    }
/* 154 */           C2131r4 c2131r4 = (C2131r4) wc0Var.f18578c;
/* 156 */           c2131r4.getClass();
/* 169 */           if (((ExcludedSupportedSizesQuirk) f80.f8038a.m3582h(ExcludedSupportedSizesQuirk.class)) == null) {
/* 173 */               arrayList = new ArrayList();
                    } else {
/* 178 */               String str = c2131r4.f15867b;
/* 180 */               String str2 = Build.BRAND;
/* 200 */               if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
/* 214 */                   arrayList2 = new ArrayList();
/* 221 */                   if (str.equals("0") && i == 256) {
/* 230 */                       arrayList2.add(new Size(4160, 3120));
/* 238 */                       arrayList2.add(new Size(4000, 3000));
                            }
                        } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
/* 262 */                   arrayList2 = new ArrayList();
/* 269 */                   if (str.equals("0") && i == 256) {
/* 278 */                       arrayList2.add(new Size(4160, 3120));
/* 286 */                       arrayList2.add(new Size(4000, 3000));
                            }
                        } else if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
/* 312 */                   arrayList2 = new ArrayList();
/* 319 */                   if (str.equals("0") && (i == 34 || i == 35)) {
/* 331 */                       arrayList2.add(new Size(720, 720));
/* 341 */                       arrayList2.add(new Size(400, 400));
                            }
                        } else if (ExcludedSupportedSizesQuirk.m440c()) {
/* 367 */                   arrayList2 = new ArrayList();
/* 374 */                   if (str.equals("0")) {
/* 376 */                       if (i == 34) {
/* 455 */                           arrayList2.add(new Size(4128, 3096));
/* 463 */                           arrayList2.add(new Size(4128, 2322));
/* 471 */                           arrayList2.add(new Size(3088, 3088));
/* 479 */                           arrayList2.add(new Size(3264, 2448));
/* 487 */                           arrayList2.add(new Size(3264, 1836));
/* 499 */                           arrayList2.add(new Size(2048, 1536));
/* 509 */                           arrayList2.add(new Size(2048, 1152));
/* 521 */                           arrayList2.add(new Size(1920, 1080));
                                } else if (i == 35) {
/* 385 */                           arrayList2.add(new Size(4128, 2322));
/* 393 */                           arrayList2.add(new Size(3088, 3088));
/* 401 */                           arrayList2.add(new Size(3264, 2448));
/* 409 */                           arrayList2.add(new Size(3264, 1836));
/* 421 */                           arrayList2.add(new Size(2048, 1536));
/* 431 */                           arrayList2.add(new Size(2048, 1152));
/* 443 */                           arrayList2.add(new Size(1920, 1080));
                                }
                            } else if (str.equals("1") && (i == 34 || i == 35)) {
/* 543 */                       arrayList2.add(new Size(3264, 2448));
/* 551 */                       arrayList2.add(new Size(3264, 1836));
/* 559 */                       arrayList2.add(new Size(2448, 2448));
/* 569 */                       arrayList2.add(new Size(1920, 1920));
/* 581 */                       arrayList2.add(new Size(2048, 1536));
/* 591 */                       arrayList2.add(new Size(2048, 1152));
/* 601 */                       arrayList2.add(new Size(1920, 1080));
                            }
                        } else if (ExcludedSupportedSizesQuirk.m439b()) {
/* 614 */                   arrayList2 = new ArrayList();
/* 621 */                   if (str.equals("0")) {
/* 623 */                       if (i == 34) {
/* 670 */                           arrayList2.add(new Size(4128, 3096));
/* 678 */                           arrayList2.add(new Size(4128, 2322));
/* 686 */                           arrayList2.add(new Size(3088, 3088));
/* 694 */                           arrayList2.add(new Size(3264, 2448));
/* 702 */                           arrayList2.add(new Size(3264, 1836));
/* 714 */                           arrayList2.add(new Size(2048, 1536));
/* 724 */                           arrayList2.add(new Size(2048, 1152));
/* 736 */                           arrayList2.add(new Size(1920, 1080));
                                } else if (i == 35) {
/* 636 */                           arrayList2.add(new Size(2048, 1536));
/* 646 */                           arrayList2.add(new Size(2048, 1152));
/* 658 */                           arrayList2.add(new Size(1920, 1080));
                                }
                            } else if (str.equals("1") && (i == 34 || i == 35)) {
/* 762 */                       arrayList2.add(new Size(2576, 1932));
/* 774 */                       arrayList2.add(new Size(2560, 1440));
/* 784 */                       arrayList2.add(new Size(1920, 1920));
/* 796 */                       arrayList2.add(new Size(2048, 1536));
/* 806 */                       arrayList2.add(new Size(2048, 1152));
/* 816 */                       arrayList2.add(new Size(1920, 1080));
                            }
                        } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
/* 841 */                   arrayList2 = new ArrayList();
/* 848 */                   if (str.equals("0") && i == 256) {
/* 863 */                       arrayList2.add(new Size(9280, 6944));
                            }
                        } else {
/* 872 */                   hu0.m4315H0("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
/* 875 */                   arrayList = Collections.EMPTY_LIST;
                        }
/* 241 */               arrayList = arrayList2;
                    }
/* 881 */           if (!arrayList.isEmpty()) {
/* 884 */               arrayList3.removeAll(arrayList);
                    }
/* 891 */           if (arrayList3.isEmpty()) {
/* 897 */               hu0.m4315H0("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
                    }
/* 907 */           Size[] sizeArr2 = (Size[]) arrayList3.toArray(new Size[0]);
/* 913 */           map.put(Integer.valueOf(i), sizeArr2);
/* 920 */           return (Size[]) sizeArr2.clone();
                }

                /* JADX INFO: renamed from: s */
                public double m189s(double d) {
/* 7 */             if (d < 0.0d) {
/* 9 */                 d = 0.0d;
                    } else if (d > 1.0d) {
/* 15 */                d = 1.0d;
                    }
/* 20 */            int iBinarySearch = Arrays.binarySearch((double[]) this.f178c, d);
/* 24 */            if (iBinarySearch > 0) {
/* 5 */                 return 1.0d;
                    }
/* 27 */            if (iBinarySearch == 0) {
/* 1 */                 return 0.0d;
                    }
/* 29 */            int i = -iBinarySearch;
/* 30 */            int i2 = i - 1;
/* 34 */            float[] fArr = (float[]) this.f177b;
/* 36 */            float f = fArr[i2];
/* 38 */            int i3 = i - 2;
/* 40 */            float f2 = fArr[i3];
/* 46 */            double[] dArr = (double[]) this.f178c;
/* 48 */            double d2 = dArr[i2];
/* 50 */            double d3 = dArr[i3];
/* 53 */            double d4 = ((double) (f - f2)) / (d2 - d3);
/* 75 */            return ((((d * d) - (d3 * d3)) * d4) / 2.0d) + ((d - d3) * (((double) f2) - (d4 * d3))) + ((double[]) this.f179d)[i3];
                }

                public String toString() {
                    switch (this.f176a) {
                        case 3:
/* 54 */                    StringBuilder sb = new StringBuilder(32);
/* 61 */                    sb.append((String) this.f177b);
/* 66 */                    sb.append('{');
/* 75 */                    wc0 wc0Var = (wc0) ((wc0) this.f178c).f18578c;
/* 77 */                    String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 79 */                    while (wc0Var != null) {
/* 81 */                        Object obj = wc0Var.f18577b;
/* 83 */                        sb.append(str);
/* 86 */                        if (obj == null || !obj.getClass().isArray()) {
/* 116 */                           sb.append(obj);
                                } else {
/* 102 */                           String strDeepToString = Arrays.deepToString(new Object[]{obj});
/* 112 */                           sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                                }
/* 121 */                       wc0Var = (wc0) wc0Var.f18578c;
/* 123 */                       str = ", ";
                            }
/* 128 */                   sb.append('}');
/* 131 */                   return sb.toString();
                        case 4:
/* 45 */                    return "pos =" + Arrays.toString((double[]) this.f178c) + " period=" + Arrays.toString((float[]) this.f177b);
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX INFO: renamed from: u */
                public yv1 m190u(String str, vv1 vv1Var) {
/* 1 */             str.getClass();
/* 4 */             vv1Var.getClass();
/* 11 */            return m163x((LinkedHashMap) this.f179d, str, vv1Var);
                }

                /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
                /* JADX INFO: renamed from: v */
                public ArrayList m191v(zy2 zy2Var) {
                    Size[] sizeArr;
                    Rational rational;
/* 3 */             InterfaceC2469xp interfaceC2469xp = (InterfaceC2469xp) this.f177b;
/* 6 */             jw0 jw0Var = (jw0) zy2Var;
/* 15 */            List list = (List) jw0Var.mo7023b(jw0.f12518B, null);
/* 25 */            ArrayList arrayList = list != null ? new ArrayList(list) : null;
/* 26 */            if (arrayList != null) {
/* 28 */                return arrayList;
                    }
/* 35 */            q32 q32Var = (q32) jw0Var.mo7023b(jw0.f12517A, null);
/* 43 */            List list2 = (List) jw0Var.mo7023b(jw0.f12526z, null);
/* 45 */            int iMo1175l = zy2Var.mo1175l();
/* 49 */            if (list2 == null) {
/* 82 */                sizeArr = null;
                        break;
                    }
/* 51 */            Iterator it = list2.iterator();
                    while (true) {
/* 59 */                if (!it.hasNext()) {
/* 82 */                    sizeArr = null;
                            break;
                        }
/* 65 */                android.util.Pair pair = (android.util.Pair) it.next();
/* 75 */                if (((Integer) pair.first).intValue() == iMo1175l) {
/* 79 */                    sizeArr = (Size[]) pair.second;
                            break;
                        }
                    }
/* 87 */            List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
/* 91 */            if (listAsList == null) {
/* 93 */                listAsList = interfaceC2469xp.mo315g(iMo1175l);
                    }
/* 99 */            ArrayList arrayList2 = new ArrayList(listAsList);
/* 108 */           Collections.sort(arrayList2, new C1007hx(true));
/* 115 */           if (arrayList2.isEmpty()) {
/* 138 */               hu0.m4315H0("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + iMo1175l + ".");
                    }
/* 142 */           if (q32Var != null) {
/* 561 */               Size size = (Size) ((jw0) zy2Var).mo7023b(jw0.f12525y, null);
/* 563 */               jw0Var.m5923s();
/* 580 */               if (!((Boolean) zy2Var.mo7023b(zy2.f20391N, Boolean.FALSE)).booleanValue()) {
/* 582 */                   zy2Var.mo1175l();
                        }
/* 591 */               q32 q32Var2 = (q32) jw0Var.mo7025e(jw0.f12517A);
/* 595 */               Rational rational2 = (Rational) this.f178c;
/* 597 */               xt0 xt0Var = q32Var2.f15380a;
/* 599 */               HashMap mapM152B = m152B(arrayList2);
/* 617 */               boolean z = rational2 == null || rational2.getNumerator() >= rational2.getDenominator();
/* 618 */               xt0Var.getClass();
/* 621 */               Rational rationalM162w = m162w(0, z);
/* 631 */               ArrayList<Rational> arrayList3 = new ArrayList(mapM152B.keySet());
/* 639 */               Collections.sort(arrayList3, new C2140rd(rationalM162w, rational2));
/* 644 */               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 655 */               for (Rational rational3 : arrayList3) {
/* 669 */                   linkedHashMap.put(rational3, (List) mapM152B.get(rational3));
                        }
/* 673 */               if (size != null) {
/* 675 */                   Size size2 = ue2.f17489a;
/* 685 */                   int height = size.getHeight() * size.getWidth();
/* 690 */                   Iterator it2 = linkedHashMap.keySet().iterator();
/* 698 */                   while (it2.hasNext()) {
/* 710 */                       List<Size> list3 = (List) linkedHashMap.get((Rational) it2.next());
/* 714 */                       ArrayList arrayList4 = new ArrayList();
/* 725 */                       for (Size size3 : list3) {
/* 737 */                           if (ue2.m9005a(size3) <= height) {
/* 739 */                               arrayList4.add(size3);
                                    }
                                }
/* 743 */                       list3.clear();
/* 746 */                       list3.addAll(arrayList4);
                            }
                        }
/* 750 */               r32 r32Var = q32Var2.f15381b;
/* 752 */               if (r32Var != null) {
/* 759 */                   Iterator it3 = linkedHashMap.keySet().iterator();
/* 767 */                   while (it3.hasNext()) {
/* 779 */                       List list4 = (List) linkedHashMap.get((Rational) it3.next());
/* 785 */                       if (!list4.isEmpty()) {
/* 788 */                           int i = r32Var.f15845b;
/* 792 */                           if (r32Var != r32.f15843c) {
/* 794 */                               Size size4 = r32Var.f15844a;
/* 796 */                               if (i == 0) {
/* 826 */                                   boolean zContains = list4.contains(size4);
/* 830 */                                   list4.clear();
/* 833 */                                   if (zContains) {
/* 835 */                                       list4.add(size4);
                                            }
                                        } else if (i == 1) {
/* 822 */                                   m158M(list4, size4, true);
                                        } else if (i == 2) {
/* 818 */                                   m158M(list4, size4, false);
                                        } else if (i == 3) {
/* 814 */                                   m159N(list4, size4, true);
                                        } else if (i == 4) {
/* 810 */                                   m159N(list4, size4, false);
                                        }
                                    }
                                }
                            }
                        }
/* 841 */               ArrayList arrayList5 = new ArrayList();
/* 848 */               Iterator it4 = linkedHashMap.values().iterator();
/* 856 */               while (it4.hasNext()) {
/* 872 */                   for (Size size5 : (List) it4.next()) {
/* 884 */                       if (!arrayList5.contains(size5)) {
/* 886 */                           arrayList5.add(size5);
                                }
                            }
                        }
/* 890 */               return arrayList5;
                    }
/* 146 */           aj2 aj2Var = (aj2) this.f179d;
/* 148 */           aj2Var.getClass();
/* 155 */           if (arrayList2.isEmpty()) {
/* 157 */               return arrayList2;
                    }
/* 160 */           ArrayList<Size> arrayList6 = new ArrayList(arrayList2);
/* 168 */           Collections.sort(arrayList6, new C1007hx(true));
/* 173 */           ArrayList arrayList7 = new ArrayList();
/* 176 */           jw0 jw0Var2 = (jw0) zy2Var;
/* 184 */           Size size6 = (Size) jw0Var2.mo7023b(jw0.f12525y, null);
/* 190 */           Size size7 = (Size) arrayList6.get(0);
/* 192 */           if (size6 == null) {
/* 209 */               size6 = size7;
                    } else if (ue2.m9005a(size7) < size6.getHeight() * size6.getWidth()) {
/* 209 */               size6 = size7;
                    }
/* 210 */           Size sizeM296a = aj2Var.m296a(jw0Var2);
/* 214 */           Size size8 = ue2.f17490b;
/* 216 */           int iM9005a = ue2.m9005a(size8);
/* 224 */           if (ue2.m9005a(size6) < iM9005a) {
/* 226 */               size8 = ue2.f17489a;
                    } else if (sizeM296a != null) {
/* 240 */               if (sizeM296a.getHeight() * sizeM296a.getWidth() < iM9005a) {
/* 242 */                   size8 = sizeM296a;
                        }
                    }
/* 251 */           for (Size size9 : arrayList6) {
/* 272 */               if (ue2.m9005a(size9) <= size6.getHeight() * size6.getWidth()) {
/* 287 */                   if (size9.getHeight() * size9.getWidth() >= ue2.m9005a(size8) && !arrayList7.contains(size9)) {
/* 295 */                       arrayList7.add(size9);
                            }
                        }
                    }
/* 303 */           if (arrayList7.isEmpty()) {
/* 551 */               throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size8 + "\nmaxSize = " + size6 + "\ninitial size list: " + arrayList6);
                    }
/* 305 */           C1888lf c1888lf = jw0.f12519q;
/* 311 */           if (jw0Var2.mo7028h(c1888lf)) {
/* 325 */               rational = m162w(((Integer) jw0Var2.mo7025e(c1888lf)).intValue(), aj2Var.f314d);
                    } else {
/* 330 */               Size sizeM296a2 = aj2Var.m296a(jw0Var2);
/* 334 */               if (sizeM296a2 != null) {
/* 340 */                   Iterator it5 = m161t(arrayList7).iterator();
                            while (true) {
/* 348 */                       if (!it5.hasNext()) {
/* 374 */                           rational = new Rational(sizeM296a2.getWidth(), sizeM296a2.getHeight());
                                    break;
                                }
/* 354 */                       Rational rational4 = (Rational) it5.next();
/* 360 */                       if (AbstractC2177sd.m8480a(rational4, sizeM296a2)) {
/* 362 */                           rational = rational4;
                                    break;
                                }
                            }
                        } else {
/* 379 */                   rational = null;
                        }
                    }
/* 380 */           if (sizeM296a == null) {
/* 389 */               sizeM296a = (Size) jw0Var2.mo7023b(jw0.f12524x, null);
                    }
/* 393 */           ArrayList arrayList8 = new ArrayList();
/* 398 */           new HashMap();
/* 401 */           if (rational == null) {
/* 403 */               arrayList8.addAll(arrayList7);
/* 406 */               if (sizeM296a != null) {
/* 408 */                   m158M(arrayList8, sizeM296a, true);
/* 411 */                   return arrayList8;
                        }
                    } else {
/* 412 */               HashMap mapM152B2 = m152B(arrayList7);
/* 416 */               if (sizeM296a != null) {
/* 422 */                   Iterator it6 = mapM152B2.keySet().iterator();
/* 430 */                   while (it6.hasNext()) {
/* 444 */                       m158M((List) mapM152B2.get((Rational) it6.next()), sizeM296a, true);
                            }
                        }
/* 454 */               ArrayList arrayList9 = new ArrayList(mapM152B2.keySet());
/* 464 */               Collections.sort(arrayList9, new C2140rd(rational, aj2Var.f313c));
/* 467 */               Iterator it7 = arrayList9.iterator();
/* 475 */               while (it7.hasNext()) {
/* 497 */                   for (Size size10 : (List) mapM152B2.get((Rational) it7.next())) {
/* 509 */                       if (!arrayList8.contains(size10)) {
/* 511 */                           arrayList8.add(size10);
                                }
                            }
                        }
                    }
/* 515 */           return arrayList8;
                }

                /* JADX INFO: renamed from: y */
                public ArrayList m192y() {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.f179d;
/* 11 */            ArrayList arrayList = new ArrayList(linkedHashMap.size());
/* 26 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 38 */                String str = (String) entry.getKey();
/* 44 */                Map map = (Map) entry.getValue();
/* 52 */                ArrayList arrayList2 = new ArrayList(map.size());
/* 67 */                for (Map.Entry entry2 : map.entrySet()) {
/* 98 */                    arrayList2.add(new Pair(entry2.getKey(), Boolean.valueOf(((yv1) entry2.getValue()).getCurrentState())));
                        }
/* 111 */               arrayList.add(new ou1(str, oc1.m7133g(arrayList2)));
                    }
/* 115 */           return arrayList;
                }

                /* JADX INFO: renamed from: z */
                public double m193z(double d, double d2) {
/* 12 */            return Math.sin((m189s(d) + d2) * 6.283185307179586d);
                }

                @Override // p000.jd3
                public Object zza() {
/* 35 */            return new yg3((wq3) ((jd3) this.f177b).zza(), (df3) ((jd3) this.f178c).zza(), (Context) ((qf3) ((pi3) this.f179d).f15137a).f15523a);
                }

/* 98 */        public /* synthetic */ ac1(int i, Object obj, Object obj2, Object obj3) {
/* 99 */            this.f176a = i;
                    this.f177b = obj;
                    this.f178c = obj2;
                    this.f179d = obj3;
                }

/* 99 */        public ac1(Context context, ij3 ij3Var) {
                    this.f176a = 27;
                    this.f179d = new AtomicLong(-1L);
/* 105 */           this.f178c = new fc3(context, null, fc3.f8129a, new zm2("measurement:api"), nr0.f14414c);
                    this.f177b = ij3Var;
                }

/* 105 */       public ac1(Map map, List list, C0875ec c0875ec) {
                    this.f176a = 2;
                    list.getClass();
/* 107 */           this.f177b = map;
/* 108 */           this.f178c = list;
/* 109 */           this.f179d = c0875ec;
                }

/* 109 */       public ac1(a13 a13Var, g13 g13Var, String str) {
                    this.f176a = 5;
                    g13Var.getClass();
                    str.getClass();
/* 111 */           this.f177b = a13Var;
/* 112 */           this.f178c = g13Var;
/* 113 */           this.f179d = str;
                }

/* 113 */       public ac1(i03 i03Var, ts0 ts0Var, vq0 vq0Var) {
                    this.f176a = 11;
                    i03Var.getClass();
                    vq0Var.getClass();
/* 115 */           this.f177b = i03Var;
/* 116 */           this.f178c = ts0Var;
/* 117 */           this.f179d = vq0Var;
                }

/* 117 */       public ac1(String str, C0875ec c0875ec, hu1 hu1Var) {
                    this.f176a = 17;
                    str.getClass();
/* 119 */           this.f177b = str;
/* 120 */           this.f178c = c0875ec;
/* 121 */           this.f179d = hu1Var;
                }

/* 121 */       public /* synthetic */ ac1(int i) {
/* 122 */           this.f176a = i;
                }

/* 122 */       public ac1() {
                    this.f176a = 7;
/* 124 */           this.f177b = new LinkedHashMap();
/* 125 */           this.f178c = new LinkedHashMap();
/* 126 */           this.f179d = new LinkedHashMap();
                }

/* 126 */       public ac1(qi1 qi1Var, C1029ij c1029ij, List list) {
                    this.f176a = 22;
                    list.getClass();
/* 128 */           this.f177b = qi1Var;
/* 129 */           this.f178c = c1029ij;
/* 130 */           this.f179d = list;
                }

/* 130 */       public ac1(t33 t33Var, s33 s33Var, m20 m20Var) {
                    this.f176a = 23;
                    t33Var.getClass();
                    m20Var.getClass();
/* 132 */           this.f177b = t33Var;
/* 133 */           this.f178c = s33Var;
/* 134 */           this.f179d = m20Var;
                }

/* 134 */       public ac1(f42 f42Var) {
                    this.f176a = 24;
/* 136 */           this.f179d = new Object();
/* 137 */           this.f177b = new ArrayDeque(3);
/* 138 */           this.f178c = f42Var;
                }

/* 138 */       public ac1(StreamConfigurationMap streamConfigurationMap, wc0 wc0Var) {
                    this.f176a = 13;
/* 140 */           this.f179d = new HashMap();
/* 141 */           new HashMap();
/* 142 */           new HashMap();
/* 143 */           this.f177b = new ts0(streamConfigurationMap);
/* 144 */           this.f178c = wc0Var;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 144 */       public ac1(t33 t33Var, s33 s33Var) {
/* 146 */           this(t33Var, s33Var, l20.f13077b);
                    this.f176a = 23;
                    t33Var.getClass();
                }

/* 146 */       public ac1(byte[] bArr) throws GeneralSecurityException {
                    this.f176a = 8;
/* 148 */           r13.m8049a(bArr.length);
/* 149 */           SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    this.f177b = secretKeySpec;
/* 150 */           if (pm2.m7478a(1)) {
/* 154 */               Cipher cipher = (Cipher) he0.f9026b.f9028a.mo2941x("AES/ECB/NoPadding");
/* 155 */               cipher.init(1, secretKeySpec);
/* 158 */               byte[] bArrM7904o = qj3.m7904o(cipher.doFinal(new byte[16]));
                        this.f178c = bArrM7904o;
/* 159 */               this.f179d = qj3.m7904o(bArrM7904o);
                        return;
                    }
/* 160 */           ds0.m3203t("Can not use AES-CMAC in FIPS-mode.");
                    throw null;
                }

/* 160 */       public ac1(Context context, TypedArray typedArray) {
                    this.f176a = 19;
/* 162 */           this.f177b = context;
/* 163 */           this.f178c = typedArray;
                }

/* 163 */       public ac1(Context context, LocationManager locationManager) {
                    this.f176a = 21;
/* 167 */           this.f179d = new fs2();
/* 168 */           this.f177b = context;
/* 169 */           this.f178c = locationManager;
                }

/* 169 */       public ac1(InterfaceC2469xp interfaceC2469xp, Size size) {
                    Rational rational;
                    this.f176a = 14;
/* 171 */           this.f177b = interfaceC2469xp;
/* 172 */           interfaceC2469xp.mo309a();
/* 173 */           interfaceC2469xp.mo312d();
                    if (size != null) {
/* 174 */               rational = new Rational(size.getWidth(), size.getHeight());
                    } else {
/* 175 */               List listMo315g = interfaceC2469xp.mo315g(NotificationCompat.FLAG_LOCAL_ONLY);
/* 176 */               if (listMo315g.isEmpty()) {
                            rational = null;
                        } else {
/* 179 */                   Size size2 = (Size) Collections.max(listMo315g, new C1007hx(false));
/* 180 */                   rational = new Rational(size2.getWidth(), size2.getHeight());
                        }
                    }
/* 181 */           this.f178c = rational;
/* 182 */           this.f179d = new aj2(interfaceC2469xp, rational);
                }

/* 182 */       public ac1(InterfaceC2559zp interfaceC2559zp, x60 x60Var) {
                    this.f176a = 15;
/* 184 */           this.f178c = interfaceC2559zp;
/* 185 */           this.f177b = x60Var;
                }

/* 185 */       public ac1(String str, String str2, String str3) {
                    this.f176a = 6;
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
/* 187 */           this.f177b = str;
/* 188 */           this.f178c = str2;
/* 189 */           this.f179d = str3;
                }

/* 189 */       public ac1(String str) {
                    this.f176a = 3;
/* 192 */           wc0 wc0Var = new wc0(20, false);
/* 193 */           this.f178c = wc0Var;
/* 194 */           this.f179d = wc0Var;
/* 195 */           this.f177b = str;
                }

/* 195 */       public ac1(fs0 fs0Var) {
                    this.f176a = 12;
/* 197 */           this.f177b = fs0Var;
/* 198 */           this.f178c = new ReentrantLock();
/* 199 */           this.f179d = new WeakHashMap();
                }
            }
