            package p000;

            import android.R;
            import android.content.Context;
            import android.os.Looper;
            import android.util.TypedValue;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.Feature;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import com.usercentrics.tcf.core.model.gvl.VendorUrl;
            import io.flutter.embedding.android.KeyboardMap;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.lang.reflect.Array;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.MappedByteBuffer;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import okhttp3.HttpUrl;
            import org.xmlpull.v1.XmlPullParser;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class k50 {

                /* JADX INFO: renamed from: b */
                public static int f12587b;

                /* JADX INFO: renamed from: l */
                public static final Feature f12597l;

                /* JADX INFO: renamed from: m */
                public static final Feature[] f12598m;

                /* JADX INFO: renamed from: a */
                public static final Object[] f12586a = new Object[0];

                /* JADX INFO: renamed from: c */
                public static final int[] f12588c = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};

                /* JADX INFO: renamed from: d */
                public static final int[] f12589d = {R.attr.resizeClip};

                /* JADX INFO: renamed from: e */
                public static final int[] f12590e = {R.attr.transitionVisibilityMode};

                /* JADX INFO: renamed from: f */
                public static final int[] f12591f = {R.attr.fadingMode};

                /* JADX INFO: renamed from: g */
                public static final int[] f12592g = {R.attr.reparent, R.attr.reparentWithOverlay};

                /* JADX INFO: renamed from: h */
                public static final int[] f12593h = {R.attr.slideEdge};

                /* JADX INFO: renamed from: i */
                public static final int[] f12594i = {R.attr.transitionOrdering};

                /* JADX INFO: renamed from: j */
                public static final int[] f12595j = {R.attr.minimumHorizontalAngle, R.attr.minimumVerticalAngle, R.attr.maximumAngle};

                /* JADX INFO: renamed from: k */
                public static final int[] f12596k = {R.attr.patternPathData};

                static {
/* 111 */           Feature feature = new Feature("name_ulr_private", 1L);
/* 118 */           Feature feature2 = new Feature("name_sleep_segment_request", 1L);
/* 125 */           Feature feature3 = new Feature("support_context_feature_id", 1L);
/* 128 */           f12597l = feature3;
/* 148 */           f12598m = new Feature[]{feature, feature2, feature3, new Feature("get_current_location", 1L), new Feature("get_last_activity_feature_id", 1L)};
                }

                /* JADX INFO: renamed from: A */
                public static final boolean m5949A(Object obj) {
                    return obj == hu0.f9293a;
                }

                /* JADX INFO: renamed from: B */
                public static int m5950B(Object obj, h72 h72Var, byte[] bArr, int i, int i2, C0176bd c0176bd) throws pz0 {
/* 1 */             int iM5976m = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iM5976m = m5976m(i3, bArr, iM5976m, c0176bd);
/* 11 */                i3 = c0176bd.f2370a;
                    }
/* 13 */            int i4 = iM5976m;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 35 */                throw pz0.m7628g();
                    }
/* 19 */            int i5 = i4 + i3;
/* 25 */            h72Var.mo4130h(obj, bArr, i4, i5, c0176bd);
/* 28 */            c0176bd.f2372c = obj;
/* 30 */            return i5;
                }

                /* JADX INFO: renamed from: E */
                public static g23 m5951E(String str) {
                    String strGroup;
/* 1 */             if (str == null || StringsKt.m6228D(str)) {
/* 83 */                return null;
                    }
/* 16 */            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
/* 24 */            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
/* 83 */                return null;
                    }
/* 34 */            int i = Integer.parseInt(strGroup);
/* 39 */            String strGroup2 = matcher.group(2);
/* 43 */            if (strGroup2 == null) {
/* 83 */                return null;
                    }
/* 45 */            int i2 = Integer.parseInt(strGroup2);
/* 50 */            String strGroup3 = matcher.group(3);
/* 54 */            if (strGroup3 == null) {
/* 83 */                return null;
                    }
/* 56 */            int i3 = Integer.parseInt(strGroup3);
/* 72 */            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : HttpUrl.FRAGMENT_ENCODE_SET;
/* 76 */            strGroup4.getClass();
/* 79 */            return new g23(strGroup4, i, i2, i3);
                }

                /* JADX INFO: renamed from: F */
                public static final Object m5952F(Object obj, Object obj2) {
/* 1 */             if (obj == null) {
/* 3 */                 return obj2;
                    }
/* 6 */             if (obj instanceof ArrayList) {
/* 11 */                ((ArrayList) obj).add(obj2);
/* 14 */                return obj;
                    }
/* 18 */            ArrayList arrayList = new ArrayList(4);
/* 21 */            arrayList.add(obj);
/* 24 */            arrayList.add(obj2);
/* 27 */            return arrayList;
                }

                /* JADX INFO: renamed from: G */
                public static ni1 m5953G(MappedByteBuffer mappedByteBuffer) throws IOException {
                    long j;
/* 1 */             ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
/* 7 */             byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
/* 16 */            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
/* 26 */            int i = byteBufferDuplicate.getShort() & 65535;
/* 32 */            if (i > 100) {
/* 213 */               ds0.m3195l("Cannot read metadata.");
/* 29 */                return null;
                    }
/* 40 */            byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
/* 44 */            int i2 = 0;
                    while (true) {
/* 52 */                if (i2 >= i) {
/* 91 */                    j = -1;
                            break;
                        }
/* 54 */                int i3 = byteBufferDuplicate.getInt();
/* 64 */                byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
/* 72 */                j = ((long) byteBufferDuplicate.getInt()) & KeyboardMap.kValueMask;
/* 79 */                byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
/* 85 */                if (1835365473 == i3) {
                            break;
                        }
/* 88 */                i2++;
                    }
/* 94 */            if (j != -1) {
/* 109 */               byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
/* 118 */               byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
/* 126 */               long j2 = ((long) byteBufferDuplicate.getInt()) & KeyboardMap.kValueMask;
/* 130 */               for (int i4 = 0; i4 < j2; i4++) {
/* 132 */                   int i5 = byteBufferDuplicate.getInt();
/* 141 */                   long j3 = ((long) byteBufferDuplicate.getInt()) & KeyboardMap.kValueMask;
/* 142 */                   byteBufferDuplicate.getInt();
/* 148 */                   if (1164798569 == i5 || 1701669481 == i5) {
/* 161 */                       byteBufferDuplicate.position((int) (j3 + j));
/* 166 */                       ni1 ni1Var = new ni1();
/* 171 */                       byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
/* 186 */                       int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
/* 187 */                       ni1Var.f15965d = byteBufferDuplicate;
/* 189 */                       ni1Var.f15962a = iPosition;
/* 195 */                       int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
/* 196 */                       ni1Var.f15963b = i6;
/* 206 */                       ni1Var.f15964c = ((ByteBuffer) ni1Var.f15965d).getShort(i6);
/* 208 */                       return ni1Var;
                            }
                        }
                    }
/* 209 */           ds0.m3195l("Cannot read metadata.");
/* 29 */            return null;
                }

                /* JADX INFO: renamed from: H */
                public static final Object[] m5954H(Collection collection) {
/* 1 */             int size = collection.size();
/* 5 */             if (size != 0) {
/* 8 */                 Iterator it = collection.iterator();
/* 16 */                if (it.hasNext()) {
/* 21 */                    Object[] objArrCopyOf = new Object[size];
/* 23 */                    int i = 0;
                            while (true) {
/* 24 */                        int i2 = i + 1;
/* 30 */                        objArrCopyOf[i] = it.next();
/* 33 */                        if (i2 >= objArrCopyOf.length) {
/* 39 */                            if (!it.hasNext()) {
/* 41 */                                return objArrCopyOf;
                                    }
/* 46 */                            int i3 = ((i2 * 3) + 1) >>> 1;
/* 48 */                            if (i3 <= i2) {
/* 50 */                                i3 = 2147483645;
/* 53 */                                if (i2 >= 2147483645) {
/* 61 */                                    throw new OutOfMemoryError();
                                        }
                                    }
/* 62 */                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                                } else if (!it.hasNext()) {
/* 74 */                            return Arrays.copyOf(objArrCopyOf, i2);
                                }
/* 66 */                        i = i2;
                            }
                        }
                    }
/* 18 */            return f12586a;
                }

                /* JADX INFO: renamed from: I */
                public static final Object[] m5955I(Collection collection, Object[] objArr) {
                    Object[] objArrCopyOf;
/* 1 */             objArr.getClass();
/* 4 */             int size = collection.size();
/* 9 */             int i = 0;
/* 10 */            if (size != 0) {
/* 18 */                Iterator it = collection.iterator();
/* 26 */                if (it.hasNext()) {
/* 35 */                    if (size <= objArr.length) {
/* 37 */                        objArrCopyOf = objArr;
                            } else {
/* 47 */                        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
/* 51 */                        objNewInstance.getClass();
/* 54 */                        objArrCopyOf = (Object[]) objNewInstance;
                            }
                            while (true) {
/* 56 */                        int i2 = i + 1;
/* 62 */                        objArrCopyOf[i] = it.next();
/* 65 */                        if (i2 >= objArrCopyOf.length) {
/* 71 */                            if (!it.hasNext()) {
/* 73 */                                return objArrCopyOf;
                                    }
/* 78 */                            int i3 = ((i2 * 3) + 1) >>> 1;
/* 80 */                            if (i3 <= i2) {
/* 82 */                                i3 = 2147483645;
/* 85 */                                if (i2 >= 2147483645) {
/* 93 */                                    throw new OutOfMemoryError();
                                        }
                                    }
/* 94 */                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                                } else if (!it.hasNext()) {
/* 106 */                           if (objArrCopyOf != objArr) {
/* 111 */                               return Arrays.copyOf(objArrCopyOf, i2);
                                    }
/* 108 */                           objArr[i2] = null;
/* 110 */                           return objArr;
                                }
/* 98 */                        i = i2;
                            }
                        } else if (objArr.length > 0) {
/* 31 */                    objArr[0] = null;
                        }
                    } else if (objArr.length > 0) {
/* 15 */                objArr[0] = null;
/* 17 */                return objArr;
                    }
/* 33 */            return objArr;
                }

                /* JADX INFO: renamed from: J */
                public static final String m5956J(c10 c10Var) {
                    Object n42Var;
/* 3 */             if (c10Var instanceof p80) {
/* 5 */                 return c10Var.toString();
                    }
                    try {
/* 12 */                m42 m42Var = o42.f14612b;
/* 32 */                n42Var = c10Var + '@' + m5983t(c10Var);
                    } catch (Throwable th) {
/* 38 */                m42 m42Var2 = o42.f14612b;
/* 42 */                n42Var = new n42(th);
                    }
/* 50 */            if (o42.m7099a(n42Var) != null) {
/* 79 */                n42Var = c10Var.getClass().getName() + '@' + m5983t(c10Var);
                    }
/* 83 */            return (String) n42Var;
                }

                /* JADX INFO: renamed from: K */
                public static final void m5957K(String str, String str2, Object... objArr) {
                    Throwable th;
/* 1 */             str.getClass();
/* 9 */             m5980q(str, str2, Arrays.copyOf(objArr, objArr.length));
                    try {
/* 13 */                int length = objArr.length;
/* 14 */                int i = 0;
                        while (true) {
/* 15 */                    th = null;
/* 16 */                    if (i >= length) {
                                break;
                            }
/* 18 */                    Object obj = objArr[i];
/* 26 */                    if (Throwable.class.isInstance(obj)) {
/* 30 */                        if (!(obj instanceof Throwable)) {
                                    break;
                                }
/* 33 */                        th = (Throwable) obj;
                                break;
                            }
/* 38 */                    i++;
                        }
/* 52 */                xq2 xq2Var = new xq2(str, m5984u(str2, Arrays.copyOf(objArr, objArr.length)), th);
/* 57 */                HashMap map = new HashMap();
/* 62 */                map.put(NotificationCompat.CATEGORY_EVENT, xq2Var);
/* 67 */                xn1.m10006b("SnowplowTrackerDiagnostic", map);
                    } catch (Exception e) {
/* 89 */                m5958L("k50", "Error logger can't report the error: " + e, new Object[0]);
                    }
                }

                /* JADX INFO: renamed from: L */
                public static final void m5958L(String str, String str2, Object... objArr) {
/* 1 */             str.getClass();
/* 7 */             if (f12587b >= 3) {
/* 14 */                m5984u(str2, Arrays.copyOf(objArr, objArr.length));
                    }
                }

                /* JADX INFO: renamed from: M */
                public static final Object m5959M(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, c10 c10Var) {
                    Object objInvoke;
/* 1 */             Object objM1741c = co2.m1741c(coroutineContext, obj2);
                    try {
/* 7 */                 dg2 dg2Var = new dg2(c10Var, coroutineContext);
/* 10 */                if (function2 == null) {
/* 12 */                    objInvoke = mz0.m6835c(function2, obj, dg2Var);
                        } else {
/* 20 */                    gs2.m4011b(2, function2);
/* 23 */                    objInvoke = function2.invoke(obj, dg2Var);
                        }
/* 27 */                co2.m1739a(coroutineContext, objM1741c);
/* 32 */                if (objInvoke == z10.f19902a) {
/* 34 */                    c10Var.getClass();
                        }
/* 37 */                return objInvoke;
                    } catch (Throwable th) {
/* 38 */                co2.m1739a(coroutineContext, objM1741c);
/* 41 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: N */
                public static final void m5960N(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
/* 1 */             if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
/* 43 */                C1951n4.m6859j("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
/* 46 */                return;
                    }
/* 22 */            for (int i2 = 0; i2 < i; i2++) {
/* 34 */                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
                    }
                }

                /* JADX INFO: renamed from: O */
                public static final byte[] m5961O(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 1 */             if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
/* 34 */                C1951n4.m6859j("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
/* 37 */                return null;
                    }
/* 11 */            byte[] bArr3 = new byte[i3];
/* 14 */            for (int i4 = 0; i4 < i3; i4++) {
/* 26 */                bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
                    }
/* 31 */            return bArr3;
                }

                /* JADX INFO: renamed from: P */
                public static final byte[] m5962P(byte[] bArr, byte[] bArr2) {
/* 3 */             if (bArr.length == bArr2.length) {
/* 7 */                 return m5961O(bArr, 0, bArr2, 0, bArr.length);
                    }
/* 14 */            C1951n4.m6859j("The lengths of x and y should match.");
/* 17 */            return null;
                }

                /* JADX INFO: renamed from: Q */
                public static int m5963Q(int i) {
/* 4 */             int[] iArr = {1, 2, 3};
/* 9 */             for (int i2 = 0; i2 < 3; i2++) {
/* 11 */                int i3 = iArr[i2];
/* 13 */                int i4 = i3 - 1;
/* 15 */                if (i3 == 0) {
/* 24 */                    throw null;
                        }
/* 17 */                if (i4 == i) {
/* 19 */                    return i3;
                        }
                    }
/* 1 */             return 1;
                }

                /* JADX INFO: renamed from: a */
                public static final y00 m5964a(CoroutineContext coroutineContext) {
/* 9 */             if (coroutineContext.get(xt0.f19368w) == null) {
/* 17 */                coroutineContext = coroutineContext.plus(new k01());
                    }
/* 21 */            return new y00(coroutineContext);
                }

                /* JADX INFO: renamed from: b */
                public static byte[] m5965b(byte[]... bArr) throws GeneralSecurityException {
/* 4 */             int length = 0;
/* 5 */             for (byte[] bArr2 : bArr) {
/* 14 */                if (length > AbstractC0208c9.API_PRIORITY_OTHER - bArr2.length) {
/* 23 */                    ds0.m3203t("exceeded size limit");
/* 26 */                    return null;
                        }
/* 17 */                length += bArr2.length;
                    }
/* 28 */            byte[] bArr3 = new byte[length];
/* 32 */            int length2 = 0;
/* 33 */            for (byte[] bArr4 : bArr) {
/* 38 */                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
/* 42 */                length2 += bArr4.length;
                    }
/* 46 */            return bArr3;
                }

                /* JADX INFO: renamed from: c */
                public static final Object m5966c(Function2 function2, c10 c10Var) throws Throwable {
/* 7 */             p72 p72Var = new p72(c10Var, c10Var.getContext());
/* 10 */            Object objM9762F = xe2.m9762F(p72Var, p72Var, function2);
/* 14 */            z10 z10Var = z10.f19902a;
/* 16 */            return objM9762F;
                }

                /* JADX INFO: renamed from: d */
                public static v81 m5967d(Looper looper, Object obj, String str) {
/* 3 */             kb1.m6062o(obj, "Listener must not be null");
/* 8 */             kb1.m6062o(looper, "Looper must not be null");
/* 13 */            kb1.m6062o(str, "Listener type must not be null");
/* 18 */            return new v81(looper, obj, str);
                }

                /* JADX INFO: renamed from: e */
                public static final void m5968e(String str, String str2, Object... objArr) {
/* 1 */             str.getClass();
/* 7 */             if (f12587b >= 2) {
/* 14 */                m5984u(str2, Arrays.copyOf(objArr, objArr.length));
                    }
                }

                /* JADX INFO: renamed from: f */
                public static int m5969f(byte[] bArr, int i, C0176bd c0176bd) throws pz0 {
/* 1 */             int iM5977n = m5977n(bArr, i, c0176bd);
/* 5 */             int i2 = c0176bd.f2370a;
/* 7 */             if (i2 < 0) {
/* 37 */                throw pz0.m7626e();
                    }
/* 11 */            if (i2 > bArr.length - iM5977n) {
/* 32 */                throw pz0.m7628g();
                    }
/* 13 */            if (i2 == 0) {
/* 17 */                c0176bd.f2372c = AbstractC2298vl.f18234b;
/* 19 */                return iM5977n;
                    }
/* 24 */            c0176bd.f2372c = AbstractC2298vl.m9303c(bArr, iM5977n, i2);
/* 26 */            return iM5977n + i2;
                }

                /* JADX INFO: renamed from: g */
                public static int m5970g(byte[] bArr, int i) {
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
                }

                /* JADX INFO: renamed from: h */
                public static long m5971h(byte[] bArr, int i) {
/* 76 */            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
                }

                /* JADX INFO: renamed from: i */
                public static int m5972i(h72 h72Var, int i, byte[] bArr, int i2, int i3, cz0 cz0Var, C0176bd c0176bd) throws pz0 {
/* 1 */             Object objNewInstance = h72Var.newInstance();
/* 5 */             h72 h72Var2 = h72Var;
/* 6 */             byte[] bArr2 = bArr;
/* 8 */             int i4 = i3;
/* 9 */             C0176bd c0176bd2 = c0176bd;
/* 10 */            int iM5950B = m5950B(objNewInstance, h72Var2, bArr2, i2, i4, c0176bd2);
/* 14 */            h72Var2.mo4124b(objNewInstance);
/* 17 */            c0176bd2.f2372c = objNewInstance;
/* 19 */            cz0Var.add(objNewInstance);
/* 22 */            while (iM5950B < i4) {
/* 24 */                C0176bd c0176bd3 = c0176bd2;
/* 25 */                int i5 = i4;
/* 26 */                int iM5977n = m5977n(bArr2, iM5950B, c0176bd3);
/* 32 */                if (i != c0176bd3.f2370a) {
                            break;
                        }
/* 35 */                byte[] bArr3 = bArr2;
/* 36 */                h72 h72Var3 = h72Var2;
/* 37 */                Object objNewInstance2 = h72Var3.newInstance();
/* 41 */                iM5950B = m5950B(objNewInstance2, h72Var3, bArr3, iM5977n, i5, c0176bd3);
/* 46 */                h72Var2 = h72Var3;
/* 47 */                bArr2 = bArr3;
/* 48 */                i4 = i5;
/* 49 */                c0176bd2 = c0176bd3;
/* 50 */                h72Var2.mo4124b(objNewInstance2);
/* 53 */                c0176bd2.f2372c = objNewInstance2;
/* 55 */                cz0Var.add(objNewInstance2);
                    }
/* 59 */            return iM5950B;
                }

                /* JADX INFO: renamed from: j */
                public static int m5973j(byte[] bArr, int i, C0176bd c0176bd) throws pz0 {
/* 1 */             int iM5977n = m5977n(bArr, i, c0176bd);
/* 5 */             int i2 = c0176bd.f2370a;
/* 7 */             if (i2 < 0) {
/* 31 */                throw pz0.m7626e();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                c0176bd.f2372c = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iM5977n;
                    }
/* 23 */            c0176bd.f2372c = new String(bArr, iM5977n, i2, ez0.f7923a);
/* 25 */            return iM5977n + i2;
                }

                /* JADX INFO: renamed from: k */
                public static int m5974k(byte[] bArr, int i, C0176bd c0176bd) throws pz0 {
/* 1 */             int iM5977n = m5977n(bArr, i, c0176bd);
/* 5 */             int i2 = c0176bd.f2370a;
/* 7 */             if (i2 < 0) {
/* 30 */                throw pz0.m7626e();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                c0176bd.f2372c = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iM5977n;
                    }
/* 22 */            c0176bd.f2372c = m13.f13547a.m4447l(bArr, iM5977n, i2);
/* 24 */            return iM5977n + i2;
                }

                /* JADX INFO: renamed from: l */
                public static int m5975l(int i, byte[] bArr, int i2, int i3, rx2 rx2Var, C0176bd c0176bd) throws pz0 {
/* 3 */             if ((i >>> 3) == 0) {
/* 159 */               throw pz0.m7622a();
                    }
/* 5 */             int i4 = i & 7;
/* 7 */             if (i4 == 0) {
/* 141 */               int iM5979p = m5979p(bArr, i2, c0176bd);
/* 151 */               rx2Var.m8321d(i, Long.valueOf(c0176bd.f2371b));
/* 154 */               return iM5979p;
                    }
/* 10 */            if (i4 == 1) {
/* 133 */               rx2Var.m8321d(i, Long.valueOf(m5971h(bArr, i2)));
/* 136 */               return i2 + 8;
                    }
/* 13 */            if (i4 == 2) {
/* 85 */                int iM5977n = m5977n(bArr, i2, c0176bd);
/* 89 */                int i5 = c0176bd.f2370a;
/* 91 */                if (i5 < 0) {
/* 123 */                   throw pz0.m7626e();
                        }
/* 95 */                if (i5 > bArr.length - iM5977n) {
/* 118 */                   throw pz0.m7628g();
                        }
/* 97 */                if (i5 == 0) {
/* 101 */                   rx2Var.m8321d(i, AbstractC2298vl.f18234b);
                        } else {
/* 109 */                   rx2Var.m8321d(i, AbstractC2298vl.m9303c(bArr, iM5977n, i5));
                        }
/* 112 */               return iM5977n + i5;
                    }
/* 16 */            if (i4 != 3) {
/* 19 */                if (i4 != 5) {
/* 39 */                    throw pz0.m7622a();
                        }
/* 29 */                rx2Var.m8321d(i, Integer.valueOf(m5970g(bArr, i2)));
/* 32 */                return i2 + 4;
                    }
/* 40 */            rx2 rx2VarM8318c = rx2.m8318c();
/* 46 */            int i6 = (i & (-8)) | 4;
/* 48 */            int i7 = 0;
/* 49 */            while (i2 < i3) {
/* 51 */                int iM5977n2 = m5977n(bArr, i2, c0176bd);
/* 55 */                i7 = c0176bd.f2370a;
/* 57 */                if (i7 == i6) {
/* 59 */                    i2 = iM5977n2;
                            break;
                        }
/* 65 */                i2 = m5975l(i7, bArr, iM5977n2, i3, rx2VarM8318c, c0176bd);
                    }
/* 70 */            if (i2 > i3 || i7 != i6) {
/* 82 */                throw pz0.m7627f();
                    }
/* 74 */            rx2Var.m8321d(i, rx2VarM8318c);
/* 77 */            return i2;
                }

                /* JADX INFO: renamed from: m */
                public static int m5976m(int i, byte[] bArr, int i2, C0176bd c0176bd) {
/* 1 */             int i3 = i & 127;
/* 3 */             int i4 = i2 + 1;
/* 5 */             byte b = bArr[i2];
/* 7 */             if (b >= 0) {
/* 12 */                c0176bd.f2370a = i3 | (b << 7);
/* 14 */                return i4;
                    }
/* 19 */            int i5 = i3 | ((b & 127) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i4];
/* 24 */            if (b2 >= 0) {
/* 29 */                c0176bd.f2370a = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & 127) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                c0176bd.f2370a = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & 127) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                c0176bd.f2370a = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & 127) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    c0176bd.f2370a = i11;
/* 81 */                    return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                /* JADX INFO: renamed from: n */
                public static int m5977n(byte[] bArr, int i, C0176bd c0176bd) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return m5976m(b, bArr, i2, c0176bd);
                    }
/* 7 */             c0176bd.f2370a = b;
/* 9 */             return i2;
                }

                /* JADX INFO: renamed from: o */
                public static int m5978o(int i, byte[] bArr, int i2, int i3, cz0 cz0Var, C0176bd c0176bd) {
/* 1 */             ry0 ry0Var = (ry0) cz0Var;
/* 3 */             int iM5977n = m5977n(bArr, i2, c0176bd);
/* 9 */             ry0Var.m8332b(c0176bd.f2370a);
/* 12 */            while (iM5977n < i3) {
/* 14 */                int iM5977n2 = m5977n(bArr, iM5977n, c0176bd);
/* 20 */                if (i != c0176bd.f2370a) {
                            break;
                        }
/* 23 */                iM5977n = m5977n(bArr, iM5977n2, c0176bd);
/* 29 */                ry0Var.m8332b(c0176bd.f2370a);
                    }
/* 33 */            return iM5977n;
                }

                /* JADX INFO: renamed from: p */
                public static int m5979p(byte[] bArr, int i, C0176bd c0176bd) {
/* 1 */             int i2 = i + 1;
/* 3 */             long j = bArr[i];
/* 10 */            if (j >= 0) {
/* 12 */                c0176bd.f2371b = j;
/* 14 */                return i2;
                    }
/* 18 */            int i3 = i + 2;
/* 20 */            byte b = bArr[i2];
/* 27 */            long j2 = (j & 127) | (((long) (b & 127)) << 7);
/* 28 */            int i4 = 7;
/* 29 */            while (b < 0) {
/* 31 */                int i5 = i3 + 1;
/* 33 */                byte b2 = bArr[i3];
/* 35 */                i4 += 7;
/* 40 */                j2 |= ((long) (b2 & 127)) << i4;
/* 42 */                b = b2;
/* 43 */                i3 = i5;
                    }
/* 45 */            c0176bd.f2371b = j2;
/* 47 */            return i3;
                }

                /* JADX INFO: renamed from: q */
                public static final void m5980q(String str, String str2, Object... objArr) {
/* 1 */             str.getClass();
/* 7 */             if (f12587b >= 1) {
/* 24 */                AbstractC1245n0.m4876d("SnowplowTracker->".concat(str), m5984u(str2, Arrays.copyOf(objArr, objArr.length)));
                    }
                }

                /* JADX INFO: renamed from: r */
                public static int m5981r(Context context, int i, int i2) {
/* 3 */             TypedValue typedValue = new TypedValue();
/* 11 */            context.getTheme().resolveAttribute(i, typedValue, true);
                    return typedValue.resourceId != 0 ? i : i2;
                }

                /* JADX INFO: renamed from: s */
                public static void m5982s(s81 s81Var) {
/* 5 */             if (!s81Var.isDone()) {
/* 44 */                f42.m3656l(i13.m4444x("Future was expected to be done: %s", s81Var));
/* 47 */                return;
                    }
/* 7 */             boolean z = false;
                    while (true) {
                        try {
/* 8 */                     s81Var.get();
                            break;
                        } catch (InterruptedException unused) {
/* 32 */                    z = true;
                        } catch (Throwable th) {
/* 22 */                    if (z) {
/* 28 */                        Thread.currentThread().interrupt();
                            }
/* 31 */                    throw th;
                        }
                    }
/* 11 */            if (z) {
/* 17 */                Thread.currentThread().interrupt();
                    }
                }

                /* JADX INFO: renamed from: t */
                public static final String m5983t(Object obj) {
/* 5 */             return Integer.toHexString(System.identityHashCode(obj));
                }

                /* JADX INFO: renamed from: u */
                public static String m5984u(String str, Object... objArr) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            String name = Thread.currentThread().getName();
/* 14 */            name.getClass();
/* 17 */            sb.append(name);
/* 22 */            sb.append('|');
/* 26 */            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 39 */            sb.append(String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
/* 42 */            return sb.toString();
                }

                /* JADX INFO: renamed from: v */
                public static final int m5985v(int i, int i2, int i3) {
/* 1 */             if (i3 > 0) {
/* 3 */                 if (i < i2) {
/* 6 */                     int i4 = i2 % i3;
/* 8 */                     if (i4 < 0) {
/* 11 */                        i4 += i3;
                            }
/* 12 */                    int i5 = i % i3;
/* 13 */                    if (i5 < 0) {
/* 16 */                        i5 += i3;
                            }
/* 18 */                    int i6 = (i4 - i5) % i3;
/* 19 */                    if (i6 < 0) {
/* 22 */                        i6 += i3;
                            }
/* 23 */                    return i2 - i6;
                        }
                    } else {
/* 25 */                if (i3 >= 0) {
/* 52 */                    C1951n4.m6859j("Step is zero.");
/* 55 */                    return 0;
                        }
/* 27 */                if (i > i2) {
/* 30 */                    int i7 = -i3;
/* 31 */                    int i8 = i % i7;
/* 32 */                    if (i8 < 0) {
/* 35 */                        i8 += i7;
                            }
/* 36 */                    int i9 = i2 % i7;
/* 38 */                    if (i9 < 0) {
/* 41 */                        i9 += i7;
                            }
/* 43 */                    int i10 = (i8 - i9) % i7;
/* 44 */                    if (i10 < 0) {
/* 47 */                        i10 += i7;
                            }
/* 48 */                    return i10 + i2;
                        }
                    }
/* 29 */            return i2;
                }

                /* JADX INFO: renamed from: w */
                public static final s82 m5986w(Object obj) {
/* 3 */             if (obj != hu0.f9293a) {
/* 5 */                 return (s82) obj;
                    }
/* 10 */            f42.m3656l("Does not contain segment");
/* 13 */            return null;
                }

                /* JADX INFO: renamed from: x */
                public static final VendorUrl m5987x(TCFVendor tCFVendor, UsercentricsSettings usercentricsSettings) {
                    Object next;
                    Object next2;
/* 1 */             tCFVendor.getClass();
/* 4 */             usercentricsSettings.getClass();
/* 7 */             List list = tCFVendor.f6228w;
/* 9 */             List list2 = tCFVendor.f6228w;
/* 11 */            Iterator it = list.iterator();
/* 37 */            do {
/* 20 */                if (!it.hasNext()) {
/* 40 */                    next = null;
                            break;
                        }
/* 22 */                next = it.next();
/* 37 */            } while (!Intrinsics.m6216a(((VendorUrl) next).f6863a, usercentricsSettings.f6704d));
/* 41 */            VendorUrl vendorUrl = (VendorUrl) next;
/* 43 */            Iterator it2 = list2.iterator();
/* 68 */            do {
/* 51 */                if (!it2.hasNext()) {
/* 71 */                    next2 = null;
                            break;
                        }
/* 53 */                next2 = it2.next();
/* 68 */            } while (!Intrinsics.m6216a(((VendorUrl) next2).f6863a, "en"));
/* 72 */            VendorUrl vendorUrl2 = (VendorUrl) next2;
/* 78 */            VendorUrl vendorUrl3 = (VendorUrl) CollectionsKt.firstOrNull(list2);
/* 80 */            if (vendorUrl != null) {
/* 89 */                return vendorUrl;
                    }
/* 82 */            if (vendorUrl2 != null) {
/* 88 */                return vendorUrl2;
                    }
/* 84 */            if (vendorUrl3 == null) {
/* 19 */                return null;
                    }
/* 87 */            return vendorUrl3;
                }

                /* JADX INFO: renamed from: y */
                public static boolean m5988y(XmlPullParser xmlPullParser, String str) {
                    return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
                }

                /* JADX INFO: renamed from: z */
                public static final int m5989z(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
/* 1 */             serialDescriptorArr.getClass();
/* 18 */            int iHashCode = (serialDescriptor.mo130a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
/* 19 */            int iMo135f = serialDescriptor.mo135f();
/* 24 */            int i = 1;
                    while (true) {
/* 25 */                int iHashCode2 = 0;
/* 31 */                if (!(iMo135f > 0)) {
                            break;
                        }
/* 37 */                int i2 = iMo135f - 1;
/* 44 */                int i3 = i * 31;
/* 46 */                String strMo130a = serialDescriptor.mo138i(serialDescriptor.mo135f() - iMo135f).mo130a();
/* 50 */                if (strMo130a != null) {
/* 52 */                    iHashCode2 = strMo130a.hashCode();
                        }
/* 56 */                i = i3 + iHashCode2;
/* 57 */                iMo135f = i2;
                    }
/* 59 */            int iMo135f2 = serialDescriptor.mo135f();
/* 63 */            int iHashCode3 = 1;
                    while (true) {
/* 69 */                if (!(iMo135f2 > 0)) {
/* 104 */                   return (((iHashCode * 31) + i) * 31) + iHashCode3;
                        }
/* 75 */                int i4 = iMo135f2 - 1;
/* 82 */                int i5 = iHashCode3 * 31;
/* 84 */                py0 py0VarMo134e = serialDescriptor.mo138i(serialDescriptor.mo135f() - iMo135f2).mo134e();
/* 96 */                iHashCode3 = i5 + (py0VarMo134e != null ? py0VarMo134e.hashCode() : 0);
/* 97 */                iMo135f2 = i4;
                    }
                }

                /* JADX INFO: renamed from: C */
                public abstract void mo5990C(Throwable th);

                /* JADX INFO: renamed from: D */
                public abstract void mo5991D(ra2 ra2Var);
            }
