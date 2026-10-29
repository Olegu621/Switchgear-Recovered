            package p000;

            import android.app.AppOpsManager;
            import android.content.ContentProviderClient;
            import android.content.ContentUris;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.ProviderInfo;
            import android.content.pm.Signature;
            import android.content.res.Resources;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.Binder;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.Process;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import com.google.android.gms.common.Feature;
            import com.usercentrics.sdk.p008ui.color.UsercentricsShadedColor;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class qj3 {

                /* JADX INFO: renamed from: a */
                public static final kl0 f15580a = new kl0(0);

                /* JADX INFO: renamed from: b */
                public static final byte[] f15581b = {48, 49, 53, 0};

                /* JADX INFO: renamed from: c */
                public static final byte[] f15582c = {48, 49, 48, 0};

                /* JADX INFO: renamed from: d */
                public static final byte[] f15583d = {48, 48, 57, 0};

                /* JADX INFO: renamed from: e */
                public static final byte[] f15584e = {48, 48, 53, 0};

                /* JADX INFO: renamed from: f */
                public static final byte[] f15585f = {48, 48, 49, 0};

                /* JADX INFO: renamed from: g */
                public static final byte[] f15586g = {48, 48, 49, 0};

                /* JADX INFO: renamed from: h */
                public static final byte[] f15587h = {48, 48, 50, 0};

                /* JADX INFO: renamed from: i */
                public static final Feature f15588i = new Feature("account_capability_api", 1);

                /* JADX INFO: renamed from: j */
                public static final Feature f15589j = new Feature("google_auth_service_accounts", 2);

                /* JADX INFO: renamed from: k */
                public static final Feature f15590k = new Feature("google_auth_service_token", 3);

                /* JADX INFO: renamed from: l */
                public static final Feature f15591l = new Feature("work_account_client_is_whitelisted", 1);

                /* JADX INFO: renamed from: m */
                public static int f15592m;

                /* JADX INFO: renamed from: A */
                public static Double m7868A(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             if (iM7875H == 0) {
/* 7 */                 return null;
                    }
/* 11 */            m7888U(parcel, iM7875H, 8);
/* 18 */            return Double.valueOf(parcel.readDouble());
                }

                /* JADX INFO: renamed from: B */
                public static float m7869B(int i, Parcel parcel) {
/* 2 */             m7887T(parcel, i, 4);
/* 5 */             return parcel.readFloat();
                }

                /* JADX INFO: renamed from: C */
                public static IBinder m7870C(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            IBinder strongBinder = parcel.readStrongBinder();
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return strongBinder;
                }

                /* JADX INFO: renamed from: D */
                public static int m7871D(int i, Parcel parcel) {
/* 2 */             m7887T(parcel, i, 4);
/* 5 */             return parcel.readInt();
                }

                /* JADX INFO: renamed from: E */
                public static Integer m7872E(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             if (iM7875H == 0) {
/* 7 */                 return null;
                    }
/* 10 */            m7888U(parcel, iM7875H, 4);
/* 17 */            return Integer.valueOf(parcel.readInt());
                }

                /* JADX INFO: renamed from: F */
                public static long m7873F(int i, Parcel parcel) {
/* 3 */             m7887T(parcel, i, 8);
/* 6 */             return parcel.readLong();
                }

                /* JADX INFO: renamed from: G */
                public static Long m7874G(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             if (iM7875H == 0) {
/* 7 */                 return null;
                    }
/* 11 */            m7888U(parcel, iM7875H, 8);
/* 18 */            return Long.valueOf(parcel.readLong());
                }

                /* JADX INFO: renamed from: H */
                public static int m7875H(int i, Parcel parcel) {
                    return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
                }

                /* JADX INFO: renamed from: I */
                public static final Object m7876I(mo2 mo2Var, Function2 function2) throws Throwable {
                    Object c1980nx;
                    Object objM10239E;
/* 26 */            hu0.m4343n0(mo2Var, false, new f90(w11.m9440m(mo2Var.f15010f.getContext()).mo3417c(mo2Var.f13894i, mo2Var, mo2Var.f9377e)), 3);
                    try {
/* 31 */                if (function2 instanceof AbstractC0181bi) {
/* 41 */                    gs2.m4011b(2, function2);
/* 44 */                    c1980nx = function2.invoke(mo2Var, mo2Var);
                        } else {
/* 33 */                    c1980nx = mz0.m6835c(function2, mo2Var, mo2Var);
                        }
                    } catch (Throwable th) {
/* 51 */                c1980nx = new C1980nx(false, th);
                    }
/* 55 */            z10 z10Var = z10.f19902a;
/* 57 */            if (c1980nx == z10Var || (objM10239E = mo2Var.m10239E(c1980nx)) == j13.f11997g) {
/* 104 */               return z10Var;
                    }
/* 71 */            if (objM10239E instanceof C1980nx) {
/* 75 */                Throwable th2 = ((C1980nx) objM10239E).f14555a;
/* 79 */                if (!(th2 instanceof lo2) || ((lo2) th2).f13434a != mo2Var) {
/* 98 */                    throw th2;
                        }
/* 90 */                if (c1980nx instanceof C1980nx) {
/* 97 */                    throw ((C1980nx) c1980nx).f14555a;
                        }
                    } else {
/* 99 */                c1980nx = j13.m5637B(objM10239E);
                    }
/* 103 */           return c1980nx;
                }

                /* JADX INFO: renamed from: J */
                public static String m7877J(C2566zw c2566zw, double d) {
/* 8 */             double d2 = (((d * 2.0d) - 1.0d) + 1.0d) / 2.0d;
/* 19 */            double d3 = 255.0d * (1.0d - d2);
/* 21 */            double dFloor = Math.floor((((double) c2566zw.f20357a) * d2) + d3);
/* 30 */            double dFloor2 = Math.floor((((double) c2566zw.f20359c) * d2) + d3);
/* 43 */            int i = (int) dFloor;
/* 44 */            int iFloor = (int) Math.floor((((double) c2566zw.f20358b) * d2) + d3);
/* 46 */            C2513yw c2513yw = C2566zw.Companion;
/* 62 */            return AbstractC0886en.m3509m("#", C2513yw.m10187a(c2513yw, i), C2513yw.m10187a(c2513yw, (int) dFloor2), C2513yw.m10187a(c2513yw, iFloor));
                }

                /* JADX INFO: renamed from: K */
                public static void m7878K(int i, Parcel parcel) {
/* 10 */            parcel.setDataPosition(parcel.dataPosition() + m7875H(i, parcel));
                }

                /* JADX INFO: renamed from: L */
                public static C2466xm m7879L(ArrayList arrayList, y92 y92Var, nt0 nt0Var) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 30 */                arrayList2.add(w11.m9453w(((d70) it.next()).m2953c()));
                    }
/* 66 */            return py0.m7599Y(new C2080pr(2, py0.m7599Y(new bp0(new f81(new ArrayList(arrayList2), false, pg3.m7428g()), 5000L, nt0Var)), y92Var, arrayList));
                }

                /* JADX INFO: renamed from: M */
                public static final int m7880M(b11 b11Var, SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             py0 py0VarMo134e = serialDescriptor.mo134e();
/* 10 */            if (py0VarMo134e instanceof lt1) {
/* 12 */                return 4;
                    }
/* 20 */            if (Intrinsics.m6216a(py0VarMo134e, ei2.f7699l)) {
/* 22 */                return 2;
                    }
/* 30 */            if (!Intrinsics.m6216a(py0VarMo134e, ei2.f7700m)) {
/* 67 */                return 1;
                    }
/* 39 */            SerialDescriptor serialDescriptorM7890a = m7890a(serialDescriptor.mo138i(0), b11Var.f2163b);
/* 43 */            py0 py0VarMo134e2 = serialDescriptorM7890a.mo134e();
/* 49 */            if ((py0VarMo134e2 instanceof gx1) || Intrinsics.m6216a(py0VarMo134e2, ca2.f2798k)) {
/* 65 */                return 3;
                    }
/* 64 */            throw kb1.m6049b(serialDescriptorM7890a);
                }

                /* JADX INFO: renamed from: N */
                public static void m7881N(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, byte[] bArr, int i5) {
/* 1 */             byte[] bArr2 = new byte[i];
/* 5 */             for (int i6 = 0; i6 < i4; i6++) {
/* 9 */                 byteBuffer.position(i6 * i);
/* 12 */                byteBuffer.get(bArr2, 0, i);
/* 16 */                int i7 = 0;
/* 17 */                for (int i8 = 0; i8 < i3; i8++) {
/* 21 */                    bArr[i5] = bArr2[i7];
/* 23 */                    i5 += 2;
/* 25 */                    i7 += i2;
                        }
                    }
                }

                /* JADX INFO: renamed from: O */
                public static final List m7882O(List list, List list2) {
/* 1 */             list.getClass();
/* 4 */             list2.getClass();
/* 13 */            int iM6962c = nc1.m6962c(C2122qw.m8020h(list, 10));
/* 19 */            if (iM6962c < 16) {
/* 21 */                iM6962c = 16;
                    }
/* 24 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iM6962c);
/* 35 */            for (Object obj : list) {
/* 46 */                linkedHashMap.put(((m61) obj).f13580f, obj);
                    }
/* 52 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
/* 55 */            Iterator it = list2.iterator();
/* 63 */            while (it.hasNext()) {
/* 69 */                m61 m61Var = (m61) it.next();
/* 73 */                linkedHashMap2.put(m61Var.f13580f, m61Var);
                    }
/* 81 */            return CollectionsKt.m6192K(linkedHashMap2.values());
                }

                /* JADX INFO: renamed from: P */
                public static int m7883P(Parcel parcel) {
/* 1 */             int i = parcel.readInt();
/* 5 */             int iM7875H = m7875H(i, parcel);
/* 9 */             char c = (char) i;
/* 10 */            int iDataPosition = parcel.dataPosition();
/* 16 */            if (c != 20293) {
/* 97 */                throw new g62("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
                    }
/* 18 */            int i2 = iM7875H + iDataPosition;
/* 19 */            if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
/* 27 */                return i2;
                    }
/* 51 */            StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
/* 56 */            sb.append("Size read is invalid start=");
/* 59 */            sb.append(iDataPosition);
/* 64 */            sb.append(" end=");
/* 67 */            sb.append(i2);
/* 77 */            throw new g62(sb.toString(), parcel);
                }

                /* JADX INFO: renamed from: Q */
                public static final Object m7884Q(long j, Function2 function2, c10 c10Var) throws Throwable {
/* 5 */             if (j <= 0) {
/* 27 */                throw new lo2("Timed out immediately", null);
                    }
/* 12 */            Object objM7876I = m7876I(new mo2(j, c10Var), function2);
/* 16 */            z10 z10Var = z10.f19902a;
/* 18 */            return objM7876I;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: R */
                public static final Object m7885R(long j, Function2 function2, c10 c10Var) throws Throwable {
                    no2 no2Var;
                    h22 h22Var;
/* 3 */             if (c10Var instanceof no2) {
/* 6 */                 no2Var = (no2) c10Var;
/* 8 */                 int i = no2Var.f14395c;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    no2Var.f14395c = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    no2Var = new no2(c10Var);
                        }
                    } else {
/* 22 */                no2Var = new no2(c10Var);
                    }
/* 25 */            Object obj = no2Var.f14394b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = no2Var.f14395c;
/* 33 */            if (i2 == 0) {
/* 51 */                pg3.m7417A(obj);
/* 58 */                if (j > 0) {
/* 63 */                    h22 h22Var2 = new h22();
                            try {
/* 66 */                        no2Var.f14393a = h22Var2;
/* 68 */                        no2Var.f14395c = 1;
/* 72 */                        mo2 mo2Var = new mo2(j, no2Var);
/* 75 */                        h22Var2.f8873a = mo2Var;
/* 77 */                        Object objM7876I = m7876I(mo2Var, function2);
                                return objM7876I == z10Var ? z10Var : objM7876I;
                            } catch (lo2 e) {
/* 85 */                        e = e;
/* 86 */                        h22Var = h22Var2;
                            }
                        }
/* 31 */                return null;
                    }
/* 35 */            if (i2 != 1) {
/* 47 */                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 37 */            h22Var = no2Var.f14393a;
                    try {
/* 39 */                pg3.m7417A(obj);
/* 42 */                return obj;
                    } catch (lo2 e2) {
/* 43 */                e = e2;
                    }
/* 91 */            if (e.f13434a != h22Var.f8873a) {
/* 94 */                throw e;
                    }
/* 31 */            return null;
                }

                /* JADX INFO: renamed from: S */
                public static String m7886S(Context context, String str) {
/* 1 */             kb1.m6061n(context);
/* 4 */             Resources resources = context.getResources();
/* 12 */            if (TextUtils.isEmpty(str)) {
/* 14 */                str = yy1.m10208O(context);
                    }
/* 22 */            int identifier = resources.getIdentifier("google_app_id", "string", str);
/* 27 */            if (identifier == 0) {
/* 26 */                return null;
                    }
                    try {
/* 30 */                return resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
/* 26 */                return null;
                    }
                }

                /* JADX INFO: renamed from: T */
                public static void m7887T(Parcel parcel, int i, int i2) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             if (iM7875H == i2) {
/* 7 */                 return;
                    }
/* 10 */            String hexString = Integer.toHexString(iM7875H);
/* 18 */            int length = String.valueOf(i2).length();
/* 48 */            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iM7875H).length() + 4 + 1);
/* 53 */            sb.append("Expected size ");
/* 56 */            sb.append(i2);
/* 61 */            sb.append(" got ");
/* 64 */            sb.append(iM7875H);
/* 78 */            throw new g62(fm0.m3790p(sb, " (0x", hexString, ")"), parcel);
                }

                /* JADX INFO: renamed from: U */
                public static void m7888U(Parcel parcel, int i, int i2) {
/* 1 */             if (i == i2) {
/* 3 */                 return;
                    }
/* 6 */             String hexString = Integer.toHexString(i);
/* 14 */            int length = String.valueOf(i2).length();
/* 44 */            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
/* 49 */            sb.append("Expected size ");
/* 52 */            sb.append(i2);
/* 57 */            sb.append(" got ");
/* 60 */            sb.append(i);
/* 74 */            throw new g62(fm0.m3790p(sb, " (0x", hexString, ")"), parcel);
                }

                /* JADX INFO: renamed from: V */
                public static String m7889V(String str, String[] strArr, String[] strArr2) {
/* 3 */             int iMin = Math.min(strArr.length, strArr2.length);
/* 8 */             for (int i = 0; i < iMin; i++) {
/* 10 */                String str2 = strArr[i];
/* 12 */                if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
/* 25 */                    return strArr2[i];
                        }
                    }
/* 31 */            return null;
                }

                /* JADX INFO: renamed from: a */
                public static final SerialDescriptor m7890a(SerialDescriptor serialDescriptor, C0168b5 c0168b5) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             c0168b5.getClass();
/* 17 */            if (!Intrinsics.m6216a(serialDescriptor.mo134e(), ba2.f2339k)) {
                        return serialDescriptor.isInline() ? m7890a(serialDescriptor.mo138i(0), c0168b5) : serialDescriptor;
                    }
/* 19 */            o21 o21VarM4186g = he3.m4186g(serialDescriptor);
/* 23 */            if (o21VarM4186g == null) {
/* 61 */                return serialDescriptor;
                    }
/* 27 */            nd0.f14189a.getClass();
/* 38 */            if (((Map) c0168b5.f2211b).get(o21VarM4186g) == null) {
/* 61 */                return serialDescriptor;
                    }
/* 41 */            C1697u2.m5431g();
/* 44 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public static int m7891b(Context context, String str) {
                    int iM4514c;
/* 1 */             int iMyPid = Process.myPid();
/* 5 */             int iMyUid = Process.myUid();
/* 9 */             String packageName = context.getPackageName();
/* 18 */            if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
/* 21 */                String strM4515d = AbstractC1023ic.m4515d(str);
/* 26 */                if (strM4515d != null) {
/* 29 */                    if (packageName == null) {
/* 35 */                        String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
/* 39 */                        if (packagesForUid != null && packagesForUid.length > 0) {
/* 45 */                            packageName = packagesForUid[0];
                                }
                            }
/* 49 */                    int iMyUid2 = Process.myUid();
/* 53 */                    String packageName2 = context.getPackageName();
/* 59 */                    if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
/* 73 */                        AppOpsManager appOpsManagerM5769c = AbstractC1788jc.m5769c(context);
/* 81 */                        iM4514c = AbstractC1788jc.m5767a(appOpsManagerM5769c, strM4515d, Binder.getCallingUid(), packageName);
/* 85 */                        if (iM4514c == 0) {
/* 92 */                            iM4514c = AbstractC1788jc.m5767a(appOpsManagerM5769c, strM4515d, iMyUid, AbstractC1788jc.m5768b(context));
                                }
                            } else {
/* 103 */                       iM4514c = AbstractC1023ic.m4514c((AppOpsManager) AbstractC1023ic.m4512a(context, AppOpsManager.class), strM4515d, packageName);
                            }
/* 118 */                   if (iM4514c != 0) {
/* 121 */                       return -2;
                            }
                        }
/* 25 */                return 0;
                    }
/* 17 */            return -1;
                }

                /* JADX INFO: renamed from: c */
                public static int m7892c(int i, int i2, int i3) {
/* 1 */             if (i < i2) {
/* 3 */                 return i2;
                    }
                    return i > i3 ? i3 : i;
                }

                /* JADX INFO: renamed from: d */
                public static BigDecimal m7893d(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            byte[] bArrCreateByteArray = parcel.createByteArray();
/* 17 */            int i2 = parcel.readInt();
/* 22 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 32 */            return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
                }

                /* JADX INFO: renamed from: e */
                public static boolean[] m7894e(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return zArrCreateBooleanArray;
                }

                /* JADX INFO: renamed from: f */
                public static Bundle m7895f(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            Bundle bundle = parcel.readBundle();
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return bundle;
                }

                /* JADX INFO: renamed from: g */
                public static byte[] m7896g(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            byte[] bArrCreateByteArray = parcel.createByteArray();
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return bArrCreateByteArray;
                }

                /* JADX INFO: renamed from: h */
                public static int[] m7897h(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            int[] iArrCreateIntArray = parcel.createIntArray();
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return iArrCreateIntArray;
                }

                /* JADX INFO: renamed from: i */
                public static Parcelable m7898i(Parcel parcel, int i, Parcelable.Creator creator) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 17 */            Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
/* 20 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 23 */            return parcelable;
                }

                /* JADX INFO: renamed from: j */
                public static String m7899j(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            String string = parcel.readString();
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return string;
                }

                /* JADX INFO: renamed from: k */
                public static String[] m7900k(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            String[] strArrCreateStringArray = parcel.createStringArray();
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return strArrCreateStringArray;
                }

                /* JADX INFO: renamed from: l */
                public static ArrayList m7901l(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return arrayListCreateStringArrayList;
                }

                /* JADX INFO: renamed from: m */
                public static Object[] m7902m(Parcel parcel, int i, Parcelable.Creator creator) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return objArrCreateTypedArray;
                }

                /* JADX INFO: renamed from: n */
                public static ArrayList m7903n(Parcel parcel, int i, Parcelable.Creator creator) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             int iDataPosition = parcel.dataPosition();
/* 9 */             if (iM7875H == 0) {
/* 11 */                return null;
                    }
/* 13 */            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
/* 18 */            parcel.setDataPosition(iDataPosition + iM7875H);
/* 21 */            return arrayListCreateTypedArrayList;
                }

                /* JADX INFO: renamed from: o */
                public static byte[] m7904o(byte[] bArr) {
/* 4 */             if (bArr.length != 16) {
/* 57 */                C1951n4.m6859j("value must be a block.");
/* 60 */                return null;
                    }
/* 6 */             byte[] bArr2 = new byte[16];
/* 12 */            for (int i = 0; i < 16; i++) {
/* 20 */                byte b = (byte) ((bArr[i] << 1) & 254);
/* 21 */                bArr2[i] = b;
/* 23 */                if (i < 15) {
/* 36 */                    bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
                        }
                    }
/* 52 */            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
/* 54 */            return bArr2;
                }

                /* JADX INFO: renamed from: p */
                public static byte[] m7905p(String str) {
/* 8 */             if (str.length() % 2 != 0) {
/* 66 */                C1951n4.m6859j("Expected a string of even length");
/* 7 */                 return null;
                    }
/* 14 */            int length = str.length() / 2;
/* 16 */            byte[] bArr = new byte[length];
/* 19 */            for (int i = 0; i < length; i++) {
/* 21 */                int i2 = i * 2;
/* 29 */                int iDigit = Character.digit(str.charAt(i2), 16);
/* 39 */                int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
/* 44 */                if (iDigit == -1 || iDigit2 == -1) {
/* 59 */                    C1951n4.m6859j("input is not hexadecimal");
/* 7 */                     return null;
                        }
/* 52 */                bArr[i] = (byte) ((iDigit * 16) + iDigit2);
                    }
/* 63 */            return bArr;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x006c  */
                /* JADX WARN: Code duplicated, block: B:28:0x006d  */
                /* JADX WARN: Code duplicated, block: B:31:0x0078 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
                /* JADX WARN: Code duplicated, block: B:33:0x007e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
                /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
                /* JADX WARN: Code duplicated, block: B:38:0x0095 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
                /* JADX WARN: Code duplicated, block: B:40:0x009e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
                /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
                
                    if (r2.emit(r11, r0) == r1) goto L37;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0092 -> B:14:0x0032). Please report as a decompilation issue!!! */
                /* JADX INFO: renamed from: q */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object m7906q(hk0 hk0Var, xx1 xx1Var, boolean z, d10 d10Var) throws Throwable {
                    ik0 ik0Var;
                    C2501yk c2501yk;
                    InterfaceC2509ys interfaceC2509ys;
                    C2501yk c2501yk2;
                    hk0 hk0Var2;
                    Object obj;
                    C2131r4 c2131r4;
                    InterfaceC2509ys interfaceC2509ys2;
                    InterfaceC2509ys interfaceC2509ys3;
/* 3 */             if (d10Var instanceof ik0) {
/* 6 */                 ik0Var = (ik0) d10Var;
/* 8 */                 int i = ik0Var.f9676f;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ik0Var.f9676f = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ik0Var = new ik0(d10Var);
                        }
                    } else {
/* 22 */                ik0Var = new ik0(d10Var);
                    }
/* 25 */            Object objM10155b = ik0Var.f9675e;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = ik0Var.f9676f;
                    try {
/* 34 */                if (i2 == 0) {
/* 76 */                    pg3.m7417A(objM10155b);
/* 81 */                    if (hk0Var instanceof go2) {
/* 206 */                       throw ((go2) hk0Var).f8754a;
                            }
/* 83 */                    C2554zk c2554zk = xx1Var.f19390f;
/* 85 */                    c2554zk.getClass();
/* 90 */                    c2501yk = new C2501yk(c2554zk);
                            interfaceC2509ys2 = xx1Var;
/* 93 */                    ik0Var.f9671a = hk0Var;
/* 95 */                    ik0Var.f9672b = interfaceC2509ys2;
/* 97 */                    ik0Var.f9673c = c2501yk;
/* 99 */                    ik0Var.f9674d = z;
/* 101 */                   ik0Var.f9676f = 1;
/* 103 */                   objM10155b = c2501yk.m10155b(ik0Var);
/* 107 */                   if (objM10155b == z10Var) {
/* 110 */                       C2501yk c2501yk3 = c2501yk;
/* 111 */                       hk0Var2 = hk0Var;
/* 112 */                       c2501yk2 = c2501yk3;
                                interfaceC2509ys = interfaceC2509ys2;
/* 119 */                       if (!((Boolean) objM10155b).booleanValue()) {
/* 167 */                           if (z) {
/* 169 */                               interfaceC2509ys.cancel(null);
                                    }
/* 172 */                           return Unit.f12910a;
                                }
/* 121 */                       obj = c2501yk2.f19667a;
/* 123 */                       c2131r4 = AbstractC0184bl.f2511p;
/* 125 */                       if (obj == c2131r4) {
/* 166 */                           throw new IllegalStateException("`hasNext()` has not been invoked");
                                }
/* 127 */                       c2501yk2.f19667a = c2131r4;
/* 131 */                       if (obj == AbstractC0184bl.f2507l) {
/* 152 */                           Throwable thM10391o = c2501yk2.f19669c.m10391o();
/* 156 */                           int i3 = fg2.f8205a;
/* 158 */                           throw thM10391o;
                                }
/* 133 */                       ik0Var.f9671a = hk0Var2;
/* 135 */                       ik0Var.f9672b = interfaceC2509ys;
/* 137 */                       ik0Var.f9673c = c2501yk2;
/* 139 */                       ik0Var.f9674d = z;
/* 141 */                       ik0Var.f9676f = 2;
                            }
                            interfaceC2509ys3 = interfaceC2509ys;
/* 149 */                   return z10Var;
                        }
/* 36 */                if (i2 == 1) {
/* 64 */                    z = ik0Var.f9674d;
/* 66 */                    c2501yk2 = ik0Var.f9673c;
/* 68 */                    InterfaceC2509ys interfaceC2509ys4 = ik0Var.f9672b;
/* 70 */                    hk0Var2 = ik0Var.f9671a;
/* 72 */                    pg3.m7417A(objM10155b);
                            interfaceC2509ys = interfaceC2509ys4;
/* 119 */                   if (!((Boolean) objM10155b).booleanValue()) {
/* 167 */                       if (z) {
/* 169 */                           interfaceC2509ys.cancel(null);
                                }
/* 172 */                       return Unit.f12910a;
                            }
/* 121 */                   obj = c2501yk2.f19667a;
/* 123 */                   c2131r4 = AbstractC0184bl.f2511p;
/* 125 */                   if (obj == c2131r4) {
/* 166 */                       throw new IllegalStateException("`hasNext()` has not been invoked");
                            }
/* 127 */                   c2501yk2.f19667a = c2131r4;
/* 131 */                   if (obj == AbstractC0184bl.f2507l) {
/* 152 */                       Throwable thM10391o2 = c2501yk2.f19669c.m10391o();
/* 156 */                       int i4 = fg2.f8205a;
/* 158 */                       throw thM10391o2;
                            }
/* 133 */                   ik0Var.f9671a = hk0Var2;
/* 135 */                   ik0Var.f9672b = interfaceC2509ys;
/* 137 */                   ik0Var.f9673c = c2501yk2;
/* 139 */                   ik0Var.f9674d = z;
/* 141 */                   ik0Var.f9676f = 2;
                        } else {
/* 38 */                    if (i2 != 2) {
/* 60 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 40 */                    z = ik0Var.f9674d;
/* 42 */                    c2501yk2 = ik0Var.f9673c;
/* 44 */                    InterfaceC2509ys interfaceC2509ys5 = ik0Var.f9672b;
/* 46 */                    hk0Var2 = ik0Var.f9671a;
/* 48 */                    pg3.m7417A(objM10155b);
                            interfaceC2509ys3 = interfaceC2509ys5;
                        }
                        interfaceC2509ys3 = interfaceC2509ys;
/* 51 */                hk0 hk0Var3 = hk0Var2;
/* 52 */                c2501yk = c2501yk2;
/* 53 */                hk0Var = hk0Var3;
                        interfaceC2509ys2 = interfaceC2509ys3;
/* 93 */                ik0Var.f9671a = hk0Var;
/* 95 */                ik0Var.f9672b = interfaceC2509ys2;
/* 97 */                ik0Var.f9673c = c2501yk;
/* 99 */                ik0Var.f9674d = z;
/* 101 */               ik0Var.f9676f = 1;
/* 103 */               objM10155b = c2501yk.m10155b(ik0Var);
/* 107 */               if (objM10155b == z10Var) {
/* 110 */                   C2501yk c2501yk4 = c2501yk;
/* 111 */                   hk0Var2 = hk0Var;
/* 112 */                   c2501yk2 = c2501yk4;
                            interfaceC2509ys = interfaceC2509ys2;
/* 119 */                   if (!((Boolean) objM10155b).booleanValue()) {
/* 167 */                       if (z) {
/* 169 */                           interfaceC2509ys.cancel(null);
                                }
/* 172 */                       return Unit.f12910a;
                            }
/* 121 */                   obj = c2501yk2.f19667a;
/* 123 */                   c2131r4 = AbstractC0184bl.f2511p;
/* 125 */                   if (obj == c2131r4) {
/* 166 */                       throw new IllegalStateException("`hasNext()` has not been invoked");
                            }
/* 127 */                   c2501yk2.f19667a = c2131r4;
/* 131 */                   if (obj == AbstractC0184bl.f2507l) {
/* 152 */                       Throwable thM10391o3 = c2501yk2.f19669c.m10391o();
/* 156 */                       int i5 = fg2.f8205a;
/* 158 */                       throw thM10391o3;
                            }
/* 133 */                   ik0Var.f9671a = hk0Var2;
/* 135 */                   ik0Var.f9672b = interfaceC2509ys;
/* 137 */                   ik0Var.f9673c = c2501yk2;
/* 139 */                   ik0Var.f9674d = z;
/* 141 */                   ik0Var.f9676f = 2;
                        }
                        interfaceC2509ys3 = interfaceC2509ys;
/* 149 */               return z10Var;
                    } catch (Throwable th) {
                        try {
/* 175 */                   throw th;
                        } catch (Throwable th2) {
/* 177 */                   if (z) {
/* 181 */                       CancellationException cancellationException = th instanceof CancellationException ? th : null;
/* 186 */                       if (cancellationException == null) {
/* 192 */                           cancellationException = new CancellationException("Channel was consumed, consumer had failed");
/* 195 */                           cancellationException.initCause(th);
                                }
/* 198 */                       xx1Var.cancel(cancellationException);
                            }
/* 201 */                   throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public static String m7907r(byte[] bArr) {
/* 6 */             StringBuilder sb = new StringBuilder(bArr.length * 2);
/* 11 */            for (byte b : bArr) {
/* 15 */                int i = b & 255;
/* 25 */                sb.append("0123456789abcdef".charAt(i / 16));
/* 34 */                sb.append("0123456789abcdef".charAt(i % 16));
                    }
/* 40 */            return sb.toString();
                }

                /* JADX INFO: renamed from: s */
                public static void m7908s(int i, Parcel parcel) {
/* 5 */             if (parcel.dataPosition() != i) {
/* 34 */                throw new g62(fm0.m3788n(new StringBuilder(String.valueOf(i).length() + 26), "Overread allowed size end=", i), parcel);
                    }
                }

                /* JADX INFO: renamed from: t */
                public static final String m7909t(String str, String str2) {
/* 1 */             if (str2 == null) {
/* 3 */                 str2 = "CCPA";
                    }
/* 7 */             return C1852e.m6261k(str, "##us_framework##", str2);
                }

                /* JADX INFO: renamed from: u */
                public static UsercentricsShadedColor m7910u(String str) {
/* 1 */             str.getClass();
/* 4 */             C2513yw c2513yw = C2566zw.Companion;
/* 6 */             c2513yw.getClass();
/* 9 */             C2566zw c2566zwM10188b = C2513yw.m10188b(str);
/* 66 */            return new UsercentricsShadedColor(AbstractC0886en.m3509m("#", C2513yw.m10187a(c2513yw, c2566zwM10188b.f20357a), C2513yw.m10187a(c2513yw, c2566zwM10188b.f20359c), C2513yw.m10187a(c2513yw, c2566zwM10188b.f20358b)), m7877J(c2566zwM10188b, 0.8d), m7877J(c2566zwM10188b, 0.16d), m7877J(c2566zwM10188b, 0.02d));
                }

                /* JADX INFO: renamed from: v */
                public static C1954n7 m7911v(C0168b5 c0168b5, Context context) throws PackageManager.NameNotFoundException {
                    Cursor cursorQuery;
/* 3 */             PackageManager packageManager = context.getPackageManager();
/* 7 */             Resources resources = context.getResources();
/* 13 */            String str = (String) c0168b5.f2211b;
/* 17 */            String str2 = (String) c0168b5.f2212c;
/* 19 */            int i = 0;
/* 20 */            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
/* 24 */            if (providerInfoResolveContentProvider == null) {
/* 459 */               throw new PackageManager.NameNotFoundException(AbstractC0886en.m3507k("No package found for authority: ", str));
                    }
/* 32 */            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
/* 447 */               throw new PackageManager.NameNotFoundException(AbstractC0886en.m3509m("Found content provider ", str, ", but package was not ", str2));
                    }
/* 42 */            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
/* 46 */            ArrayList arrayList = new ArrayList();
/* 51 */            for (Signature signature : signatureArr) {
/* 59 */                arrayList.add(signature.toByteArray());
                    }
/* 65 */            kl0 kl0Var = f15580a;
/* 67 */            Collections.sort(arrayList, kl0Var);
/* 72 */            List listM5656r = (List) c0168b5.f2214e;
/* 74 */            if (listM5656r == null) {
/* 77 */                listM5656r = j13.m5656r(resources, 0);
                    }
/* 81 */            int i2 = 0;
                    loop1: while (true) {
/* 86 */                cursorQuery = null;
/* 87 */                if (i2 >= listM5656r.size()) {
/* 145 */                   providerInfoResolveContentProvider = null;
                            break;
                        }
/* 97 */                ArrayList arrayList2 = new ArrayList((Collection) listM5656r.get(i2));
/* 100 */               Collections.sort(arrayList2, kl0Var);
/* 111 */               if (arrayList.size() == arrayList2.size()) {
/* 114 */                   int i3 = 0;
                            while (true) {
/* 119 */                       if (i3 >= arrayList.size()) {
                                    break loop1;
                                }
/* 137 */                       if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                                    break;
                                }
/* 142 */                       i3++;
                            }
                        }
/* 139 */               i2++;
                    }
/* 146 */           int i4 = 4;
/* 147 */           int i5 = 1;
/* 148 */           if (providerInfoResolveContentProvider == null) {
/* 152 */               return new C1954n7(i5, cursorQuery, i4);
                    }
/* 156 */           String str3 = providerInfoResolveContentProvider.authority;
/* 160 */           ArrayList arrayList3 = new ArrayList();
/* 178 */           Uri uriBuild = new Uri.Builder().scheme("content").authority(str3).build();
/* 201 */           Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
/* 209 */           ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                    try {
/* 227 */               String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
/* 237 */               String[] strArr2 = {(String) c0168b5.f2213d};
/* 241 */               if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
/* 246 */                       cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException e) {
/* 256 */                       AbstractC1245n0.m4891s("FontsProvider", "Unable to query the content provider", e);
                            }
                        }
/* 259 */               if (cursorQuery != null && cursorQuery.getCount() > 0) {
/* 269 */                   int columnIndex = cursorQuery.getColumnIndex("result_code");
/* 275 */                   arrayList3 = new ArrayList();
/* 280 */                   int columnIndex2 = cursorQuery.getColumnIndex("_id");
/* 286 */                   int columnIndex3 = cursorQuery.getColumnIndex("file_id");
/* 292 */                   int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
/* 298 */                   int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
/* 304 */                   int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
/* 312 */                   while (cursorQuery.moveToNext()) {
/* 393 */                       arrayList3.add(new vl0(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                            }
                        }
/* 398 */               if (cursorQuery != null) {
/* 400 */                   cursorQuery.close();
                        }
/* 403 */               if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 405 */                   contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
/* 419 */               return new C1954n7(i, (vl0[]) arrayList3.toArray(new vl0[0]), 4);
                    } catch (Throwable th) {
/* 423 */               if (cursorQuery != null) {
/* 425 */                   cursorQuery.close();
                        }
/* 428 */               if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 430 */                   contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
/* 433 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: w */
                public static final C0890er m7912w(c10 c10Var) {
/* 3 */             if (!(c10Var instanceof p80)) {
/* 8 */                 return new C0890er(1, c10Var);
                    }
/* 15 */            C0890er c0890erM7349l = ((p80) c10Var).m7349l();
/* 19 */            if (c0890erM7349l != null) {
/* 25 */                if (!c0890erM7349l.m3551C()) {
/* 28 */                    c0890erM7349l = null;
                        }
/* 29 */                if (c0890erM7349l != null) {
/* 32 */                    return c0890erM7349l;
                        }
                    }
/* 36 */            return new C0890er(2, c10Var);
                }

                /* JADX INFO: renamed from: x */
                public static boolean m7913x(byte b) {
                    return b > -65;
                }

                /* JADX INFO: renamed from: y */
                public static boolean m7914y(int i, Parcel parcel) {
/* 2 */             m7887T(parcel, i, 4);
                    return parcel.readInt() != 0;
                }

                /* JADX INFO: renamed from: z */
                public static Boolean m7915z(int i, Parcel parcel) {
/* 1 */             int iM7875H = m7875H(i, parcel);
/* 5 */             if (iM7875H == 0) {
/* 7 */                 return null;
                    }
/* 10 */            m7888U(parcel, iM7875H, 4);
/* 22 */            return Boolean.valueOf(parcel.readInt() != 0);
                }
            }
