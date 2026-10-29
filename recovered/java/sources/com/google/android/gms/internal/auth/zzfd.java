            package com.google.android.gms.internal.auth;

            import java.util.AbstractList;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zzfd extends zzdq implements RandomAccess, zzfe {
                public static final zzfe zza;
                private static final zzfd zzb;
                private final List zzc;

                static {
/* 5 */             zzfd zzfdVar = new zzfd(10);
/* 8 */             zzb = zzfdVar;
/* 10 */            zzfdVar.zzb();
/* 13 */            zza = zzfdVar;
                }

                public zzfd(int i) {
/* 9 */             this.zzc = new ArrayList(i);
                }

                private static String zzh(Object obj) {
/* 3 */             if (obj instanceof String) {
/* 5 */                 return (String) obj;
                    }
                    return obj instanceof zzee ? ((zzee) obj).zzm(zzez.zzb) : zzez.zzh((byte[]) obj);
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
/* 3 */             zza();
/* 8 */             this.zzc.add(i, (String) obj);
/* 15 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 1 */             zza();
/* 6 */             if (collection instanceof zzfe) {
/* 10 */                collection = ((zzfe) collection).zzg();
                    }
/* 16 */            boolean zAddAll = this.zzc.addAll(i, collection);
/* 24 */            ((AbstractList) this).modCount++;
/* 26 */            return zAddAll;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 1 */             zza();
/* 6 */             this.zzc.clear();
/* 13 */            ((AbstractList) this).modCount++;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 1 */             zza();
/* 6 */             Object objRemove = this.zzc.remove(i);
/* 14 */            ((AbstractList) this).modCount++;
/* 16 */            return zzh(objRemove);
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 3 */             zza();
/* 12 */            return zzh(this.zzc.set(i, (String) obj));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.zzc.size();
                }

                @Override // com.google.android.gms.internal.auth.zzey
                public final /* bridge */ /* synthetic */ zzey zzd(int i) {
/* 5 */             if (i < size()) {
/* 23 */                f42.m3649e();
/* 26 */                return null;
                    }
/* 9 */             ArrayList arrayList = new ArrayList(i);
/* 14 */            arrayList.addAll(this.zzc);
/* 19 */            return new zzfd(arrayList);
                }

                @Override // com.google.android.gms.internal.auth.zzfe
                public final zzfe zze() {
                    return zzc() ? new zzhd(this) : this;
                }

                @Override // java.util.AbstractList, java.util.List
                /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
                public final String get(int i) {
/* 3 */             Object obj = this.zzc.get(i);
/* 9 */             if (obj instanceof String) {
/* 11 */                return (String) obj;
                    }
/* 16 */            if (obj instanceof zzee) {
/* 18 */                zzee zzeeVar = (zzee) obj;
/* 22 */                String strZzm = zzeeVar.zzm(zzez.zzb);
/* 30 */                if (zzeeVar.zzh()) {
/* 34 */                    this.zzc.set(i, strZzm);
                        }
/* 37 */                return strZzm;
                    }
/* 38 */            byte[] bArr = (byte[]) obj;
/* 40 */            String strZzh = zzez.zzh(bArr);
/* 48 */            if (zzez.zzi(bArr)) {
/* 52 */                this.zzc.set(i, strZzh);
                    }
/* 55 */            return strZzh;
                }

                @Override // com.google.android.gms.internal.auth.zzfe
                public final List zzg() {
/* 3 */             return Collections.unmodifiableList(this.zzc);
                }

/* 11 */        public zzfd() {
/* 12 */            this(10);
                }

/* 12 */        private zzfd(ArrayList arrayList) {
                    this.zzc = arrayList;
                }

                @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 26 */        public final boolean addAll(Collection collection) {
/* 27 */            return addAll(size(), collection);
                }
            }
