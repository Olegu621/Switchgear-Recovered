            package com.google.android.gms.internal.drive;

            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class zzky extends zziw<String> implements zzkz, RandomAccess {
                private static final zzky zztk;
                private static final zzkz zztl;
                private final List<Object> zziu;

                static {
/* 3 */             zzky zzkyVar = new zzky();
/* 6 */             zztk = zzkyVar;
/* 8 */             zzkyVar.zzbp();
/* 11 */            zztl = zzkyVar;
                }

                public zzky(int i) {
/* 6 */             this((ArrayList<Object>) new ArrayList(i));
                }

                private static String zzf(Object obj) {
/* 3 */             if (obj instanceof String) {
/* 5 */                 return (String) obj;
                    }
                    return obj instanceof zzjc ? ((zzjc) obj).zzbt() : zzkm.zze((byte[]) obj);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ void add(int i, Object obj) {
/* 3 */             zzbq();
/* 8 */             this.zziu.add(i, (String) obj);
/* 15 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final boolean addAll(int i, Collection<? extends String> collection) {
/* 1 */             zzbq();
/* 6 */             if (collection instanceof zzkz) {
/* 10 */                collection = ((zzkz) collection).zzdr();
                    }
/* 16 */            boolean zAddAll = this.zziu.addAll(i, collection);
/* 24 */            ((AbstractList) this).modCount++;
/* 26 */            return zAddAll;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 1 */             zzbq();
/* 6 */             this.zziu.clear();
/* 13 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
/* 1 */             return super.equals(obj);
                }

                @Override // java.util.AbstractList, java.util.List
                public final /* synthetic */ Object get(int i) {
/* 3 */             Object obj = this.zziu.get(i);
/* 9 */             if (obj instanceof String) {
/* 11 */                return (String) obj;
                    }
/* 16 */            if (obj instanceof zzjc) {
/* 18 */                zzjc zzjcVar = (zzjc) obj;
/* 20 */                String strZzbt = zzjcVar.zzbt();
/* 28 */                if (zzjcVar.zzbu()) {
/* 32 */                    this.zziu.set(i, strZzbt);
                        }
/* 35 */                return strZzbt;
                    }
/* 36 */            byte[] bArr = (byte[]) obj;
/* 38 */            String strZze = zzkm.zze(bArr);
/* 46 */            if (zzkm.zzd(bArr)) {
/* 50 */                this.zziu.set(i, strZze);
                    }
/* 53 */            return strZze;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
                public final /* bridge */ /* synthetic */ int hashCode() {
/* 1 */             return super.hashCode();
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ Object remove(int i) {
/* 1 */             zzbq();
/* 6 */             Object objRemove = this.zziu.remove(i);
/* 14 */            ((AbstractList) this).modCount++;
/* 16 */            return zzf(objRemove);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
/* 1 */             return super.removeAll(collection);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
/* 1 */             return super.retainAll(collection);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
                public final /* synthetic */ Object set(int i, Object obj) {
/* 3 */             zzbq();
/* 12 */            return zzf(this.zziu.set(i, (String) obj));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.zziu.size();
                }

                @Override // com.google.android.gms.internal.drive.zzkz
                public final Object zzao(int i) {
/* 3 */             return this.zziu.get(i);
                }

                @Override // com.google.android.gms.internal.drive.zziw, com.google.android.gms.internal.drive.zzkp
                public final /* bridge */ /* synthetic */ boolean zzbo() {
/* 1 */             return super.zzbo();
                }

                @Override // com.google.android.gms.internal.drive.zzkz
                public final List<?> zzdr() {
/* 3 */             return Collections.unmodifiableList(this.zziu);
                }

                @Override // com.google.android.gms.internal.drive.zzkz
                public final zzkz zzds() {
                    return zzbo() ? new zzna(this) : this;
                }

                @Override // com.google.android.gms.internal.drive.zzkp
                public final /* synthetic */ zzkp zzr(int i) {
/* 5 */             if (i < size()) {
/* 23 */                f42.m3649e();
/* 26 */                return null;
                    }
/* 9 */             ArrayList arrayList = new ArrayList(i);
/* 14 */            arrayList.addAll(this.zziu);
/* 19 */            return new zzky((ArrayList<Object>) arrayList);
                }

/* 9 */         public zzky() {
/* 10 */            this(10);
                }

/* 10 */        private zzky(ArrayList<Object> arrayList) {
/* 12 */            this.zziu = arrayList;
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 20 */        public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
/* 21 */            return super.remove(obj);
                }

                @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 26 */        public final boolean addAll(Collection<? extends String> collection) {
/* 27 */            return addAll(size(), collection);
                }
            }
