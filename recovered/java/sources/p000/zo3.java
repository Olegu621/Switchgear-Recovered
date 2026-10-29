            package p000;

            import java.nio.charset.Charset;
            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.RandomAccess;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class zo3 extends vm3 implements RandomAccess, ap3 {

                /* JADX INFO: renamed from: b */
                public final List f20285b;

                static {
/* 3 */             new zo3();
                }

                public zo3(int i) {
/* 3 */             ArrayList arrayList = new ArrayList(i);
/* 7 */             super(true);
/* 10 */            this.f20285b = arrayList;
                }

                @Override // p000.ro3
                /* JADX INFO: renamed from: I */
                public final ro3 mo8221I(int i) {
/* 1 */             List list = this.f20285b;
/* 7 */             if (i < list.size()) {
/* 23 */                f42.m3649e();
/* 26 */                return null;
                    }
/* 11 */            ArrayList arrayList = new ArrayList(i);
/* 14 */            arrayList.addAll(list);
/* 19 */            return new zo3(arrayList);
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
/* 3 */             m9305a();
/* 8 */             this.f20285b.add(i, (String) obj);
/* 15 */            ((AbstractList) this).modCount++;
                }

                @Override // p000.vm3, java.util.AbstractList, java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 1 */             m9305a();
/* 6 */             if (collection instanceof ap3) {
/* 10 */                collection = ((ap3) collection).zzh();
                    }
/* 16 */            boolean zAddAll = this.f20285b.addAll(i, collection);
/* 24 */            ((AbstractList) this).modCount++;
/* 26 */            return zAddAll;
                }

                @Override // java.util.AbstractList, java.util.List
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String get(int i) {
                    String str;
/* 1 */             List list = this.f20285b;
/* 3 */             Object obj = list.get(i);
/* 9 */             if (obj instanceof String) {
/* 11 */                return (String) obj;
                    }
/* 17 */            if (!(obj instanceof cn3)) {
/* 70 */                byte[] bArr = (byte[]) obj;
/* 76 */                String str2 = new String(bArr, so3.f16726a);
/* 79 */                cg3 cg3Var = zq3.f20295a;
/* 81 */                int length = bArr.length;
/* 82 */                cg3Var.getClass();
/* 89 */                if (cg3.m1652a(bArr, 0, length)) {
/* 91 */                    list.set(i, str2);
                        }
/* 94 */                return str2;
                    }
/* 19 */            cn3 cn3Var = (cn3) obj;
/* 21 */            Charset charset = so3.f16726a;
/* 27 */            if (cn3Var.mo320c() == 0) {
/* 29 */                str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 33 */                an3 an3Var = (an3) cn3Var;
/* 43 */                str = new String(an3Var.f344c, 0, an3Var.mo320c(), charset);
                    }
/* 47 */            an3 an3Var2 = (an3) cn3Var;
/* 49 */            byte[] bArr2 = an3Var2.f344c;
/* 51 */            int iMo320c = an3Var2.mo320c();
/* 57 */            zq3.f20295a.getClass();
/* 64 */            if (cg3.m1652a(bArr2, 0, iMo320c)) {
/* 66 */                list.set(i, str);
                    }
/* 69 */            return str;
                }

                @Override // p000.vm3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 1 */             m9305a();
/* 6 */             this.f20285b.clear();
/* 13 */            ((AbstractList) this).modCount++;
                }

                @Override // p000.vm3, java.util.AbstractList, java.util.List
                public final Object remove(int i) {
/* 1 */             m9305a();
/* 6 */             Object objRemove = this.f20285b.remove(i);
/* 14 */            ((AbstractList) this).modCount++;
/* 18 */            if (objRemove instanceof String) {
/* 20 */                return (String) objRemove;
                    }
/* 25 */            if (!(objRemove instanceof cn3)) {
/* 61 */                return new String((byte[]) objRemove, so3.f16726a);
                    }
/* 27 */            cn3 cn3Var = (cn3) objRemove;
/* 29 */            Charset charset = so3.f16726a;
/* 35 */            if (cn3Var.mo320c() == 0) {
/* 37 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 40 */            an3 an3Var = (an3) cn3Var;
/* 51 */            return new String(an3Var.f344c, 0, an3Var.mo320c(), charset);
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 3 */             m9305a();
/* 8 */             Object obj2 = this.f20285b.set(i, (String) obj);
/* 14 */            if (obj2 instanceof String) {
/* 16 */                return (String) obj2;
                    }
/* 21 */            if (!(obj2 instanceof cn3)) {
/* 57 */                return new String((byte[]) obj2, so3.f16726a);
                    }
/* 23 */            cn3 cn3Var = (cn3) obj2;
/* 25 */            Charset charset = so3.f16726a;
/* 31 */            if (cn3Var.mo320c() == 0) {
/* 33 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 36 */            an3 an3Var = (an3) cn3Var;
/* 47 */            return new String(an3Var.f344c, 0, an3Var.mo320c(), charset);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.f20285b.size();
                }

                @Override // p000.ap3
                public final Object zzg(int i) {
/* 3 */             return this.f20285b.get(i);
                }

                @Override // p000.ap3
                public final List zzh() {
/* 3 */             return Collections.unmodifiableList(this.f20285b);
                }

                @Override // p000.ap3
                public final ap3 zzi() {
                    return this.f18251a ? new oq3(this) : this;
                }

/* 12 */        public zo3(ArrayList arrayList) {
/* 13 */            super(true);
                    this.f20285b = arrayList;
                }

/* 13 */        public zo3() {
/* 14 */            super(false);
/* 15 */            this.f20285b = Collections.EMPTY_LIST;
                }

                @Override // p000.vm3, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 26 */        public final boolean addAll(Collection collection) {
/* 28 */            return addAll(this.f20285b.size(), collection);
                }
            }
