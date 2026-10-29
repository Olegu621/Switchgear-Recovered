            package p000;

            import com.usercentrics.sdk.p009v2.settings.data.TCF2ChangedPurposes;
            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
            import com.usercentrics.sdk.services.tcf.interfaces.IdAndConsent;
            import com.usercentrics.sdk.services.tcf.interfaces.IdAndName;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendorRestriction;
            import com.usercentrics.tcf.core.model.gvl.DataCategory;
            import com.usercentrics.tcf.core.model.gvl.DataRetention;
            import com.usercentrics.tcf.core.model.gvl.Feature;
            import com.usercentrics.tcf.core.model.gvl.GvlDataRetention;
            import com.usercentrics.tcf.core.model.gvl.Purpose;
            import com.usercentrics.tcf.core.model.gvl.RetentionPeriod;
            import com.usercentrics.tcf.core.model.gvl.Stack;
            import com.usercentrics.tcf.core.model.gvl.Vendor;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qk2 implements il2 {

                /* JADX INFO: renamed from: a */
                public final i03 f15598a;

                /* JADX INFO: renamed from: b */
                public final pc2 f15599b;

                /* JADX INFO: renamed from: c */
                public final g80 f15600c;

                /* JADX INFO: renamed from: d */
                public final InterfaceC1811jz f15601d;

                /* JADX INFO: renamed from: e */
                public final p91 f15602e;

                /* JADX INFO: renamed from: f */
                public final C2484y3 f15603f;

                /* JADX INFO: renamed from: g */
                public final fs0 f15604g;

                /* JADX INFO: renamed from: h */
                public final x80 f15605h;

                /* JADX INFO: renamed from: i */
                public final ib1 f15606i;

                /* JADX INFO: renamed from: j */
                public final jc2 f15607j;

                /* JADX INFO: renamed from: k */
                public final ArrayList f15608k;

                /* JADX INFO: renamed from: l */
                public final ArrayList f15609l;

                /* JADX INFO: renamed from: m */
                public ql2 f15610m;

                /* JADX INFO: renamed from: n */
                public TCFData f15611n;

                /* JADX INFO: renamed from: o */
                public final LinkedHashMap f15612o;

                /* JADX INFO: renamed from: p */
                public TCF2ChangedPurposes f15613p;

                /* JADX INFO: renamed from: q */
                public final ArrayList f15614q;

                public qk2(i03 i03Var, pc2 pc2Var, g80 g80Var, InterfaceC1811jz interfaceC1811jz, p91 p91Var, C2484y3 c2484y3, fs0 fs0Var, x80 x80Var, ib1 ib1Var, jc2 jc2Var) {
/* 1 */             i03Var.getClass();
/* 4 */             pc2Var.getClass();
/* 7 */             g80Var.getClass();
/* 10 */            interfaceC1811jz.getClass();
/* 13 */            p91Var.getClass();
/* 16 */            c2484y3.getClass();
/* 19 */            x80Var.getClass();
/* 22 */            jc2Var.getClass();
/* 28 */            this.f15598a = i03Var;
/* 30 */            this.f15599b = pc2Var;
/* 32 */            this.f15600c = g80Var;
/* 34 */            this.f15601d = interfaceC1811jz;
/* 36 */            this.f15602e = p91Var;
/* 38 */            this.f15603f = c2484y3;
/* 40 */            this.f15604g = fs0Var;
/* 42 */            this.f15605h = x80Var;
/* 44 */            this.f15606i = ib1Var;
/* 46 */            this.f15607j = jc2Var;
/* 53 */            this.f15608k = new ArrayList();
/* 60 */            this.f15609l = new ArrayList();
/* 67 */            this.f15612o = new LinkedHashMap();
/* 71 */            nd0 nd0Var = nd0.f14189a;
/* 76 */            this.f15613p = new TCF2ChangedPurposes(nd0Var, nd0Var, nd0Var);
/* 83 */            this.f15614q = new ArrayList();
                }

                /* JADX INFO: renamed from: c */
                public static List m7916c(LinkedHashSet linkedHashSet, List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return CollectionsKt.m6192K(linkedHashSet);
                    }
/* 14 */            ArrayList arrayList = new ArrayList();
/* 25 */            for (Object obj : linkedHashSet) {
/* 46 */                if (!list.contains(Integer.valueOf(((Number) obj).intValue()))) {
/* 48 */                    arrayList.add(obj);
                        }
                    }
/* 52 */            return arrayList;
                }

                /* JADX INFO: renamed from: m */
                public static boolean m7917m(List list, List list2, List list3) {
/* 5 */             if (list.isEmpty() && list2.isEmpty() && !list3.isEmpty()) {
/* 38 */                return true;
                    }
                    return (list.isEmpty() || !list2.isEmpty() || list3.isEmpty()) ? false : true;
                }

                /* JADX INFO: renamed from: p */
                public static ArrayList m7918p(ArrayList arrayList, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6) {
                    Boolean boolValueOf;
/* 9 */             ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 20 */            for (Object obj : arrayList) {
/* 36 */                Boolean boolValueOf2 = null;
/* 37 */                if (((Boolean) function6.invoke(obj)).booleanValue()) {
/* 39 */                    boolValueOf = Boolean.TRUE;
                        } else if (((Boolean) function3.invoke(obj)).booleanValue()) {
/* 58 */                    Boolean bool = (Boolean) function5.invoke(obj);
/* 68 */                    boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                        } else {
/* 73 */                    boolValueOf = null;
                        }
/* 82 */                int iIntValue = ((Number) function1.invoke(obj)).intValue();
/* 96 */                if (((Boolean) function2.invoke(obj)).booleanValue()) {
/* 102 */                   Boolean bool2 = (Boolean) function4.invoke(obj);
/* 112 */                   boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                        }
/* 119 */               arrayList2.add(new IdAndConsent(iIntValue, boolValueOf2, boolValueOf));
                    }
/* 123 */           return arrayList2;
                }

                /* JADX INFO: renamed from: q */
                public static ArrayList m7919q(ArrayList arrayList, List list) {
                    Object next;
                    Boolean boolMo5845b;
                    Boolean boolMo5844a;
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                IdAndConsent idAndConsent = (IdAndConsent) it.next();
/* 22 */                Iterator it2 = list.iterator();
/* 45 */                do {
/* 30 */                    if (!it2.hasNext()) {
/* 48 */                        next = null;
                                break;
                            }
/* 32 */                    next = it2.next();
/* 45 */                } while (((vk2) next).getId() != idAndConsent.f6154a);
/* 49 */                vk2 vk2Var = (vk2) next;
/* 51 */                int i = idAndConsent.f6154a;
/* 53 */                if (vk2Var == null || (boolMo5845b = vk2Var.mo5845b()) == null) {
/* 61 */                    boolMo5845b = idAndConsent.f6155b;
                        }
/* 63 */                if (vk2Var == null || (boolMo5844a = vk2Var.mo5844a()) == null) {
/* 71 */                    boolMo5844a = idAndConsent.f6156c;
                        }
/* 75 */                rk2 rk2Var = new rk2();
/* 78 */                rk2Var.f16139a = boolMo5845b;
/* 80 */                rk2Var.f16140b = i;
/* 82 */                rk2Var.f16141c = boolMo5844a;
/* 84 */                arrayList2.add(rk2Var);
                    }
/* 88 */            return arrayList2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m7920a(String str, d10 d10Var) {
                    jk2 jk2Var;
                    Object objM7933r;
/* 3 */             if (d10Var instanceof jk2) {
/* 6 */                 jk2Var = (jk2) d10Var;
/* 8 */                 int i = jk2Var.f12343d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    jk2Var.f12343d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    jk2Var = new jk2(this, d10Var);
                        }
                    } else {
/* 22 */                jk2Var = new jk2(this, d10Var);
                    }
/* 25 */            Object obj = jk2Var.f12341b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = jk2Var.f12343d;
/* 32 */            if (i2 == 0) {
/* 53 */                pg3.m7417A(obj);
/* 56 */                Set set = AbstractC0935fz.f8400a;
/* 58 */                str.getClass();
/* 61 */                Set set2 = AbstractC0935fz.f8400a;
/* 65 */                String upperCase = str.toUpperCase(Locale.ROOT);
/* 69 */                upperCase.getClass();
/* 76 */                if (!set2.contains(upperCase) && (str = AbstractC0935fz.m3857a(str)) == null) {
/* 86 */                    str = "en";
                        }
/* 88 */                jk2Var.f12340a = this;
/* 90 */                jk2Var.f12343d = 1;
/* 92 */                objM7933r = m7933r(str, jk2Var);
/* 96 */                if (objM7933r == z10Var) {
/* 98 */                    return z10Var;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 48 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                this = jk2Var.f12340a;
/* 38 */                pg3.m7417A(obj);
/* 43 */                objM7933r = ((o42) obj).f14613a;
                    }
/* 99 */            Throwable thM7099a = o42.m7099a(objM7933r);
/* 103 */           if (thM7099a != null) {
/* 107 */               return new n42(thM7099a);
                    }
/* 111 */           ql2 ql2Var = this.f15610m;
/* 113 */           if (ql2Var != null) {
/* 115 */               wp0 wp0Var = ql2Var.f15623b;
/* 117 */               TCF2Settings tCF2SettingsM7928j = this.m7928j();
/* 121 */               tCF2SettingsM7928j.getClass();
/* 124 */               List list = tCF2SettingsM7928j.f6486Q;
/* 126 */               list.getClass();
/* 129 */               wp0Var.m9598c(list);
                    }
/* 132 */           this.m7934s();
/* 135 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: b */
                public final ml2 m7921b(ml2 ml2Var) {
/* 1 */             List list = ml2Var.f13847a;
/* 3 */             if (list == null) {
/* 5 */                 list = nd0.f14189a;
                    }
/* 7 */             List list2 = ml2Var.f13849c;
/* 9 */             if (list2 == null) {
/* 11 */                list2 = nd0.f14189a;
                    }
/* 27 */            ArrayList arrayListM7918p = m7918p(this.f15609l, C0170b7.f2257b0, C0170b7.f2259c0, C0170b7.f2261d0, C0170b7.f2263e0, C0170b7.f2265f0, C0170b7.f2272l0);
/* 48 */            ArrayList arrayListM7918p2 = m7918p(this.f15608k, C0170b7.f2266g0, C0170b7.f2267h0, C0170b7.f2269i0, C0170b7.f2270j0, C0170b7.f2271k0, new nk2(this));
/* 52 */            ArrayList<rk2> arrayListM7919q = m7919q(arrayListM7918p, list);
/* 56 */            ArrayList<rk2> arrayListM7919q2 = m7919q(arrayListM7918p2, list2);
/* 68 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(arrayListM7919q, 10));
/* 79 */            for (rk2 rk2Var : arrayListM7919q) {
/* 98 */                arrayList.add(new jl2(rk2Var.f16140b, rk2Var.f16139a, rk2Var.f16141c));
                    }
/* 108 */           ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayListM7919q2, 10));
/* 119 */           for (rk2 rk2Var2 : arrayListM7919q2) {
/* 138 */               arrayList2.add(new ll2(rk2Var2.f16140b, rk2Var2.f16139a, rk2Var2.f16141c));
                    }
/* 148 */           return new ml2(arrayList, ml2Var.f13848b, arrayList2, nd0.f14189a);
                }

                /* JADX INFO: renamed from: d */
                public final boolean m7922d() {
/* 6 */             if (this.f15607j.f12216f) {
/* 5 */                 return false;
                    }
/* 9 */             TCF2Settings tCF2SettingsM7928j = m7928j();
                    return !(tCF2SettingsM7928j != null ? tCF2SettingsM7928j.f6487R : false) || this.f15602e.f15029b.m2819b();
                }

                /* JADX INFO: renamed from: e */
                public final List m7923e() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             ArrayList arrayList2 = new ArrayList();
/* 23 */            for (TCFVendor tCFVendor : m7929k()) {
/* 31 */                List list = tCFVendor.f6214i;
/* 41 */                ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(list, 10));
/* 44 */                Iterator it = list.iterator();
/* 52 */                while (it.hasNext()) {
/* 66 */                    arrayList3.add(Integer.valueOf(((IdAndName) it.next()).f6157a));
                        }
/* 70 */                arrayList.addAll(arrayList3);
/* 73 */                List list2 = tCFVendor.f6211f;
/* 81 */                ArrayList arrayList4 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 84 */                Iterator it2 = list2.iterator();
/* 92 */                while (it2.hasNext()) {
/* 106 */                   arrayList4.add(Integer.valueOf(((IdAndName) it2.next()).f6157a));
                        }
/* 110 */               arrayList.addAll(arrayList4);
                    }
/* 118 */           Iterator it3 = m7926h().iterator();
/* 126 */           while (it3.hasNext()) {
/* 136 */               arrayList2.addAll(((TCFStack) it3.next()).f6203d);
                    }
/* 142 */           ArrayList arrayList5 = new ArrayList();
/* 145 */           arrayList5.addAll(arrayList);
/* 148 */           arrayList5.addAll(arrayList2);
/* 153 */           List list3 = this.f15613p.f6468c;
/* 160 */           List listM6192K = CollectionsKt.m6192K(new LinkedHashSet(arrayList5));
/* 166 */           ArrayList arrayList6 = new ArrayList();
/* 177 */           for (Object obj : listM6192K) {
/* 198 */               if (!list3.contains(Integer.valueOf(((Number) obj).intValue()))) {
/* 200 */                   arrayList6.add(obj);
                        }
                    }
/* 204 */           TCF2Settings tCF2SettingsM7928j = m7928j();
/* 208 */           tCF2SettingsM7928j.getClass();
                    return tCF2SettingsM7928j.f6485P ? CollectionsKt.m6198s(1, arrayList6) : CollectionsKt.m6192K(arrayList6);
                }

                /* JADX INFO: renamed from: f */
                public final ArrayList m7924f() {
/* 1 */             TCF2Settings tCF2SettingsM7928j = m7928j();
/* 5 */             tCF2SettingsM7928j.getClass();
/* 10 */            Set setM6195N = CollectionsKt.m6195N(tCF2SettingsM7928j.f6486Q);
/* 14 */            List listM7929k = m7929k();
/* 20 */            ArrayList arrayList = new ArrayList();
/* 31 */            for (Object obj : listM7929k) {
/* 50 */                if (setM6195N.contains(Integer.valueOf(((TCFVendor) obj).f6209d))) {
/* 52 */                    arrayList.add(obj);
                        }
                    }
/* 56 */            return arrayList;
                }

                /* JADX INFO: renamed from: g */
                public final List m7925g() {
/* 1 */             TCF2Settings tCF2SettingsM7928j = m7928j();
/* 5 */             tCF2SettingsM7928j.getClass();
/* 8 */             List list = tCF2SettingsM7928j.f6490U;
/* 12 */            ArrayList arrayList = new ArrayList();
/* 17 */            ArrayList arrayList2 = new ArrayList();
/* 24 */            Iterator it = m7929k().iterator();
/* 32 */            while (it.hasNext()) {
/* 40 */                List list2 = ((TCFVendor) it.next()).f6216k;
/* 44 */                ArrayList arrayList3 = new ArrayList();
/* 55 */                for (Object obj : list2) {
/* 74 */                    if (!list.contains(Integer.valueOf(((IdAndName) obj).f6157a))) {
/* 76 */                        arrayList3.add(obj);
                            }
                        }
/* 88 */                ArrayList arrayList4 = new ArrayList(C2122qw.m8020h(arrayList3, 10));
/* 91 */                Iterator it2 = arrayList3.iterator();
/* 99 */                while (it2.hasNext()) {
/* 113 */                   arrayList4.add(Integer.valueOf(((IdAndName) it2.next()).f6157a));
                        }
/* 117 */               arrayList.addAll(arrayList4);
                    }
/* 125 */           Iterator it3 = m7926h().iterator();
/* 133 */           while (it3.hasNext()) {
/* 141 */               List list3 = ((TCFStack) it3.next()).f6204e;
/* 145 */               ArrayList arrayList5 = new ArrayList();
/* 156 */               for (Object obj2 : list3) {
/* 177 */                   if (!list.contains(Integer.valueOf(((Number) obj2).intValue()))) {
/* 179 */                       arrayList5.add(obj2);
                            }
                        }
/* 183 */               arrayList2.addAll(arrayList5);
                    }
/* 189 */           ArrayList arrayList6 = new ArrayList();
/* 192 */           arrayList6.addAll(arrayList);
/* 195 */           arrayList6.addAll(arrayList2);
/* 203 */           return CollectionsKt.m6192K(new LinkedHashSet(arrayList6));
                }

                /* JADX INFO: renamed from: h */
                public final ArrayList m7926h() {
/* 1 */             ql2 ql2Var = this.f15610m;
/* 9 */             wp0 wp0Var = ql2Var != null ? ql2Var.f15623b : null;
/* 10 */            TCF2Settings tCF2SettingsM7928j = m7928j();
/* 14 */            tCF2SettingsM7928j.getClass();
/* 17 */            List list = tCF2SettingsM7928j.f6490U;
/* 21 */            ArrayList arrayList = new ArrayList();
/* 24 */            if (wp0Var != null) {
/* 26 */                TCF2Settings tCF2SettingsM7928j2 = m7928j();
/* 30 */                tCF2SettingsM7928j2.getClass();
/* 35 */                Iterator it = tCF2SettingsM7928j2.f6488S.iterator();
/* 43 */                while (it.hasNext()) {
/* 51 */                    int iIntValue = ((Number) it.next()).intValue();
/* 55 */                    Map map = wp0Var.f18727j;
/* 70 */                    Stack stack = map != null ? (Stack) map.get(String.valueOf(iIntValue)) : null;
/* 71 */                    if (stack != null) {
/* 73 */                        String str = stack.f6828c;
/* 75 */                        int i = stack.f6829d;
/* 77 */                        String str2 = stack.f6830e;
/* 79 */                        List list2 = stack.f6826a;
/* 81 */                        List list3 = stack.f6827b;
/* 85 */                        ArrayList arrayList2 = new ArrayList();
/* 96 */                        for (Object obj : list3) {
/* 117 */                           if (!list.contains(Integer.valueOf(((Number) obj).intValue()))) {
/* 119 */                               arrayList2.add(obj);
                                    }
                                }
/* 128 */                       arrayList.add(new TCFStack(str, i, str2, list2, arrayList2));
                            }
                        }
                    }
/* 132 */           return arrayList;
                }

                /* JADX INFO: renamed from: i */
                public final TCFData m7927i() {
/* 1 */             jb1.m5748h();
/* 4 */             ib1 ib1Var = this.f15606i;
/* 6 */             ib1Var.m4510a();
                    try {
                        try {
/* 11 */                    if (this.f15611n == null) {
/* 13 */                        m7938w();
                            }
/* 25 */                    ib1Var.f9528b++;
/* 27 */                    TCFData tCFData = this.f15611n;
/* 29 */                    tCFData.getClass();
/* 32 */                    return tCFData;
                        } catch (Exception e) {
/* 33 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 38 */                ib1Var.f9528b++;
/* 40 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: j */
                public final TCF2Settings m7928j() {
/* 3 */             kn1 kn1Var = this.f15599b.f15067d;
/* 11 */            UsercentricsSettings usercentricsSettings = kn1Var != null ? kn1Var.f12892a : null;
/* 12 */            if (usercentricsSettings != null) {
/* 14 */                return usercentricsSettings.f6720t;
                    }
/* 5 */             return null;
                }

                /* JADX INFO: renamed from: k */
                public final List m7929k() {
                    wp0 wp0Var;
                    Map map;
                    ArrayList arrayList;
                    String str;
                    DataCategory dataCategory;
                    String str2;
                    Purpose purpose;
                    String str3;
                    Feature feature;
                    String str4;
                    Purpose purpose2;
                    String str5;
                    Feature feature2;
                    Iterator it;
                    ql2 ql2Var;
                    xz1 xz1Var;
                    String str6;
                    Purpose purpose3;
                    String str7;
                    Purpose purpose4;
/* 1 */             qk2 qk2Var = this;
/* 3 */             ArrayList arrayList2 = qk2Var.f15608k;
/* 9 */             if (arrayList2.isEmpty()) {
/* 11 */                ql2 ql2Var2 = qk2Var.f15610m;
/* 13 */                TCF2Settings tCF2SettingsM7928j = qk2Var.m7928j();
/* 17 */                tCF2SettingsM7928j.getClass();
/* 22 */                ArrayList arrayList3 = new ArrayList();
/* 27 */                ArrayList arrayList4 = new ArrayList();
/* 30 */                if (ql2Var2 != null && (map = (wp0Var = ql2Var2.f15623b).f18719b) != null) {
/* 42 */                    Iterator it2 = map.entrySet().iterator();
/* 50 */                    while (it2.hasNext()) {
/* 56 */                        Map.Entry entry = (Map.Entry) it2.next();
/* 62 */                        String str8 = (String) entry.getKey();
/* 68 */                        Vendor vendor = (Vendor) entry.getValue();
/* 70 */                        List list = vendor.f6833b;
/* 72 */                        List list2 = vendor.f6835d;
/* 74 */                        List list3 = vendor.f6834c;
/* 76 */                        List list4 = vendor.f6832a;
/* 78 */                        int i = vendor.f6846o;
/* 82 */                        Iterator it3 = it2;
/* 92 */                        ArrayList arrayList5 = new ArrayList(C2122qw.m8020h(list, 10));
/* 95 */                        Iterator it4 = list.iterator();
/* 105 */                       while (it4.hasNext()) {
/* 113 */                           int iIntValue = ((Number) it4.next()).intValue();
/* 117 */                           Iterator it5 = it4;
/* 121 */                           ArrayList arrayList6 = arrayList2;
/* 123 */                           Map map2 = wp0Var.f18723f;
/* 125 */                           ArrayList arrayList7 = arrayList3;
/* 127 */                           if (map2 == null || (purpose4 = (Purpose) map2.get(String.valueOf(iIntValue))) == null || (str7 = purpose4.f6821c) == null) {
/* 145 */                               str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 150 */                           arrayList5.add(new IdAndName(iIntValue, str7));
/* 153 */                           it4 = it5;
/* 155 */                           arrayList2 = arrayList6;
/* 157 */                           arrayList3 = arrayList7;
                                }
/* 162 */                       ArrayList arrayList8 = arrayList2;
/* 164 */                       ArrayList arrayList9 = arrayList3;
/* 174 */                       ArrayList arrayList10 = new ArrayList(C2122qw.m8020h(list4, 10));
/* 177 */                       Iterator it6 = list4.iterator();
/* 185 */                       while (it6.hasNext()) {
/* 193 */                           int iIntValue2 = ((Number) it6.next()).intValue();
/* 199 */                           Iterator it7 = it6;
/* 201 */                           Map map3 = wp0Var.f18723f;
/* 203 */                           int i2 = i;
/* 205 */                           if (map3 == null || (purpose3 = (Purpose) map3.get(String.valueOf(iIntValue2))) == null || (str6 = purpose3.f6821c) == null) {
/* 223 */                               str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 228 */                           arrayList10.add(new IdAndName(iIntValue2, str6));
/* 231 */                           it6 = it7;
/* 233 */                           i = i2;
                                }
/* 236 */                       int i3 = i;
/* 241 */                       if (tCF2SettingsM7928j.f6485P) {
/* 245 */                           ArrayList arrayList11 = new ArrayList();
/* 256 */                           for (Object obj : arrayList10) {
/* 267 */                               if (((IdAndName) obj).f6157a != 1) {
/* 269 */                                   arrayList11.add(obj);
                                        }
                                    }
/* 275 */                           arrayList10 = new ArrayList(arrayList11);
                                }
/* 278 */                       int i4 = Integer.parseInt(str8);
/* 284 */                       ArrayList arrayList12 = new ArrayList();
/* 287 */                       ql2 ql2Var3 = qk2Var.f15610m;
/* 289 */                       if (ql2Var3 != null && (xz1Var = ql2Var3.f15621C) != null) {
/* 303 */                           Iterator it8 = xz1Var.m10050b(Integer.valueOf(i4)).iterator();
/* 311 */                           while (it8.hasNext()) {
/* 317 */                               wz1 wz1Var = (wz1) it8.next();
/* 319 */                               Integer num = wz1Var.f18878a;
/* 321 */                               Iterator it9 = it8;
/* 323 */                               if (num != null) {
/* 338 */                                   arrayList12.add(new TCFVendorRestriction(num.intValue(), wz1Var.m9670b()));
                                        }
/* 341 */                               it8 = it9;
                                    }
                                }
/* 347 */                       h22 h22Var = new h22();
/* 360 */                       ArrayList arrayList13 = new ArrayList(C2122qw.m8020h(arrayList5, 10));
/* 371 */                       for (Iterator it10 = arrayList5.iterator(); it10.hasNext(); it10 = it10) {
/* 377 */                           IdAndName idAndName = (IdAndName) it10.next();
/* 390 */                           arrayList13.add(new IdAndName(idAndName.f6157a, idAndName.f6158b));
                                }
/* 401 */                       h22Var.f8873a = new ArrayList(arrayList13);
/* 405 */                       h22 h22Var2 = new h22();
/* 416 */                       ArrayList arrayList14 = new ArrayList(C2122qw.m8020h(arrayList10, 10));
/* 419 */                       Iterator it11 = arrayList10.iterator();
/* 427 */                       while (it11.hasNext()) {
/* 435 */                           arrayList14.add((IdAndName) it11.next());
                                }
/* 444 */                       h22Var2.f8873a = new ArrayList(arrayList14);
/* 446 */                       Iterator it12 = arrayList12.iterator();
/* 454 */                       while (it12.hasNext()) {
/* 460 */                           TCFVendorRestriction tCFVendorRestriction = (TCFVendorRestriction) it12.next();
/* 462 */                           l42 l42Var = tCFVendorRestriction.f6231b;
/* 464 */                           int i5 = tCFVendorRestriction.f6230a;
/* 466 */                           int iOrdinal = l42Var.ordinal();
/* 470 */                           if (iOrdinal == 0) {
/* 647 */                               it = it12;
/* 649 */                               ql2Var = ql2Var2;
/* 653 */                               Iterable iterable = (Iterable) h22Var2.f8873a;
/* 657 */                               ArrayList arrayList15 = new ArrayList();
/* 668 */                               for (Object obj2 : iterable) {
/* 679 */                                   if (((IdAndName) obj2).f6157a != i5) {
/* 681 */                                       arrayList15.add(obj2);
                                            }
                                        }
/* 690 */                               h22Var2.f8873a = new ArrayList(arrayList15);
/* 694 */                               Iterable iterable2 = (Iterable) h22Var.f8873a;
/* 698 */                               ArrayList arrayList16 = new ArrayList();
/* 709 */                               for (Object obj3 : iterable2) {
/* 720 */                                   if (((IdAndName) obj3).f6157a != i5) {
/* 722 */                                       arrayList16.add(obj3);
                                            }
                                        }
/* 731 */                               h22Var.f8873a = new ArrayList(arrayList16);
                                    } else if (iOrdinal == 1) {
/* 583 */                               it = it12;
/* 585 */                               ql2Var = ql2Var2;
/* 589 */                               Iterable iterable3 = (Iterable) h22Var.f8873a;
/* 593 */                               ArrayList arrayList17 = new ArrayList();
/* 604 */                               for (Object obj4 : iterable3) {
/* 611 */                                   IdAndName idAndName2 = (IdAndName) obj4;
/* 613 */                                   int i6 = idAndName2.f6157a;
/* 615 */                                   if (i6 != i5) {
/* 635 */                                       arrayList17.add(obj4);
                                            } else if (list3.contains(Integer.valueOf(i6))) {
/* 631 */                                       ((List) h22Var2.f8873a).add(idAndName2);
                                            }
                                        }
/* 644 */                               h22Var.f8873a = new ArrayList(arrayList17);
                                    } else if (iOrdinal != 2) {
/* 478 */                               it = it12;
/* 480 */                               ql2Var = ql2Var2;
                                    } else {
/* 486 */                               Iterable iterable4 = (Iterable) h22Var2.f8873a;
/* 490 */                               ArrayList arrayList18 = new ArrayList();
/* 493 */                               Iterator it13 = iterable4.iterator();
/* 501 */                               while (it13.hasNext()) {
/* 503 */                                   it12 = it12;
/* 505 */                                   Object next = it13.next();
/* 509 */                                   it13 = it13;
/* 512 */                                   IdAndName idAndName3 = (IdAndName) next;
/* 514 */                                   int i7 = idAndName3.f6157a;
/* 516 */                                   if (i7 == i5) {
/* 526 */                                       if (list3.contains(Integer.valueOf(i7))) {
/* 543 */                                           ((List) h22Var.f8873a).add(new IdAndName(idAndName3.f6157a, idAndName3.f6158b));
                                                }
/* 555 */                                       ql2Var2 = ql2Var2;
                                            } else {
/* 560 */                                       arrayList18.add(next);
                                            }
                                        }
/* 570 */                               it = it12;
/* 572 */                               ql2Var = ql2Var2;
/* 579 */                               h22Var2.f8873a = new ArrayList(arrayList18);
                                    }
/* 735 */                           it12 = it;
/* 737 */                           ql2Var2 = ql2Var;
                                }
/* 741 */                       ql2 ql2Var4 = ql2Var2;
/* 743 */                       List list5 = vendor.f6836e;
/* 753 */                       ArrayList arrayList19 = new ArrayList(C2122qw.m8020h(list5, 10));
/* 756 */                       Iterator it14 = list5.iterator();
/* 764 */                       while (it14.hasNext()) {
/* 772 */                           int iIntValue3 = ((Number) it14.next()).intValue();
/* 778 */                           Map map4 = wp0Var.f18722e;
/* 780 */                           if (map4 == null || (feature2 = (Feature) map4.get(String.valueOf(iIntValue3))) == null || (str5 = feature2.f6811c) == null) {
/* 798 */                               str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 803 */                           arrayList19.add(new IdAndName(iIntValue3, str5));
                                }
/* 815 */                       ArrayList arrayList20 = new ArrayList(C2122qw.m8020h(list3, 10));
/* 818 */                       Iterator it15 = list3.iterator();
/* 826 */                       while (it15.hasNext()) {
/* 834 */                           int iIntValue4 = ((Number) it15.next()).intValue();
/* 840 */                           Map map5 = wp0Var.f18723f;
/* 842 */                           if (map5 == null || (purpose2 = (Purpose) map5.get(String.valueOf(iIntValue4))) == null || (str4 = purpose2.f6821c) == null) {
/* 860 */                               str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 865 */                           arrayList20.add(new IdAndName(iIntValue4, str4));
                                }
/* 869 */                       List list6 = vendor.f6837f;
/* 873 */                       ArrayList arrayList21 = new ArrayList();
/* 884 */                       for (Object obj5 : list6) {
/* 907 */                           if (!tCF2SettingsM7928j.f6490U.contains(Integer.valueOf(((Number) obj5).intValue()))) {
/* 909 */                               arrayList21.add(obj5);
                                    }
                                }
/* 921 */                       ArrayList arrayList22 = new ArrayList(C2122qw.m8020h(arrayList21, 10));
/* 924 */                       Iterator it16 = arrayList21.iterator();
/* 932 */                       while (it16.hasNext()) {
/* 940 */                           int iIntValue5 = ((Number) it16.next()).intValue();
/* 946 */                           Map map6 = wp0Var.f18725h;
/* 948 */                           ArrayList arrayList23 = arrayList20;
/* 950 */                           if (map6 == null || (feature = (Feature) map6.get(String.valueOf(iIntValue5))) == null || (str3 = feature.f6811c) == null) {
/* 968 */                               str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 973 */                           arrayList22.add(new IdAndName(iIntValue5, str3));
/* 976 */                           arrayList20 = arrayList23;
                                }
/* 979 */                       ArrayList arrayList24 = arrayList20;
/* 989 */                       ArrayList arrayList25 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 992 */                       Iterator it17 = list2.iterator();
/* 1000 */                      while (it17.hasNext()) {
/* 1008 */                          int iIntValue6 = ((Number) it17.next()).intValue();
/* 1014 */                          Map map7 = wp0Var.f18726i;
/* 1016 */                          ArrayList arrayList26 = arrayList19;
/* 1018 */                          if (map7 == null || (purpose = (Purpose) map7.get(String.valueOf(iIntValue6))) == null || (str2 = purpose.f6821c) == null) {
/* 1036 */                              str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 1041 */                          arrayList25.add(new IdAndName(iIntValue6, str2));
/* 1044 */                          arrayList19 = arrayList26;
                                }
/* 1047 */                      ArrayList arrayList27 = arrayList19;
/* 1049 */                      List list7 = vendor.f6850s;
/* 1051 */                      if (list7 != null) {
/* 1061 */                          arrayList = new ArrayList(C2122qw.m8020h(list7, 10));
/* 1064 */                          Iterator it18 = list7.iterator();
/* 1072 */                          while (it18.hasNext()) {
/* 1080 */                              int iIntValue7 = ((Number) it18.next()).intValue();
/* 1086 */                              Map map8 = wp0Var.f18724g;
/* 1088 */                              ArrayList arrayList28 = arrayList25;
/* 1090 */                              if (map8 == null || (dataCategory = (DataCategory) map8.get(String.valueOf(iIntValue7))) == null || (str = dataCategory.f6796b) == null) {
/* 1108 */                                  str = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
/* 1113 */                              arrayList.add(new IdAndName(iIntValue7, str));
/* 1116 */                              arrayList25 = arrayList28;
                                    }
                                } else {
/* 1122 */                          arrayList = null;
                                }
/* 1119 */                      ArrayList arrayList29 = arrayList25;
/* 1124 */                      GvlDataRetention gvlDataRetention = vendor.f6848q;
/* 1130 */                      if (m7917m(list4, list, list2)) {
/* 1136 */                          arrayList4.add(Integer.valueOf(i3));
                                }
/* 1145 */                      boolean zM8934a = ql2Var4.f15646y.m8934a(i3);
/* 1149 */                      Double d = vendor.f6841j;
/* 1153 */                      String str9 = vendor.f6843l;
/* 1157 */                      int i8 = vendor.f6846o;
/* 1161 */                      wp0 wp0Var2 = wp0Var;
/* 1205 */                      Boolean boolValueOf = this.f15612o.get(Integer.valueOf(i8)) != null ? Boolean.valueOf(ql2Var4.f15647z.m8934a(i3) || m7917m(list4, list, list2)) : null;
/* 1211 */                      List list8 = (List) h22Var.f8873a;
/* 1213 */                      String str10 = vendor.f6847p;
/* 1215 */                      String str11 = vendor.f6838g;
/* 1217 */                      Object obj6 = h22Var2.f8873a;
/* 1221 */                      List list9 = (List) obj6;
/* 1240 */                      boolean z = !((Collection) obj6).isEmpty() && tCF2SettingsM7928j.m2825a();
/* 1265 */                      boolean z2 = (((Collection) h22Var.f8873a).isEmpty() || !tCF2SettingsM7928j.m2825a() || tCF2SettingsM7928j.f6470A) ? false : true;
/* 1267 */                      boolean z3 = vendor.f6842k;
/* 1269 */                      boolean z4 = vendor.f6844m;
/* 1271 */                      Boolean bool = vendor.f6845n;
/* 1279 */                      boolean zContains = tCF2SettingsM7928j.f6480K.contains(Integer.valueOf(i3));
/* 1290 */                      Integer num2 = gvlDataRetention != null ? gvlDataRetention.f6814a : null;
/* 1291 */                      RetentionPeriod.Companion companion = RetentionPeriod.Companion;
/* 1300 */                      Map map9 = gvlDataRetention != null ? gvlDataRetention.f6815b : null;
/* 1301 */                      companion.getClass();
/* 1318 */                      DataRetention dataRetention = new DataRetention(num2, RetentionPeriod.Companion.m2827a(map9), RetentionPeriod.Companion.m2827a(gvlDataRetention != null ? gvlDataRetention.f6816c : null));
                                List list10 = arrayList;
/* 1321 */                      if (arrayList == null) {
/* 1323 */                          list10 = nd0.f14189a;
                                }
/* 1325 */                      List list11 = list10;
/* 1327 */                      List list12 = vendor.f6849r;
/* 1329 */                      if (list12 == null) {
/* 1331 */                          list12 = nd0.f14189a;
                                }
/* 1366 */                      arrayList9.add(new TCFVendor(Boolean.valueOf(zM8934a), arrayList27, arrayList24, i8, boolValueOf, list8, str10, str11, list9, arrayList12, arrayList22, arrayList29, z, z2, d, z3, str9, z4, bool, Boolean.valueOf(zContains), dataRetention, list11, list12));
/* 1369 */                      arrayList3 = arrayList9;
/* 1370 */                      qk2Var = this;
/* 1371 */                      it2 = it3;
/* 1373 */                      wp0Var = wp0Var2;
/* 1375 */                      arrayList2 = arrayList8;
/* 1377 */                      ql2Var2 = ql2Var4;
                            }
                        }
/* 1382 */              ArrayList arrayList30 = arrayList2;
/* 1385 */              arrayList30.clear();
/* 1394 */              arrayList2 = arrayList30;
/* 1396 */              arrayList2.addAll(hu0.m4309D0(arrayList3, nk2.f14341d));
/* 1399 */              ArrayList arrayList31 = qk2Var.f15614q;
/* 1401 */              arrayList31.clear();
/* 1404 */              arrayList31.addAll(arrayList4);
                    }
/* 1407 */          return CollectionsKt.m6192K(arrayList2);
                }

                /* JADX INFO: renamed from: l */
                public final void m7930l(ql2 ql2Var, LinkedHashMap linkedHashMap) {
/* 39 */            List listM7566e = C2085pw.m7566e(2, 7, 8, 9, 10, 11);
/* 43 */            List listM7929k = m7929k();
/* 49 */            ArrayList arrayList = new ArrayList();
/* 52 */            Iterator it = listM7929k.iterator();
/* 60 */            while (it.hasNext()) {
/* 68 */                List list = ((TCFVendor) it.next()).f6211f;
/* 76 */                ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list, 10));
/* 79 */                Iterator it2 = list.iterator();
/* 87 */                while (it2.hasNext()) {
/* 101 */                   arrayList2.add(Integer.valueOf(((IdAndName) it2.next()).f6157a));
                        }
/* 105 */               C2270uw.m9140k(arrayList, arrayList2);
                    }
/* 109 */           Set setM6195N = CollectionsKt.m6195N(arrayList);
/* 115 */           ArrayList arrayList3 = new ArrayList();
/* 126 */           for (Object obj : listM7566e) {
/* 135 */               int iIntValue = ((Number) obj).intValue();
/* 143 */               boolean zContains = setM6195N.contains(Integer.valueOf(iIntValue));
/* 182 */               boolean zM6216a = linkedHashMap != null ? Intrinsics.m6216a(linkedHashMap.get(Integer.valueOf(iIntValue)), Boolean.FALSE) : (this.f15612o.isEmpty() || ql2Var.f15640s.m8934a(iIntValue)) ? false : true;
/* 183 */               if (zContains && !zM6216a) {
/* 187 */                   arrayList3.add(obj);
                        }
                    }
/* 197 */           ql2Var.f15640s.m8938e(m7923e());
/* 202 */           ql2Var.f15640s.m8936c(arrayList3);
/* 207 */           ql2Var.f15647z.clear();
/* 212 */           ArrayList arrayList4 = new ArrayList();
/* 223 */           for (Object obj2 : listM7929k) {
/* 238 */               if (!((TCFVendor) obj2).f6211f.isEmpty()) {
/* 240 */                   arrayList4.add(obj2);
                        }
                    }
/* 250 */           ArrayList arrayList5 = new ArrayList(C2122qw.m8020h(arrayList4, 10));
/* 253 */           Iterator it3 = arrayList4.iterator();
/* 261 */           while (it3.hasNext()) {
/* 275 */               arrayList5.add(Integer.valueOf(((TCFVendor) it3.next()).f6209d));
                    }
/* 296 */           ql2Var.f15647z.m8936c(CollectionsKt.m6192K(new LinkedHashSet(CollectionsKt.m6183B(this.f15614q, arrayList5))));
                }

                /* JADX WARN: Code duplicated, block: B:104:0x024a  */
                /* JADX WARN: Code duplicated, block: B:107:0x0258  */
                /* JADX WARN: Code duplicated, block: B:108:0x025d  */
                /* JADX WARN: Code duplicated, block: B:111:0x026c  */
                /* JADX WARN: Code duplicated, block: B:118:0x0285  */
                /* JADX WARN: Code duplicated, block: B:137:0x02be  */
                /* JADX WARN: Code duplicated, block: B:142:0x02de A[LOOP:4: B:140:0x02d8->B:142:0x02de, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:146:0x0300  */
                /* JADX WARN: Code duplicated, block: B:155:0x02ca A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:157:0x02b8 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:161:0x028f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:165:0x027f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:169:0x0276 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:172:0x0266 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:52:0x011c  */
                /* JADX WARN: Code duplicated, block: B:54:0x0122  */
                /* JADX WARN: Code duplicated, block: B:56:0x012f  */
                /* JADX WARN: Code duplicated, block: B:64:0x0147  */
                /* JADX WARN: Code duplicated, block: B:67:0x014f  */
                /* JADX WARN: Code duplicated, block: B:69:0x0153  */
                /* JADX WARN: Code duplicated, block: B:71:0x015b  */
                /* JADX WARN: Code duplicated, block: B:72:0x015e  */
                /* JADX WARN: Code duplicated, block: B:76:0x018d A[LOOP:0: B:74:0x0187->B:76:0x018d, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code duplicated, block: B:80:0x01c1 A[LOOP:1: B:78:0x01bb->B:80:0x01c1, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:84:0x01f5 A[LOOP:2: B:82:0x01ef->B:84:0x01f5, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:94:0x0232  */
                /* JADX WARN: Code duplicated, block: B:96:0x0236  */
                /* JADX INFO: renamed from: n */
                public final Object m7931n(TCF2Settings tCF2Settings, StorageTCF storageTCF, d10 d10Var) throws C0900f0 {
                    kk2 kk2Var;
                    wp0 wp0Var;
                    Object objM9597b;
                    qk2 qk2Var;
                    wp0 wp0Var2;
                    Object obj;
                    TCF2Settings tCF2Settings2;
                    StorageTCF storageTCF2;
                    Throwable thM7099a;
                    List list;
                    ql2 ql2Var;
                    ql2 ql2Var2;
                    TCF2ChangedPurposes tCF2ChangedPurposes;
                    ArrayList arrayList;
                    Iterator it;
                    ArrayList arrayList2;
                    Iterator it2;
                    ArrayList arrayList3;
                    Iterator it3;
                    Set<String> setM6195N;
                    ql2 ql2Var3;
                    ql2 ql2Var4;
                    Iterable iterableM6195N;
                    LinkedHashSet linkedHashSet;
                    Set<String> setM6195N2;
                    ql2 ql2Var5;
                    xz1 xz1Var;
                    Map map;
                    xz1 xz1Var2;
                    Map map2;
                    Set setKeySet;
                    ql2 ql2Var6;
                    xz1 xz1Var3;
                    LinkedHashSet linkedHashSet2;
                    wp0 wp0Var3;
                    List list2;
                    rf2 rf2Var;
                    Iterator it4;
                    xz1 xz1Var4;
                    Map map3;
                    xz1 xz1Var5;
/* 3 */             if (d10Var instanceof kk2) {
/* 6 */                 kk2Var = (kk2) d10Var;
/* 8 */                 int i = kk2Var.f12863i;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    kk2Var.f12863i = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    kk2Var = new kk2(this, d10Var);
                        }
                    } else {
/* 22 */                kk2Var = new kk2(this, d10Var);
                    }
/* 25 */            Object obj2 = kk2Var.f12861e;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = kk2Var.f12863i;
/* 35 */            if (i2 == 0) {
/* 85 */                pg3.m7417A(obj2);
/* 92 */                wp0Var = new wp0(this.f15604g);
/* 100 */               this.f15610m = new ql2(wp0Var);
/* 102 */               String str = storageTCF.f6145a;
/* 108 */               if (!StringsKt.m6228D(str)) {
                            try {
/* 110 */                       yl2 yl2Var = zl2.Companion;
/* 112 */                       ql2 ql2Var7 = this.f15610m;
/* 114 */                       ql2Var7.getClass();
/* 117 */                       yl2Var.getClass();
/* 124 */                       this.f15610m = yl2.m10159a(str, ql2Var7);
                            } catch (Throwable th) {
/* 128 */                       pl2[] pl2VarArr = pl2.f15173a;
/* 134 */                       this.f15598a.mo2907b("Usercentrics: Unable to init TCF", th);
                            }
                        }
/* 137 */               ql2 ql2Var8 = this.f15610m;
/* 139 */               if (ql2Var8 != null) {
/* 148 */                   ql2Var8.m7945c(new uh2(tCF2Settings.f6476G));
/* 158 */                   ql2Var8.m7946d(new uh2(tCF2Settings.f6477H));
/* 170 */                   ql2Var8.f15624c = tCF2Settings.f6489T == pk2.f15163a;
/* 174 */                   ql2Var8.m7949g(tCF2Settings.f6484O);
/* 179 */                   ql2Var8.f15626e = tCF2Settings.f6485P;
                        }
/* 181 */               kk2Var.f12857a = this;
/* 183 */               kk2Var.f12858b = tCF2Settings;
/* 185 */               kk2Var.f12859c = storageTCF;
/* 187 */               kk2Var.f12860d = wp0Var;
/* 189 */               kk2Var.f12863i = 1;
/* 191 */               objM9597b = wp0Var.m9597b(kk2Var);
/* 195 */               if (objM9597b != z10Var) {
                        }
/* 271 */               return z10Var;
                    }
/* 37 */            if (i2 == 1) {
/* 64 */                wp0 wp0Var4 = kk2Var.f12860d;
/* 66 */                storageTCF = kk2Var.f12859c;
/* 68 */                tCF2Settings = kk2Var.f12858b;
/* 70 */                qk2 qk2Var2 = kk2Var.f12857a;
/* 72 */                pg3.m7417A(obj2);
/* 77 */                Object obj3 = ((o42) obj2).f14613a;
/* 80 */                wp0Var = wp0Var4;
/* 81 */                this = qk2Var2;
/* 82 */                objM9597b = obj3;
                    } else {
/* 39 */                if (i2 != 2) {
/* 60 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 41 */                wp0Var2 = kk2Var.f12860d;
/* 43 */                storageTCF2 = kk2Var.f12859c;
/* 45 */                tCF2Settings2 = kk2Var.f12858b;
/* 47 */                qk2Var = kk2Var.f12857a;
/* 49 */                pg3.m7417A(obj2);
/* 54 */                obj = ((o42) obj2).f14613a;
                    }
/* 279 */           thM7099a = o42.m7099a(obj);
/* 283 */           if (thM7099a != null) {
/* 287 */               return new n42(thM7099a);
                    }
/* 291 */           TCF2Settings tCF2SettingsM7928j = qk2Var.m7928j();
/* 295 */           tCF2SettingsM7928j.getClass();
/* 298 */           list = tCF2SettingsM7928j.f6486Q;
/* 300 */           ql2Var = qk2Var.f15610m;
/* 302 */           if (ql2Var != null) {
/* 304 */               wp0 wp0Var5 = ql2Var.f15623b;
/* 306 */               list.getClass();
/* 309 */               wp0Var5.m9598c(list);
                    }
/* 312 */           ql2Var2 = qk2Var.f15610m;
/* 314 */           if (ql2Var2 != null && (xz1Var5 = ql2Var2.f15621C) != null) {
/* 320 */               wp0Var2.getClass();
/* 325 */               if (xz1Var5.f19425d == null) {
/* 328 */                   xz1Var5.f19425d = wp0Var2;
                        }
                    }
/* 334 */           if (tCF2Settings2.f6489T == pk2.f15163a) {
/* 336 */               tCF2ChangedPurposes = tCF2Settings2.f6507f0;
/* 338 */               if (tCF2ChangedPurposes != null) {
/* 346 */                   if (tCF2ChangedPurposes.f6468c.isEmpty()) {
/* 351 */                       ArrayList arrayList4 = b13.f2172b;
/* 353 */                       List list3 = tCF2ChangedPurposes.f6466a;
/* 355 */                       List list4 = tCF2ChangedPurposes.f6467b;
/* 357 */                       list3.getClass();
/* 360 */                       list4.getClass();
/* 363 */                       arrayList4.getClass();
/* 371 */                       qk2Var.f15613p = new TCF2ChangedPurposes(list3, list4, arrayList4);
                            } else {
/* 348 */                       qk2Var.f15613p = tCF2ChangedPurposes;
                            }
                        }
/* 375 */               List list5 = qk2Var.f15613p.f6466a;
/* 385 */               arrayList = new ArrayList(C2122qw.m8020h(list5, 10));
/* 388 */               it = list5.iterator();
/* 396 */               while (it.hasNext()) {
/* 423 */                   arrayList.add(new wz1(Integer.valueOf(((Number) it.next()).intValue()), l42.REQUIRE_CONSENT).m9669a());
                        }
/* 429 */               List list6 = qk2Var.f15613p.f6467b;
/* 437 */               arrayList2 = new ArrayList(C2122qw.m8020h(list6, 10));
/* 440 */               it2 = list6.iterator();
/* 448 */               while (it2.hasNext()) {
/* 475 */                   arrayList2.add(new wz1(Integer.valueOf(((Number) it2.next()).intValue()), l42.REQUIRE_LI).m9669a());
                        }
/* 481 */               List list7 = qk2Var.f15613p.f6468c;
/* 489 */               arrayList3 = new ArrayList(C2122qw.m8020h(list7, 10));
/* 492 */               it3 = list7.iterator();
/* 500 */               while (it3.hasNext()) {
/* 527 */                   arrayList3.add(new wz1(Integer.valueOf(((Number) it3.next()).intValue()), l42.NOT_ALLOWED).m9669a());
                        }
/* 539 */               setM6195N = CollectionsKt.m6195N(CollectionsKt.m6183B(CollectionsKt.m6183B(arrayList, arrayList2), arrayList3));
/* 543 */               ql2Var3 = qk2Var.f15610m;
/* 545 */               if (ql2Var3 != null || (xz1Var4 = ql2Var3.f15621C) == null || (map3 = xz1Var4.f19423b) == null || !map3.isEmpty()) {
/* 563 */                   ql2Var4 = qk2Var.f15610m;
/* 565 */                   if (ql2Var4 != null || (xz1Var2 = ql2Var4.f15621C) == null || (map2 = xz1Var2.f19423b) == null || (setKeySet = map2.keySet()) == null || (iterableM6195N = CollectionsKt.m6195N(setKeySet)) == null) {
/* 587 */                       iterableM6195N = qd0.f15493a;
                            }
/* 589 */                   iterableM6195N.getClass();
/* 592 */                   setM6195N.getClass();
/* 599 */                   if (setM6195N.isEmpty()) {
/* 601 */                       setM6195N2 = CollectionsKt.m6195N(iterableM6195N);
                            } else {
/* 608 */                       linkedHashSet = new LinkedHashSet();
/* 619 */                       for (Object obj4 : iterableM6195N) {
/* 629 */                           if (!setM6195N.contains(obj4)) {
/* 631 */                               linkedHashSet.add(obj4);
                                    }
                                }
/* 635 */                       setM6195N2 = linkedHashSet;
                            }
/* 644 */                   for (String str2 : setM6195N2) {
/* 652 */                       ql2Var5 = qk2Var.f15610m;
/* 654 */                       if (ql2Var5 == null && (xz1Var = ql2Var5.f15621C) != null && (map = xz1Var.f19423b) != null) {
                                }
                            }
                        }
/* 671 */               ql2Var6 = qk2Var.f15610m;
/* 673 */               if (ql2Var6 != null && (xz1Var3 = ql2Var6.f15621C) != null) {
/* 679 */                   linkedHashSet2 = xz1Var3.f19424c;
/* 681 */                   setM6195N.getClass();
/* 684 */                   wp0Var3 = xz1Var3.f19425d;
/* 686 */                   if (wp0Var3 != null && (list2 = wp0Var3.f18720c) != null) {
/* 701 */                       for (String str3 : setM6195N) {
/* 713 */                           if (!linkedHashSet2.contains(str3)) {
/* 715 */                               linkedHashSet2.add(str3);
/* 718 */                               Map map4 = xz1Var3.f19423b;
/* 722 */                               rf2Var = new rf2();
/* 725 */                               it4 = list2.iterator();
/* 733 */                               while (it4.hasNext()) {
/* 751 */                                   rf2Var.f16038a.add(Integer.valueOf(((Number) it4.next()).intValue()));
                                        }
/* 755 */                               map4.put(str3, rf2Var);
/* 758 */                               xz1Var3.f19422a = 0;
                                    }
                                }
                            }
                        }
                    }
/* 767 */           if (!storageTCF2.f6146b.isEmpty()) {
/* 771 */               qk2Var.m7937v(tCF2Settings2, storageTCF2.f6146b);
                    }
/* 774 */           m42 m42Var = o42.f14612b;
/* 776 */           return Unit.f12910a;
/* 198 */           Throwable thM7099a2 = o42.m7099a(objM9597b);
/* 202 */           if (thM7099a2 != null) {
/* 206 */               return new n42(thM7099a2);
                    }
/* 212 */           kn1 kn1Var = this.f15599b.f15067d;
/* 216 */           UsercentricsSettings usercentricsSettings = kn1Var != null ? kn1Var.f12892a : null;
/* 218 */           usercentricsSettings.getClass();
/* 221 */           String strM3857a = usercentricsSettings.f6704d;
/* 223 */           Set set = AbstractC0935fz.f8400a;
/* 225 */           strM3857a.getClass();
/* 228 */           Set set2 = AbstractC0935fz.f8400a;
/* 232 */           String upperCase = strM3857a.toUpperCase(Locale.ROOT);
/* 236 */           upperCase.getClass();
/* 243 */           if (!set2.contains(upperCase) && (strM3857a = AbstractC0935fz.m3857a(strM3857a)) == null) {
/* 253 */               strM3857a = "en";
                    }
/* 255 */           kk2Var.f12857a = this;
/* 257 */           kk2Var.f12858b = tCF2Settings;
/* 259 */           kk2Var.f12859c = storageTCF;
/* 261 */           kk2Var.f12860d = wp0Var;
/* 263 */           kk2Var.f12863i = 2;
/* 265 */           Object objM7933r = this.m7933r(strM3857a, kk2Var);
/* 269 */           if (objM7933r != z10Var) {
/* 273 */               qk2Var = this;
/* 274 */               wp0Var2 = wp0Var;
/* 275 */               obj = objM7933r;
/* 276 */               StorageTCF storageTCF3 = storageTCF;
/* 277 */               tCF2Settings2 = tCF2Settings;
/* 278 */               storageTCF2 = storageTCF3;
/* 279 */               thM7099a = o42.m7099a(obj);
/* 283 */               if (thM7099a != null) {
/* 287 */                   return new n42(thM7099a);
                        }
/* 291 */               TCF2Settings tCF2SettingsM7928j2 = qk2Var.m7928j();
/* 295 */               tCF2SettingsM7928j2.getClass();
/* 298 */               list = tCF2SettingsM7928j2.f6486Q;
/* 300 */               ql2Var = qk2Var.f15610m;
/* 302 */               if (ql2Var != null) {
/* 304 */                   wp0 wp0Var6 = ql2Var.f15623b;
/* 306 */                   list.getClass();
/* 309 */                   wp0Var6.m9598c(list);
                        }
/* 312 */               ql2Var2 = qk2Var.f15610m;
/* 314 */               if (ql2Var2 != null) {
/* 320 */                   wp0Var2.getClass();
/* 325 */                   if (xz1Var5.f19425d == null) {
/* 328 */                       xz1Var5.f19425d = wp0Var2;
                            }
                        }
/* 334 */               if (tCF2Settings2.f6489T == pk2.f15163a) {
/* 336 */                   tCF2ChangedPurposes = tCF2Settings2.f6507f0;
/* 338 */                   if (tCF2ChangedPurposes != null) {
/* 346 */                       if (tCF2ChangedPurposes.f6468c.isEmpty()) {
/* 348 */                           qk2Var.f15613p = tCF2ChangedPurposes;
                                } else {
/* 351 */                           ArrayList arrayList5 = b13.f2172b;
/* 353 */                           List list8 = tCF2ChangedPurposes.f6466a;
/* 355 */                           List list9 = tCF2ChangedPurposes.f6467b;
/* 357 */                           list8.getClass();
/* 360 */                           list9.getClass();
/* 363 */                           arrayList5.getClass();
/* 371 */                           qk2Var.f15613p = new TCF2ChangedPurposes(list8, list9, arrayList5);
                                }
                            }
/* 375 */                   List list10 = qk2Var.f15613p.f6466a;
/* 385 */                   arrayList = new ArrayList(C2122qw.m8020h(list10, 10));
/* 388 */                   it = list10.iterator();
/* 396 */                   while (it.hasNext()) {
/* 423 */                       arrayList.add(new wz1(Integer.valueOf(((Number) it.next()).intValue()), l42.REQUIRE_CONSENT).m9669a());
                            }
/* 429 */                   List list11 = qk2Var.f15613p.f6467b;
/* 437 */                   arrayList2 = new ArrayList(C2122qw.m8020h(list11, 10));
/* 440 */                   it2 = list11.iterator();
/* 448 */                   while (it2.hasNext()) {
/* 475 */                       arrayList2.add(new wz1(Integer.valueOf(((Number) it2.next()).intValue()), l42.REQUIRE_LI).m9669a());
                            }
/* 481 */                   List list12 = qk2Var.f15613p.f6468c;
/* 489 */                   arrayList3 = new ArrayList(C2122qw.m8020h(list12, 10));
/* 492 */                   it3 = list12.iterator();
/* 500 */                   while (it3.hasNext()) {
/* 527 */                       arrayList3.add(new wz1(Integer.valueOf(((Number) it3.next()).intValue()), l42.NOT_ALLOWED).m9669a());
                            }
/* 539 */                   setM6195N = CollectionsKt.m6195N(CollectionsKt.m6183B(CollectionsKt.m6183B(arrayList, arrayList2), arrayList3));
/* 543 */                   ql2Var3 = qk2Var.f15610m;
/* 545 */                   if (ql2Var3 != null) {
/* 563 */                       ql2Var4 = qk2Var.f15610m;
/* 565 */                       if (ql2Var4 != null) {
/* 587 */                           iterableM6195N = qd0.f15493a;
                                } else {
/* 587 */                           iterableM6195N = qd0.f15493a;
                                }
/* 589 */                       iterableM6195N.getClass();
/* 592 */                       setM6195N.getClass();
/* 599 */                       if (setM6195N.isEmpty()) {
/* 601 */                           setM6195N2 = CollectionsKt.m6195N(iterableM6195N);
                                } else {
/* 608 */                           linkedHashSet = new LinkedHashSet();
/* 619 */                           while (r14.hasNext()) {
/* 629 */                               if (!setM6195N.contains(obj4)) {
/* 631 */                                   linkedHashSet.add(obj4);
                                        }
                                    }
/* 635 */                           setM6195N2 = linkedHashSet;
                                }
/* 644 */                       while (r14.hasNext()) {
/* 652 */                           ql2Var5 = qk2Var.f15610m;
/* 654 */                           if (ql2Var5 == null) {
                                    }
                                }
                            } else {
/* 563 */                       ql2Var4 = qk2Var.f15610m;
/* 565 */                       if (ql2Var4 != null) {
/* 587 */                           iterableM6195N = qd0.f15493a;
                                } else {
/* 587 */                           iterableM6195N = qd0.f15493a;
                                }
/* 589 */                       iterableM6195N.getClass();
/* 592 */                       setM6195N.getClass();
/* 599 */                       if (setM6195N.isEmpty()) {
/* 601 */                           setM6195N2 = CollectionsKt.m6195N(iterableM6195N);
                                } else {
/* 608 */                           linkedHashSet = new LinkedHashSet();
/* 619 */                           while (r14.hasNext()) {
/* 629 */                               if (!setM6195N.contains(obj4)) {
/* 631 */                                   linkedHashSet.add(obj4);
                                        }
                                    }
/* 635 */                           setM6195N2 = linkedHashSet;
                                }
/* 644 */                       while (r14.hasNext()) {
/* 652 */                           ql2Var5 = qk2Var.f15610m;
/* 654 */                           if (ql2Var5 == null) {
                                    }
                                }
                            }
/* 671 */                   ql2Var6 = qk2Var.f15610m;
/* 673 */                   if (ql2Var6 != null) {
/* 679 */                       linkedHashSet2 = xz1Var3.f19424c;
/* 681 */                       setM6195N.getClass();
/* 684 */                       wp0Var3 = xz1Var3.f19425d;
/* 686 */                       if (wp0Var3 != null) {
/* 701 */                           while (r11.hasNext()) {
/* 713 */                               if (!linkedHashSet2.contains(str3)) {
/* 715 */                                   linkedHashSet2.add(str3);
/* 718 */                                   Map map5 = xz1Var3.f19423b;
/* 722 */                                   rf2Var = new rf2();
/* 725 */                                   it4 = list2.iterator();
/* 733 */                                   while (it4.hasNext()) {
/* 751 */                                       rf2Var.f16038a.add(Integer.valueOf(((Number) it4.next()).intValue()));
                                            }
/* 755 */                                   map5.put(str3, rf2Var);
/* 758 */                                   xz1Var3.f19422a = 0;
                                        }
                                    }
                                }
                            }
                        }
/* 767 */               if (!storageTCF2.f6146b.isEmpty()) {
/* 771 */                   qk2Var.m7937v(tCF2Settings2, storageTCF2.f6146b);
                        }
/* 774 */               m42 m42Var2 = o42.f14612b;
/* 776 */               return Unit.f12910a;
                    }
/* 271 */           return z10Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: o */
                public final Object m7932o(String str, d10 d10Var) {
                    lk2 lk2Var;
                    StorageTCF storageTCF;
                    Object objM7931n;
/* 3 */             if (d10Var instanceof lk2) {
/* 6 */                 lk2Var = (lk2) d10Var;
/* 8 */                 int i = lk2Var.f13365f;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    lk2Var.f13365f = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    lk2Var = new lk2(this, d10Var);
                        }
                    } else {
/* 22 */                lk2Var = new lk2(this, d10Var);
                    }
/* 25 */            Object obj = lk2Var.f13363d;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = lk2Var.f13365f;
/* 32 */            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 35 */            if (i2 == 0) {
/* 61 */                pg3.m7417A(obj);
/* 64 */                TCF2Settings tCF2SettingsM7928j = m7928j();
/* 68 */                if (tCF2SettingsM7928j == null) {
/* 70 */                    m42 m42Var = o42.f14612b;
/* 86 */                    return new n42(new vz2("TCF Options are empty", new IllegalStateException()));
                        }
/* 92 */                pz2 pz2Var = (pz2) this.f15600c;
/* 94 */                pz2Var.getClass();
/* 97 */                str.getClass();
/* 100 */               od2 od2Var = pz2Var.f15354e;
/* 102 */               fh2[] fh2VarArr = fh2.f8216a;
/* 106 */               String strConcat = "tcf-".concat(str);
/* 110 */               od2Var.getClass();
/* 115 */               String string = od2Var.f14716a.getString(strConcat, null);
/* 119 */               if (string == null) {
/* 121 */                   string = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 126 */               if (!StringsKt.m6228D(string)) {
/* 142 */                   StorageTCF storageTCF2 = (StorageTCF) b21.m1203a(b21.f2178a, StorageTCF.Companion.serializer(), string, pz2Var.f15351b);
/* 144 */                   if (storageTCF2 != null) {
/* 146 */                       pz2Var.f15356g = storageTCF2;
                            }
                        }
/* 148 */               storageTCF = pz2Var.f15356g;
/* 150 */               lk2Var.f13360a = this;
/* 152 */               lk2Var.f13361b = str;
/* 154 */               lk2Var.f13362c = storageTCF;
/* 156 */               lk2Var.f13365f = 1;
/* 158 */               objM7931n = m7931n(tCF2SettingsM7928j, storageTCF, lk2Var);
/* 162 */               if (objM7931n == z10Var) {
/* 164 */                   return z10Var;
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 57 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 39 */                StorageTCF storageTCF3 = lk2Var.f13362c;
/* 41 */                str = lk2Var.f13361b;
/* 43 */                qk2 qk2Var = lk2Var.f13360a;
/* 45 */                pg3.m7417A(obj);
/* 50 */                objM7931n = ((o42) obj).f14613a;
/* 52 */                storageTCF = storageTCF3;
/* 53 */                this = qk2Var;
                    }
/* 165 */           Throwable thM7099a = o42.m7099a(objM7931n);
/* 169 */           if (thM7099a != null) {
/* 173 */               return new n42(thM7099a);
                    }
/* 177 */           g80 g80Var = this.f15600c;
/* 183 */           if (this.f15607j.f12216f) {
/* 185 */               av0 av0Var = bv0.Companion;
/* 206 */               ((pz2) g80Var).m7636h(nc1.m6963d(new Pair("IABTCF_gdprApplies", 0)));
                    }
/* 209 */           pz2 pz2Var2 = (pz2) g80Var;
/* 211 */           od2 od2Var2 = pz2Var2.f15354e;
/* 213 */           fh2[] fh2VarArr2 = fh2.f8216a;
/* 215 */           od2Var2.getClass();
/* 222 */           String string2 = od2Var2.f14716a.getString("actual_tcf", HttpUrl.FRAGMENT_ENCODE_SET);
/* 226 */           if (string2 != null) {
/* 229 */               str2 = string2;
                    }
/* 234 */           if (!StringsKt.m6228D(str2) && !str2.equals(str)) {
/* 243 */               str.getClass();
/* 248 */               pz2Var2.f15354e.m7138d("actual_tcf", str);
/* 251 */               pz2Var2.m7630b();
/* 256 */               this.m7939x(storageTCF.f6145a);
/* 259 */               String str3 = storageTCF.f6147c;
/* 261 */               if (str3 != null && (!StringsKt.m6228D(str3))) {
/* 270 */                   C2484y3 c2484y3 = this.f15603f;
/* 272 */                   c2484y3.getClass();
/* 279 */                   if (!StringsKt.m6228D(str3)) {
/* 282 */                       c2484y3.f19467e = str3;
/* 286 */                       pz2 pz2Var3 = (pz2) c2484y3.f19464b;
/* 288 */                       pz2Var3.getClass();
/* 291 */                       od2 od2Var3 = pz2Var3.f15353d;
/* 293 */                       av0 av0Var2 = bv0.Companion;
/* 297 */                       od2Var3.m7138d("IABTCF_AddtlConsent", str3);
/* 300 */                       List list = c2484y3.f19466d;
/* 302 */                       if (list != null && !list.isEmpty()) {
/* 315 */                           c2484y3.m10099g(c2484y3.m10096d());
                                }
                            }
                        }
                    }
/* 318 */           return Unit.f12910a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: r */
                public final Object m7933r(String str, d10 d10Var) {
                    mk2 mk2Var;
                    Object objM9596a;
/* 3 */             if (d10Var instanceof mk2) {
/* 6 */                 mk2Var = (mk2) d10Var;
/* 8 */                 int i = mk2Var.f13840c;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    mk2Var.f13840c = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    mk2Var = new mk2(this, d10Var);
                        }
                    } else {
/* 22 */                mk2Var = new mk2(this, d10Var);
                    }
/* 25 */            Object obj = mk2Var.f13838a;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = mk2Var.f13840c;
                    try {
/* 33 */                if (i2 == 0) {
/* 51 */                    pg3.m7417A(obj);
/* 54 */                    ql2 ql2Var = this.f15610m;
/* 58 */                    wp0 wp0Var = ql2Var != null ? ql2Var.f15623b : null;
/* 60 */                    wp0Var.getClass();
/* 63 */                    mk2Var.f13840c = 1;
/* 65 */                    objM9596a = wp0Var.m9596a(str, mk2Var);
/* 69 */                    if (objM9596a == z10Var) {
/* 71 */                        return z10Var;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 47 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    pg3.m7417A(obj);
/* 42 */                    objM9596a = ((o42) obj).f14613a;
                        }
/* 72 */                Throwable thM7099a = o42.m7099a(objM9596a);
/* 76 */                if (thM7099a == null) {
/* 78 */                    return Unit.f12910a;
                        }
/* 81 */                throw thM7099a;
                    } catch (Throwable th) {
/* 83 */                m42 m42Var = o42.f14612b;
/* 87 */                pl2[] pl2VarArr = pl2.f15173a;
/* 104 */               return new n42(new vz2(AbstractC0886en.m3507k("Usercentrics: Unable to reset Global Vendor List: ", th.getMessage()), th));
                    }
                }

                /* JADX INFO: renamed from: s */
                public final void m7934s() {
/* 3 */             this.f15608k.clear();
/* 8 */             this.f15609l.clear();
/* 12 */            this.f15611n = null;
/* 16 */            this.f15614q.clear();
                }

                /* JADX INFO: renamed from: t */
                public final void m7935t(List list) {
                    u13 u13Var;
                    u13 u13Var2;
                    u13 u13Var3;
                    u13 u13Var4;
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                jl2 jl2Var = (jl2) it.next();
/* 17 */                Boolean bool = jl2Var.f12354b;
/* 19 */                int i = jl2Var.f12353a;
/* 21 */                Boolean bool2 = Boolean.TRUE;
/* 23 */                boolean zM6216a = Intrinsics.m6216a(bool, bool2);
/* 27 */                ql2 ql2Var = this.f15610m;
/* 29 */                if (zM6216a) {
/* 31 */                    if (ql2Var != null && (u13Var4 = ql2Var.f15639r) != null) {
/* 37 */                        u13Var4.m8935b(i);
                            }
                        } else if (ql2Var != null && (u13Var = ql2Var.f15639r) != null) {
/* 47 */                    u13Var.m8937d(i);
                        }
/* 52 */                boolean zM6216a2 = Intrinsics.m6216a(jl2Var.f12355c, bool2);
/* 56 */                ql2 ql2Var2 = this.f15610m;
/* 58 */                if (zM6216a2) {
/* 60 */                    if (ql2Var2 != null && (u13Var2 = ql2Var2.f15640s) != null) {
/* 66 */                        u13Var2.m8935b(i);
                            }
                        } else if (ql2Var2 != null && (u13Var3 = ql2Var2.f15640s) != null) {
/* 76 */                    u13Var3.m8937d(i);
                        }
                    }
                }

                /* JADX INFO: renamed from: u */
                public final void m7936u(List list) {
/* 1 */             ql2 ql2Var = this.f15610m;
/* 3 */             ql2Var.getClass();
/* 8 */             ArrayList arrayList = new ArrayList();
/* 13 */            ArrayList arrayList2 = new ArrayList();
/* 18 */            ArrayList arrayList3 = new ArrayList();
/* 23 */            ArrayList arrayList4 = new ArrayList();
/* 26 */            Iterator it = list.iterator();
/* 34 */            while (it.hasNext()) {
/* 40 */                ll2 ll2Var = (ll2) it.next();
/* 42 */                Boolean bool = ll2Var.f13392b;
/* 44 */                int i = ll2Var.f13391a;
/* 46 */                Boolean bool2 = Boolean.TRUE;
/* 52 */                if (Intrinsics.m6216a(bool, bool2)) {
/* 58 */                    arrayList.add(Integer.valueOf(i));
                        } else {
/* 66 */                    arrayList2.add(Integer.valueOf(i));
                        }
/* 75 */                if (Intrinsics.m6216a(ll2Var.f13393c, bool2)) {
/* 81 */                    arrayList3.add(Integer.valueOf(i));
                        } else {
/* 89 */                    arrayList4.add(Integer.valueOf(i));
                        }
                    }
/* 95 */            ql2Var.f15646y.m8936c(arrayList);
/* 100 */           ql2Var.f15646y.m8938e(arrayList2);
/* 105 */           ql2Var.f15647z.m8936c(arrayList3);
/* 110 */           ql2Var.f15647z.m8938e(arrayList4);
                }

                /* JADX INFO: renamed from: v */
                public final void m7937v(TCF2Settings tCF2Settings, Map map) {
/* 1 */             LinkedHashMap linkedHashMap = this.f15612o;
/* 3 */             linkedHashMap.clear();
/* 6 */             linkedHashMap.putAll(map);
/* 13 */            if (tCF2Settings.f6489T == pk2.f15163a) {
/* 15 */                return;
                    }
/* 16 */            ql2 ql2Var = this.f15610m;
/* 18 */            ql2Var.getClass();
/* 31 */            ql2Var.f15619A.m8936c(CollectionsKt.m6192K(map.keySet()));
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.usercentrics.sdk.services.tcf.interfaces.TCFData, still in use, count: 2, list:
                      (r1v0 com.usercentrics.sdk.services.tcf.interfaces.TCFData) from 0x02fc: MOVE (r17v0 com.usercentrics.sdk.services.tcf.interfaces.TCFData) = (r1v0 com.usercentrics.sdk.services.tcf.interfaces.TCFData) (LINE:765)
                      (r1v0 com.usercentrics.sdk.services.tcf.interfaces.TCFData) from 0x00d8: PHI (r1v20 com.usercentrics.sdk.services.tcf.interfaces.TCFData) = 
                      (r1v0 com.usercentrics.sdk.services.tcf.interfaces.TCFData)
                      (r1v43 com.usercentrics.sdk.services.tcf.interfaces.TCFData)
                     binds: [B:23:0x00a9, B:30:0x010d] A[DONT_GENERATE, DONT_INLINE]
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                    	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                    	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                    */
                /* JADX INFO: renamed from: w */
                public final void m7938w() {
                    /*
                        Method dump skipped, instruction units count: 1177
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.qk2.m7938w():void");
                }

                /* JADX WARN: Code duplicated, block: B:101:0x02f4 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:104:0x0303 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:107:0x0320 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:118:0x0382 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:121:0x038c A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:135:0x03ef A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:136:0x03f5 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:141:0x0420 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:144:0x042c A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:147:0x0438 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:150:0x044d A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:153:0x0462 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:32:0x0127 A[PHI: r16 r17 r18 r19 r20 r21 r22 r25
  0x0127: PHI (r16v14 java.lang.String) = 
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v4 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
  (r16v3 java.lang.String)
 binds: [B:31:0x0114, B:127:0x03c2, B:93:0x02c5, B:136:0x03f5, B:135:0x03ef, B:106:0x031e, B:107:0x0320, B:120:0x038a, B:61:0x01cf, B:68:0x0210, B:69:0x0212, B:152:0x0460, B:153:0x0462, B:46:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r17v13 java.lang.String) = 
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v3 java.lang.String)
  (r17v14 java.lang.String)
 binds: [B:31:0x0114, B:127:0x03c2, B:93:0x02c5, B:136:0x03f5, B:135:0x03ef, B:106:0x031e, B:107:0x0320, B:120:0x038a, B:61:0x01cf, B:68:0x0210, B:69:0x0212, B:152:0x0460, B:153:0x0462, B:46:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r18v15 java.lang.Integer) = 
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v3 java.lang.Integer)
  (r18v4 java.lang.Integer)
  (r18v4 java.lang.Integer)
  (r18v3 java.lang.Integer)
 binds: [B:31:0x0114, B:127:0x03c2, B:93:0x02c5, B:136:0x03f5, B:135:0x03ef, B:106:0x031e, B:107:0x0320, B:120:0x038a, B:61:0x01cf, B:68:0x0210, B:69:0x0212, B:152:0x0460, B:153:0x0462, B:46:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r19v15 java.lang.Integer) = 
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v3 java.lang.Integer)
  (r19v4 java.lang.Integer)
  (r19v4 java.lang.Integer)
  (r19v3 java.lang.Integer)
 binds: [B:31:0x0114, B:127:0x03c2, B:93:0x02c5, B:136:0x03f5, B:135:0x03ef, B:106:0x031e, B:107:0x0320, B:120:0x038a, B:61:0x01cf, B:68:0x0210, B:69:0x0212, B:152:0x0460, B:153:0x0462, B:46:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r20v14 java.lang.Integer) = 
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v3 java.lang.Integer)
  (r20v4 java.lang.Integer)
  (r20v3 java.lang.Integer)
 binds: [B:31:0x0114, B:127:0x03c2, B:93:0x02c5, B:136:0x03f5, B:135:0x03ef, B:106:0x031e, B:107:0x0320, B:120:0x038a, B:61:0x01cf, B:68:0x0210, B:69:0x0212, B:152:0x0460, B:153:0x0462, B:46:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r21v14 java.lang.Integer) = 
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v4 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
  (r21v3 java.lang.Integer)
 binds: [B:31:0x0114, B:127:0x03c2, B:93:0x02c5, B:136:0x03f5, B:135:0x03ef, B:106:0x031e, B:107:0x0320, B:120:0x038a, B:61:0x01cf, B:68:0x0210, B:69:0x0212, B:152:0x0460, B:153:0x0462, B:46:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r22v15 java.lang.Integer) = 
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v4 java.lang.Integer)
  (r22v4 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
  (r22v3 java.lang.Integer)
 binds: [B:31:0x0114, B:127:0x03c2, B:93:0x02c5, B:136:0x03f5, B:135:0x03ef, B:106:0x031e, B:107:0x0320, B:120:0x038a, B:61:0x01cf, B:68:0x0210, B:69:0x0212, B:152:0x0460, B:153:0x0462, B:46:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r25v15 java.util.Map) = 
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v5 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
  (r25v4 java.util.Map)
 binds: [B:31:0x0114, B:127:0x03c2, B:93:0x02c5, B:136:0x03f5, B:135:0x03ef, B:106:0x031e, B:107:0x0320, B:120:0x038a, B:61:0x01cf, B:68:0x0210, B:69:0x0212, B:152:0x0460, B:153:0x0462, B:46:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:66:0x01f7 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Code duplicated, block: B:69:0x0212 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:29:0x010c, B:31:0x0114, B:44:0x0144, B:46:0x014c, B:47:0x0163, B:49:0x016b, B:50:0x018b, B:139:0x0410, B:141:0x0420, B:142:0x0426, B:144:0x042c, B:145:0x0432, B:147:0x0438, B:148:0x0447, B:150:0x044d, B:151:0x045c, B:153:0x0462, B:53:0x0193, B:64:0x01ed, B:66:0x01f7, B:67:0x020c, B:69:0x0212, B:56:0x019a, B:58:0x01a2, B:59:0x01c7, B:61:0x01cf, B:62:0x01e7, B:70:0x0229, B:72:0x0231, B:73:0x024c, B:116:0x0378, B:118:0x0382, B:119:0x0386, B:121:0x038c, B:76:0x0254, B:99:0x02ea, B:101:0x02f4, B:102:0x02fd, B:104:0x0303, B:105:0x031a, B:107:0x0320, B:79:0x025c, B:81:0x0264, B:82:0x0287, B:84:0x028f, B:85:0x02ae, B:88:0x02b5, B:133:0x03e5, B:135:0x03ef, B:136:0x03f5, B:91:0x02bd, B:93:0x02c5, B:94:0x02dc, B:97:0x02e4, B:108:0x033b, B:111:0x0343, B:113:0x034b, B:114:0x0372, B:122:0x0395, B:124:0x039d, B:125:0x03ba, B:127:0x03c2, B:128:0x03d6, B:131:0x03dd, B:137:0x040a, B:154:0x046c, B:156:0x0474, B:158:0x04a7), top: B:199:0x010c }] */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX INFO: renamed from: x */
                public final void m7939x(String str) {
                    String str2;
                    String str3;
                    b40 b40VarM7943a;
                    int i;
                    t82 t82Var;
                    String str4;
                    t82 t82Var2;
                    uh2 uh2Var;
/* 3 */             str.getClass();
/* 6 */             jb1.m5748h();
/* 9 */             ql2 ql2Var = this.f15610m;
/* 11 */            if (ql2Var == null) {
/* 13 */                return;
                    }
/* 14 */            boolean zM7922d = m7922d();
/* 18 */            Map map = od0.f14715a;
/* 20 */            map.getClass();
/* 25 */            g92.Companion.getClass();
/* 28 */            ql2 ql2VarM3682a = f92.m3682a(ql2Var);
/* 32 */            int i2 = ql2VarM3682a.f15628g;
/* 35 */            if (i2 != 2) {
/* 1558 */              throw new C0900f0(fm0.m3781g(i2, "Error encoding TCF String. Invalid version: "), 3);
                    }
/* 39 */            List listM6210b = C1839a.m6210b(t82.CORE);
/* 43 */            listM6210b.getClass();
/* 48 */            ArrayList arrayList = new ArrayList(listM6210b);
/* 53 */            arrayList.add(t82.VENDORS_DISCLOSED);
/* 58 */            if (ql2VarM3682a.f15624c) {
/* 62 */                arrayList.add(t82.PUBLISHER_TC);
                    }
/* 65 */            List listM6192K = CollectionsKt.m6192K(arrayList);
/* 69 */            listM6192K.getClass();
/* 72 */            Iterator it = listM6192K.iterator();
/* 76 */            String str5 = "AA";
/* 78 */            String strM4551b = HttpUrl.FRAGMENT_ENCODE_SET;
/* 80 */            String strM4551b2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 81 */            String strM4551b3 = strM4551b2;
/* 82 */            String strM4551b4 = strM4551b3;
/* 83 */            String strM4551b5 = strM4551b4;
/* 84 */            String strM4551b6 = strM4551b5;
/* 85 */            String strM4551b7 = strM4551b6;
/* 86 */            String strM4551b8 = strM4551b7;
/* 87 */            String strM4551b9 = strM4551b8;
/* 89 */            String strM4551b10 = strM4551b9;
/* 91 */            Integer numValueOf = null;
/* 93 */            Integer numValueOf2 = null;
/* 95 */            Integer numValueOf3 = null;
/* 97 */            Integer numValueOf4 = null;
/* 99 */            Integer numValueOf5 = null;
                    while (true) {
/* 105 */               if (!it.hasNext()) {
/* 1316 */                  Map map2 = map;
/* 1318 */                  Integer numValueOf6 = Integer.valueOf(zM7922d ? 1 : 0);
/* 1322 */                  str5.getClass();
/* 1327 */                  LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 1332 */                  LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 1335 */                  Integer num = numValueOf;
/* 1337 */                  if (num != null) {
/* 1339 */                      av0 av0Var = bv0.Companion;
/* 1343 */                      linkedHashMap2.put("IABTCF_CmpSdkID", num);
                            }
/* 1346 */                  Integer num2 = numValueOf2;
/* 1348 */                  if (num2 != null) {
/* 1350 */                      av0 av0Var2 = bv0.Companion;
/* 1354 */                      linkedHashMap2.put("IABTCF_CmpSdkVersion", num2);
                            }
/* 1357 */                  Integer num3 = numValueOf3;
/* 1359 */                  if (num3 != null) {
/* 1361 */                      av0 av0Var3 = bv0.Companion;
/* 1365 */                      linkedHashMap2.put("IABTCF_PolicyVersion", num3);
                            }
/* 1368 */                  av0 av0Var4 = bv0.Companion;
/* 1372 */                  linkedHashMap2.put("IABTCF_gdprApplies", numValueOf6);
/* 1375 */                  Integer num4 = numValueOf4;
/* 1377 */                  if (num4 != null) {
/* 1381 */                      linkedHashMap2.put("IABTCF_PurposeOneTreatment", num4);
                            }
/* 1388 */                  linkedHashMap.put("IABTCF_TCString", str);
/* 1393 */                  linkedHashMap.put("IABTCF_PublisherCC", str5);
/* 1396 */                  Integer num5 = numValueOf5;
/* 1398 */                  if (num5 != null) {
/* 1402 */                      linkedHashMap2.put("IABTCF_UseNonStandardStacks", num5);
                            }
/* 1407 */                  linkedHashMap.put("IABTCF_VendorConsents", strM4551b);
/* 1412 */                  linkedHashMap.put("IABTCF_VendorLegitimateInterests", strM4551b2);
/* 1417 */                  linkedHashMap.put("IABTCF_PurposeConsents", strM4551b3);
/* 1422 */                  linkedHashMap.put("IABTCF_PurposeLegitimateInterests", strM4551b4);
/* 1427 */                  linkedHashMap.put("IABTCF_SpecialFeaturesOptIns", strM4551b5);
/* 1432 */                  linkedHashMap.put("IABTCF_PublisherConsent", strM4551b6);
/* 1437 */                  linkedHashMap.put("IABTCF_PublisherLegitimateInterests", strM4551b7);
/* 1442 */                  linkedHashMap.put("IABTCF_PublisherCustomPurposesConsents", strM4551b8);
/* 1449 */                  linkedHashMap.put("IABTCF_PublisherCustomPurposesLegitimateInterests", strM4551b9);
/* 1459 */                  linkedHashMap2.put("IABTCF_EnableAdvertiserConsentMode", 1);
/* 1466 */                  linkedHashMap.put("IABTCF_DisclosedVendors", strM4551b10);
/* 1481 */                  for (Map.Entry entry : map2.entrySet()) {
/* 1495 */                      int iIntValue = ((Number) entry.getKey()).intValue();
/* 1503 */                      String str6 = (String) entry.getValue();
/* 1507 */                      bv0.Companion.getClass();
/* 1524 */                      linkedHashMap.put("IABTCF_PublisherRestrictions" + iIntValue, str6);
                            }
/* 1530 */                  LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
/* 1533 */                  linkedHashMap3.putAll(linkedHashMap);
/* 1542 */                  ((pz2) this.f15600c).m7636h(linkedHashMap3);
/* 1545 */                  return;
                        }
/* 113 */               t82 t82Var3 = (t82) it.next();
/* 115 */               str2 = "->";
/* 117 */               boolean z = zM7922d;
/* 123 */               v82.Companion.getClass();
/* 126 */               Map mapM8034a = map;
/* 132 */               fs0 fs0Var = (fs0) v82.f17917a.f7001a;
/* 134 */               fs0Var.getClass();
/* 145 */               List list = (List) ((Map) fs0Var.f8339b).get(t82Var3);
/* 147 */               if (list != null) {
/* 149 */                   Iterator it2 = list.iterator();
                            while (true) {
/* 157 */                       if (it2.hasNext()) {
/* 163 */                           Iterator it3 = it2;
/* 167 */                           str3 = (String) it2.next();
/* 169 */                           Iterator it4 = it;
/* 171 */                           b40VarM7943a = ql2Var.m7943a(str3);
/* 177 */                           EnumC2146rj.Companion.getClass();
/* 180 */                           ql2 ql2Var2 = ql2Var;
/* 182 */                           EnumC2146rj enumC2146rjM7866a = C2109qj.m7866a(str3);
/* 186 */                           if (enumC2146rjM7866a == null) {
/* 190 */                               v82.Companion.getClass();
/* 206 */                               i = u82.m8973a(str3) ? ql2Var2.m7944b().f17529a : 0;
                                    } else {
/* 208 */                               i = enumC2146rjM7866a.f16116a;
                                    }
                                    try {
/* 214 */                               String str7 = str5;
/* 218 */                               strM4551b = strM4551b;
/* 222 */                               String str8 = strM4551b2;
/* 226 */                               String str9 = strM4551b3;
/* 230 */                               String str10 = strM4551b4;
/* 234 */                               String str11 = strM4551b5;
/* 238 */                               String str12 = strM4551b6;
/* 242 */                               String str13 = strM4551b7;
/* 246 */                               String str14 = strM4551b8;
/* 256 */                               str4 = str2;
/* 260 */                               t82Var2 = t82Var3;
                                        switch (str3.hashCode()) {
                                            case -2115730175:
/* 1139 */                                      if (str3.equals("vendorConsents")) {
/* 1145 */                                          ij0 ij0Var = jj0.Companion;
/* 1151 */                                          u13 u13Var = ((xl2) b40VarM7943a).f19245g;
/* 1153 */                                          ij0Var.getClass();
/* 1157 */                                          strM4551b = ij0.m4551b(u13Var, null);
/* 1162 */                                          str5 = str7;
/* 1164 */                                          strM4551b2 = str8;
/* 1166 */                                          strM4551b3 = str9;
/* 1168 */                                          strM4551b4 = str10;
/* 1170 */                                          strM4551b5 = str11;
/* 1172 */                                          strM4551b6 = str12;
/* 1174 */                                          strM4551b7 = str13;
/* 1176 */                                          strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case -2076485454:
/* 1039 */                                      if (!str3.equals("cmpVersion")) {
                                                }
/* 1049 */                                      uh2Var = ((wl2) b40VarM7943a).f18683g;
/* 1055 */                                      if (str3.equals("cmpId")) {
/* 1059 */                                          numValueOf = Integer.valueOf(uh2Var.f17529a);
                                                }
/* 1067 */                                      if (str3.equals("cmpVersion")) {
/* 1071 */                                          numValueOf2 = Integer.valueOf(uh2Var.f17529a);
                                                }
/* 1079 */                                      if (str3.equals("consentScreen")) {
/* 1081 */                                          uy0 uy0Var = vy0.Companion;
/* 1087 */                                          uh2 uh2Var2 = new uh2(uh2Var.f17529a);
/* 1090 */                                          uy0Var.getClass();
/* 1093 */                                          uy0.m9147b(uh2Var2, i);
                                                }
/* 1100 */                                      if (str3.equals("vendorListVersion")) {
/* 1102 */                                          uy0 uy0Var2 = vy0.Companion;
/* 1108 */                                          uh2 uh2Var3 = new uh2(uh2Var.f17529a);
/* 1111 */                                          uy0Var2.getClass();
/* 1114 */                                          uy0.m9147b(uh2Var3, i);
                                                }
/* 1121 */                                      if (str3.equals("policyVersion")) {
/* 1125 */                                          numValueOf3 = Integer.valueOf(uh2Var.f17529a);
                                                }
/* 296 */                                       str5 = str7;
/* 300 */                                       strM4551b2 = str8;
/* 302 */                                       strM4551b3 = str9;
/* 304 */                                       strM4551b4 = str10;
/* 306 */                                       strM4551b5 = str11;
/* 308 */                                       strM4551b6 = str12;
/* 310 */                                       strM4551b7 = str13;
/* 312 */                                       strM4551b8 = str14;
/* 1180 */                                      it = it4;
/* 1182 */                                      it2 = it3;
/* 1184 */                                      ql2Var = ql2Var2;
/* 1186 */                                      str2 = str4;
/* 1188 */                                      t82Var3 = t82Var2;
                                                break;
                                            case -2014745908:
/* 996 */                                       if (!str3.equals("numCustomPurposes")) {
                                                }
/* 1006 */                                      if (str3.equals("version")) {
                                                } else {
/* 1014 */                                          uy0 uy0Var3 = vy0.Companion;
/* 1024 */                                          uh2 uh2Var4 = new uh2(((tl2) b40VarM7943a).f17177g);
/* 1027 */                                          uy0Var3.getClass();
/* 1030 */                                          uy0.m9147b(uh2Var4, i);
                                                }
/* 296 */                                       str5 = str7;
/* 300 */                                       strM4551b2 = str8;
/* 302 */                                       strM4551b3 = str9;
/* 304 */                                       strM4551b4 = str10;
/* 306 */                                       strM4551b5 = str11;
/* 308 */                                       strM4551b6 = str12;
/* 310 */                                       strM4551b7 = str13;
/* 312 */                                       strM4551b8 = str14;
/* 1180 */                                      it = it4;
/* 1182 */                                      it2 = it3;
/* 1184 */                                      ql2Var = ql2Var2;
/* 1186 */                                      str2 = str4;
/* 1188 */                                      t82Var3 = t82Var2;
                                                break;
                                            case -1710804154:
/* 987 */                                       if (str3.equals("policyVersion")) {
/* 1049 */                                          uh2Var = ((wl2) b40VarM7943a).f18683g;
/* 1055 */                                          if (str3.equals("cmpId")) {
/* 1059 */                                              numValueOf = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 1067 */                                          if (str3.equals("cmpVersion")) {
/* 1071 */                                              numValueOf2 = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 1079 */                                          if (str3.equals("consentScreen")) {
/* 1081 */                                              uy0 uy0Var4 = vy0.Companion;
/* 1087 */                                              uh2 uh2Var5 = new uh2(uh2Var.f17529a);
/* 1090 */                                              uy0Var4.getClass();
/* 1093 */                                              uy0.m9147b(uh2Var5, i);
                                                    }
/* 1100 */                                          if (str3.equals("vendorListVersion")) {
/* 1102 */                                              uy0 uy0Var5 = vy0.Companion;
/* 1108 */                                              uh2 uh2Var6 = new uh2(uh2Var.f17529a);
/* 1111 */                                              uy0Var5.getClass();
/* 1114 */                                              uy0.m9147b(uh2Var6, i);
                                                    }
/* 1121 */                                          if (str3.equals("policyVersion")) {
/* 1125 */                                              numValueOf3 = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case -952905459:
/* 961 */                                       if (str3.equals("segmentType")) {
/* 967 */                                           uy0 uy0Var6 = vy0.Companion;
/* 973 */                                           uh2 uh2Var7 = ((wl2) b40VarM7943a).f18683g;
/* 975 */                                           uy0Var6.getClass();
/* 978 */                                           uy0.m9147b(uh2Var7, i);
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case -879778089:
/* 924 */                                       if (str3.equals("purposeConsents")) {
/* 930 */                                           ij0 ij0Var2 = jj0.Companion;
/* 936 */                                           u13 u13Var2 = ((xl2) b40VarM7943a).f19245g;
/* 938 */                                           ij0Var2.getClass();
/* 942 */                                           strM4551b3 = ij0.m4551b(u13Var2, null);
/* 947 */                                           str5 = str7;
/* 949 */                                           strM4551b = strM4551b;
/* 951 */                                           strM4551b2 = str8;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case -740692217:
/* 887 */                                       if (!str3.equals("publisherCountryCode")) {
                                                }
/* 897 */                                       if (str3.equals("consentLanguage")) {
                                                }
/* 907 */                                       if (str3.equals("publisherCountryCode")) {
/* 913 */                                           str5 = ((vl2) b40VarM7943a).f18242g;
                                                } else {
/* 296 */                                           str5 = str7;
                                                }
/* 300 */                                       strM4551b2 = str8;
/* 302 */                                       strM4551b3 = str9;
/* 304 */                                       strM4551b4 = str10;
/* 306 */                                       strM4551b5 = str11;
/* 308 */                                       strM4551b6 = str12;
/* 310 */                                       strM4551b7 = str13;
/* 312 */                                       strM4551b8 = str14;
/* 1180 */                                      it = it4;
/* 1182 */                                      it2 = it3;
/* 1184 */                                      ql2Var = ql2Var2;
/* 1186 */                                      str2 = str4;
/* 1188 */                                      t82Var3 = t82Var2;
                                                break;
                                            case -442009786:
/* 842 */                                       if (str3.equals("publisherCustomConsents")) {
/* 848 */                                           ij0 ij0Var3 = jj0.Companion;
/* 854 */                                           u13 u13Var3 = ((xl2) b40VarM7943a).f19245g;
/* 856 */                                           ij0Var3.getClass();
/* 860 */                                           strM4551b8 = ij0.m4551b(u13Var3, null);
/* 865 */                                           str5 = str7;
/* 867 */                                           strM4551b = strM4551b;
/* 869 */                                           strM4551b2 = str8;
/* 871 */                                           strM4551b3 = str9;
/* 873 */                                           strM4551b4 = str10;
/* 875 */                                           strM4551b5 = str11;
/* 877 */                                           strM4551b6 = str12;
/* 879 */                                           strM4551b7 = str13;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case -145526490:
/* 832 */                                       if (str3.equals("consentScreen")) {
/* 1049 */                                          uh2Var = ((wl2) b40VarM7943a).f18683g;
/* 1055 */                                          if (str3.equals("cmpId")) {
/* 1059 */                                              numValueOf = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 1067 */                                          if (str3.equals("cmpVersion")) {
/* 1071 */                                              numValueOf2 = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 1079 */                                          if (str3.equals("consentScreen")) {
/* 1081 */                                              uy0 uy0Var7 = vy0.Companion;
/* 1087 */                                              uh2 uh2Var8 = new uh2(uh2Var.f17529a);
/* 1090 */                                              uy0Var7.getClass();
/* 1093 */                                              uy0.m9147b(uh2Var8, i);
                                                    }
/* 1100 */                                          if (str3.equals("vendorListVersion")) {
/* 1102 */                                              uy0 uy0Var8 = vy0.Companion;
/* 1108 */                                              uh2 uh2Var9 = new uh2(uh2Var.f17529a);
/* 1111 */                                              uy0Var8.getClass();
/* 1114 */                                              uy0.m9147b(uh2Var9, i);
                                                    }
/* 1121 */                                          if (str3.equals("policyVersion")) {
/* 1125 */                                              numValueOf3 = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case -117505923:
/* 745 */                                       if (!str3.equals("isServiceSpecific")) {
                                                }
/* 755 */                                       if (str3.equals("isServiceSpecific")) {
/* 763 */                                           AbstractC0883ek.Companion.getClass();
                                                }
/* 770 */                                       if (str3.equals("useNonStandardStacks")) {
/* 772 */                                           C0847dk c0847dk = AbstractC0883ek.Companion;
/* 778 */                                           boolean z2 = ((rl2) b40VarM7943a).f16175g;
/* 780 */                                           c0847dk.getClass();
/* 791 */                                           numValueOf5 = Integer.valueOf(Integer.parseInt(C0847dk.m3142a(z2)));
                                                }
/* 799 */                                       if (str3.equals("purposeOneTreatment")) {
/* 801 */                                           C0847dk c0847dk2 = AbstractC0883ek.Companion;
/* 807 */                                           boolean z3 = ((rl2) b40VarM7943a).f16175g;
/* 809 */                                           c0847dk2.getClass();
/* 820 */                                           numValueOf4 = Integer.valueOf(Integer.parseInt(C0847dk.m3142a(z3)));
                                                }
/* 296 */                                       str5 = str7;
/* 300 */                                       strM4551b2 = str8;
/* 302 */                                       strM4551b3 = str9;
/* 304 */                                       strM4551b4 = str10;
/* 306 */                                       strM4551b5 = str11;
/* 308 */                                       strM4551b6 = str12;
/* 310 */                                       strM4551b7 = str13;
/* 312 */                                       strM4551b8 = str14;
/* 1180 */                                      it = it4;
/* 1182 */                                      it2 = it3;
/* 1184 */                                      ql2Var = ql2Var2;
/* 1186 */                                      str2 = str4;
/* 1188 */                                      t82Var3 = t82Var2;
                                                break;
                                            case 94785793:
/* 737 */                                       if (str3.equals("cmpId")) {
/* 1049 */                                          uh2Var = ((wl2) b40VarM7943a).f18683g;
/* 1055 */                                          if (str3.equals("cmpId")) {
/* 1059 */                                              numValueOf = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 1067 */                                          if (str3.equals("cmpVersion")) {
/* 1071 */                                              numValueOf2 = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 1079 */                                          if (str3.equals("consentScreen")) {
/* 1081 */                                              uy0 uy0Var9 = vy0.Companion;
/* 1087 */                                              uh2 uh2Var10 = new uh2(uh2Var.f17529a);
/* 1090 */                                              uy0Var9.getClass();
/* 1093 */                                              uy0.m9147b(uh2Var10, i);
                                                    }
/* 1100 */                                          if (str3.equals("vendorListVersion")) {
/* 1102 */                                              uy0 uy0Var10 = vy0.Companion;
/* 1108 */                                              uh2 uh2Var11 = new uh2(uh2Var.f17529a);
/* 1111 */                                              uy0Var10.getClass();
/* 1114 */                                              uy0.m9147b(uh2Var11, i);
                                                    }
/* 1121 */                                          if (str3.equals("policyVersion")) {
/* 1125 */                                              numValueOf3 = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 204489283:
/* 708 */                                       if (str3.equals("publisherRestrictions")) {
/* 714 */                                           qz1 qz1Var = rz1.Companion;
/* 720 */                                           xz1 xz1Var = ((ul2) b40VarM7943a).f17589g;
/* 722 */                                           qz1Var.getClass();
/* 725 */                                           mapM8034a = qz1.m8034a(xz1Var);
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 351608024:
/* 698 */                                       if (str3.equals("version")) {
/* 1006 */                                          if (str3.equals("version")) {
                                                    } else {
/* 1014 */                                              uy0 uy0Var11 = vy0.Companion;
/* 1024 */                                              uh2 uh2Var12 = new uh2(((tl2) b40VarM7943a).f17177g);
/* 1027 */                                              uy0Var11.getClass();
/* 1030 */                                              uy0.m9147b(uh2Var12, i);
                                                    }
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 439958894:
/* 691 */                                       if (str3.equals("useNonStandardStacks")) {
/* 755 */                                           if (str3.equals("isServiceSpecific")) {
/* 763 */                                               AbstractC0883ek.Companion.getClass();
                                                    }
/* 770 */                                           if (str3.equals("useNonStandardStacks")) {
/* 772 */                                               C0847dk c0847dk3 = AbstractC0883ek.Companion;
/* 778 */                                               boolean z4 = ((rl2) b40VarM7943a).f16175g;
/* 780 */                                               c0847dk3.getClass();
/* 791 */                                               numValueOf5 = Integer.valueOf(Integer.parseInt(C0847dk.m3142a(z4)));
                                                    }
/* 799 */                                           if (str3.equals("purposeOneTreatment")) {
/* 801 */                                               C0847dk c0847dk4 = AbstractC0883ek.Companion;
/* 807 */                                               boolean z5 = ((rl2) b40VarM7943a).f16175g;
/* 809 */                                               c0847dk4.getClass();
/* 820 */                                               numValueOf4 = Integer.valueOf(Integer.parseInt(C0847dk.m3142a(z5)));
                                                    }
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 501667126:
/* 654 */                                       if (str3.equals("purposeLegitimateInterests")) {
/* 660 */                                           ij0 ij0Var4 = jj0.Companion;
/* 666 */                                           u13 u13Var4 = ((xl2) b40VarM7943a).f19245g;
/* 668 */                                           ij0Var4.getClass();
/* 672 */                                           strM4551b4 = ij0.m4551b(u13Var4, null);
/* 677 */                                           str5 = str7;
/* 679 */                                           strM4551b = strM4551b;
/* 681 */                                           strM4551b2 = str8;
/* 683 */                                           strM4551b3 = str9;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 544050613:
/* 611 */                                       if (str3.equals("publisherConsents")) {
/* 617 */                                           ij0 ij0Var5 = jj0.Companion;
/* 623 */                                           u13 u13Var5 = ((xl2) b40VarM7943a).f19245g;
/* 625 */                                           ij0Var5.getClass();
/* 629 */                                           strM4551b6 = ij0.m4551b(u13Var5, null);
/* 634 */                                           str5 = str7;
/* 636 */                                           strM4551b = strM4551b;
/* 638 */                                           strM4551b2 = str8;
/* 640 */                                           strM4551b3 = str9;
/* 642 */                                           strM4551b4 = str10;
/* 644 */                                           strM4551b5 = str11;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 568283376:
/* 601 */                                       if (str3.equals("purposeOneTreatment")) {
/* 755 */                                           if (str3.equals("isServiceSpecific")) {
/* 763 */                                               AbstractC0883ek.Companion.getClass();
                                                    }
/* 770 */                                           if (str3.equals("useNonStandardStacks")) {
/* 772 */                                               C0847dk c0847dk5 = AbstractC0883ek.Companion;
/* 778 */                                               boolean z6 = ((rl2) b40VarM7943a).f16175g;
/* 780 */                                               c0847dk5.getClass();
/* 791 */                                               numValueOf5 = Integer.valueOf(Integer.parseInt(C0847dk.m3142a(z6)));
                                                    }
/* 799 */                                           if (str3.equals("purposeOneTreatment")) {
/* 801 */                                               C0847dk c0847dk6 = AbstractC0883ek.Companion;
/* 807 */                                               boolean z7 = ((rl2) b40VarM7943a).f16175g;
/* 809 */                                               c0847dk6.getClass();
/* 820 */                                               numValueOf4 = Integer.valueOf(Integer.parseInt(C0847dk.m3142a(z7)));
                                                    }
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 680983954:
/* 593 */                                       if (str3.equals("consentLanguage")) {
/* 897 */                                           if (str3.equals("consentLanguage")) {
                                                    }
/* 907 */                                           if (str3.equals("publisherCountryCode")) {
/* 913 */                                               str5 = ((vl2) b40VarM7943a).f18242g;
                                                    } else {
/* 296 */                                               str5 = str7;
                                                    }
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 1000364236:
/* 560 */                                       if (str3.equals("vendorLegitimateInterests")) {
/* 566 */                                           ij0 ij0Var6 = jj0.Companion;
/* 572 */                                           u13 u13Var6 = ((xl2) b40VarM7943a).f19245g;
/* 574 */                                           ij0Var6.getClass();
/* 578 */                                           strM4551b2 = ij0.m4551b(u13Var6, null);
/* 583 */                                           str5 = str7;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 1028554472:
/* 492 */                                       if (!str3.equals("created")) {
                                                }
/* 502 */                                       if (str3.equals("created")) {
/* 504 */                                           c50 c50Var = d50.Companion;
/* 510 */                                           Long l = ((sl2) b40VarM7943a).f16675g;
/* 512 */                                           l.getClass();
/* 515 */                                           long jLongValue = l.longValue();
/* 519 */                                           c50Var.getClass();
/* 522 */                                           c50.m1531a(i, jLongValue);
                                                }
/* 529 */                                       if (str3.equals("lastUpdated")) {
/* 531 */                                           c50 c50Var2 = d50.Companion;
/* 537 */                                           Long l2 = ((sl2) b40VarM7943a).f16675g;
/* 539 */                                           l2.getClass();
/* 542 */                                           long jLongValue2 = l2.longValue();
/* 546 */                                           c50Var2.getClass();
/* 549 */                                           c50.m1531a(i, jLongValue2);
                                                }
/* 296 */                                       str5 = str7;
/* 300 */                                       strM4551b2 = str8;
/* 302 */                                       strM4551b3 = str9;
/* 304 */                                       strM4551b4 = str10;
/* 306 */                                       strM4551b5 = str11;
/* 308 */                                       strM4551b6 = str12;
/* 310 */                                       strM4551b7 = str13;
/* 312 */                                       strM4551b8 = str14;
/* 1180 */                                      it = it4;
/* 1182 */                                      it2 = it3;
/* 1184 */                                      ql2Var = ql2Var2;
/* 1186 */                                      str2 = str4;
/* 1188 */                                      t82Var3 = t82Var2;
                                                break;
                                            case 1272166759:
/* 462 */                                       if (str3.equals("publisherCustomLegitimateInterests")) {
/* 468 */                                           ij0 ij0Var7 = jj0.Companion;
/* 474 */                                           u13 u13Var7 = ((xl2) b40VarM7943a).f19245g;
/* 476 */                                           ij0Var7.getClass();
/* 480 */                                           strM4551b9 = ij0.m4551b(u13Var7, null);
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 1401591704:
/* 417 */                                       if (str3.equals("publisherLegitimateInterests")) {
/* 423 */                                           ij0 ij0Var8 = jj0.Companion;
/* 429 */                                           u13 u13Var8 = ((xl2) b40VarM7943a).f19245g;
/* 431 */                                           ij0Var8.getClass();
/* 435 */                                           strM4551b7 = ij0.m4551b(u13Var8, null);
/* 440 */                                           str5 = str7;
/* 442 */                                           strM4551b = strM4551b;
/* 444 */                                           strM4551b2 = str8;
/* 446 */                                           strM4551b3 = str9;
/* 448 */                                           strM4551b4 = str10;
/* 450 */                                           strM4551b5 = str11;
/* 452 */                                           strM4551b6 = str12;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 1649733957:
/* 408 */                                       if (str3.equals("lastUpdated")) {
/* 502 */                                           if (str3.equals("created")) {
/* 504 */                                               c50 c50Var3 = d50.Companion;
/* 510 */                                               Long l3 = ((sl2) b40VarM7943a).f16675g;
/* 512 */                                               l3.getClass();
/* 515 */                                               long jLongValue3 = l3.longValue();
/* 519 */                                               c50Var3.getClass();
/* 522 */                                               c50.m1531a(i, jLongValue3);
                                                    }
/* 529 */                                           if (str3.equals("lastUpdated")) {
/* 531 */                                               c50 c50Var4 = d50.Companion;
/* 537 */                                               Long l4 = ((sl2) b40VarM7943a).f16675g;
/* 539 */                                               l4.getClass();
/* 542 */                                               long jLongValue4 = l4.longValue();
/* 546 */                                               c50Var4.getClass();
/* 549 */                                               c50.m1531a(i, jLongValue4);
                                                    }
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 1722227698:
/* 400 */                                       if (str3.equals("vendorListVersion")) {
/* 1049 */                                          uh2Var = ((wl2) b40VarM7943a).f18683g;
/* 1055 */                                          if (str3.equals("cmpId")) {
/* 1059 */                                              numValueOf = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 1067 */                                          if (str3.equals("cmpVersion")) {
/* 1071 */                                              numValueOf2 = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 1079 */                                          if (str3.equals("consentScreen")) {
/* 1081 */                                              uy0 uy0Var12 = vy0.Companion;
/* 1087 */                                              uh2 uh2Var13 = new uh2(uh2Var.f17529a);
/* 1090 */                                              uy0Var12.getClass();
/* 1093 */                                              uy0.m9147b(uh2Var13, i);
                                                    }
/* 1100 */                                          if (str3.equals("vendorListVersion")) {
/* 1102 */                                              uy0 uy0Var13 = vy0.Companion;
/* 1108 */                                              uh2 uh2Var14 = new uh2(uh2Var.f17529a);
/* 1111 */                                              uy0Var13.getClass();
/* 1114 */                                              uy0.m9147b(uh2Var14, i);
                                                    }
/* 1121 */                                          if (str3.equals("policyVersion")) {
/* 1125 */                                              numValueOf3 = Integer.valueOf(uh2Var.f17529a);
                                                    }
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 1886388920:
/* 362 */                                       if (str3.equals("specialFeatureOptins")) {
/* 368 */                                           ij0 ij0Var9 = jj0.Companion;
/* 374 */                                           u13 u13Var9 = ((xl2) b40VarM7943a).f19245g;
/* 376 */                                           ij0Var9.getClass();
/* 380 */                                           strM4551b5 = ij0.m4551b(u13Var9, null);
/* 385 */                                           str5 = str7;
/* 387 */                                           strM4551b = strM4551b;
/* 389 */                                           strM4551b2 = str8;
/* 391 */                                           strM4551b3 = str9;
/* 393 */                                           strM4551b4 = str10;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 1982848911:
/* 331 */                                       if (str3.equals("vendorsDisclosed")) {
/* 337 */                                           ij0 ij0Var10 = jj0.Companion;
/* 343 */                                           u13 u13Var10 = ((xl2) b40VarM7943a).f19245g;
/* 345 */                                           ij0Var10.getClass();
/* 349 */                                           strM4551b10 = ij0.m4551b(u13Var10, null);
/* 296 */                                           str5 = str7;
/* 300 */                                           strM4551b2 = str8;
/* 302 */                                           strM4551b3 = str9;
/* 304 */                                           strM4551b4 = str10;
/* 306 */                                           strM4551b5 = str11;
/* 308 */                                           strM4551b6 = str12;
/* 310 */                                           strM4551b7 = str13;
/* 312 */                                           strM4551b8 = str14;
/* 1180 */                                          it = it4;
/* 1182 */                                          it2 = it3;
/* 1184 */                                          ql2Var = ql2Var2;
/* 1186 */                                          str2 = str4;
/* 1188 */                                          t82Var3 = t82Var2;
                                                }
                                                break;
                                            case 1995874045:
                                                try {
/* 275 */                                           if (str3.equals("vendorsAllowed")) {
/* 281 */                                               ij0 ij0Var11 = jj0.Companion;
/* 287 */                                               u13 u13Var11 = ((xl2) b40VarM7943a).f19245g;
/* 289 */                                               ij0Var11.getClass();
/* 293 */                                               ij0.m4551b(u13Var11, null);
/* 296 */                                               str5 = str7;
/* 300 */                                               strM4551b2 = str8;
/* 302 */                                               strM4551b3 = str9;
/* 304 */                                               strM4551b4 = str10;
/* 306 */                                               strM4551b5 = str11;
/* 308 */                                               strM4551b6 = str12;
/* 310 */                                               strM4551b7 = str13;
/* 312 */                                               strM4551b8 = str14;
/* 1180 */                                              it = it4;
/* 1182 */                                              it2 = it3;
/* 1184 */                                              ql2Var = ql2Var2;
/* 1186 */                                              str2 = str4;
/* 1188 */                                              t82Var3 = t82Var2;
                                                    }
                                                } catch (Throwable th) {
/* 323 */                                           th = th;
/* 317 */                                           str2 = str4;
/* 319 */                                           t82Var = t82Var2;
/* 1278 */                                          throw new C0900f0("Error encoding " + t82Var + str2 + str3 + ": " + th.getMessage(), 3);
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    } catch (Throwable th2) {
/* 1240 */                              th = th2;
/* 1241 */                              t82Var = t82Var3;
                                    }
                                }
                            }
                        }
/* 1302 */              map = mapM8034a;
/* 1306 */              zM7922d = z;
/* 1308 */              it = it;
/* 1310 */              ql2Var = ql2Var;
                    }
/* 1196 */          StringBuilder sb = new StringBuilder();
/* 1199 */          sb.append("Error encoding ");
/* 1202 */          t82Var = t82Var2;
                    try {
/* 1204 */              sb.append(t82Var);
/* 1207 */              str2 = str4;
                        try {
/* 1209 */                  sb.append(str2);
/* 1212 */                  sb.append(str3);
/* 1217 */                  sb.append(", value: ");
/* 1222 */                  sb.append(b40VarM7943a);
/* 1233 */                  throw new C0900f0(sb.toString(), 3);
                        } catch (Throwable th3) {
/* 1234 */                  th = th3;
/* 1278 */                  throw new C0900f0("Error encoding " + t82Var + str2 + str3 + ": " + th.getMessage(), 3);
                        }
                    } catch (Throwable th4) {
/* 1236 */              th = th4;
/* 1237 */              str2 = str4;
                    }
                }

                /* JADX INFO: renamed from: y */
                public final void m7940y(wk2 wk2Var) throws C0900f0 {
/* 1 */             ql2 ql2Var = this.f15610m;
/* 3 */             if (ql2Var != null) {
/* 12 */                ql2Var.m7947e(new uh2(wk2Var.f18675a));
                    }
/* 15 */            ql2 ql2Var2 = this.f15610m;
/* 17 */            if (ql2Var2 != null) {
/* 28 */                long jM4115c = new h50().m4114b().m4115c();
/* 36 */                ql2Var2.f15637p = Long.valueOf(jM4115c);
/* 42 */                ql2Var2.f15636o = Long.valueOf(jM4115c);
                    }
/* 44 */            m7934s();
/* 56 */            C0875ec c0875ecM9743b = this.f15605h.m9743b(new C1929mj(this, null, 7));
/* 66 */            c0875ecM9743b.m3370H(new ok2(this, 0));
/* 75 */            c0875ecM9743b.m3369G(new ok2(this, 1));
                }
            }
