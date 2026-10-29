            package com.google.android.gms.internal.drive;

            import com.google.android.gms.internal.drive.zzkk;
            import com.google.android.gms.internal.drive.zzkk.zza;
            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public abstract class zzkk<MessageType extends zzkk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzit<MessageType, BuilderType> {
                private static Map<Object, zzkk<?, ?>> zzrs = new ConcurrentHashMap();
                protected zzmy zzrq = zzmy.zzfa();
                private int zzrr = -1;

                public static class zzb<T extends zzkk<T, ?>> extends zziv<T> {
                    private final T zzrt;

                    public zzb(T t) {
/* 4 */                 this.zzrt = t;
                    }
                }

                public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzkk<MessageType, BuilderType> implements zzls {
                    protected zzkb<Object> zzrw = zzkb.zzcn();

                    public final zzkb<Object> zzdg() {
/* 7 */                 if (this.zzrw.isImmutable()) {
/* 17 */                    this.zzrw = (zzkb) this.zzrw.clone();
                        }
/* 19 */                return this.zzrw;
                    }
                }

                public static class zzd<ContainingType extends zzlq, Type> extends zzjv<ContainingType, Type> {
                }

                public static final enum zze {
                    public static final int zzrx = 1;
                    public static final int zzry = 2;
                    public static final int zzrz = 3;
                    public static final int zzsa = 4;
                    public static final int zzsb = 5;
                    public static final int zzsc = 6;
                    public static final int zzsd = 7;
                    private static final /* synthetic */ int[] zzse = {1, 2, 3, 4, 5, 6, 7};
                    public static final int zzsf = 1;
                    public static final int zzsg = 2;
                    private static final /* synthetic */ int[] zzsh = {1, 2};
                    public static final int zzsi = 1;
                    public static final int zzsj = 2;
                    private static final /* synthetic */ int[] zzsk = {1, 2};

                    public static int[] zzdh() {
/* 7 */                 return (int[]) zzse.clone();
                    }
                }

                private static <T extends zzkk<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzjx zzjxVar) throws zzkq {
/* 9 */             T t2 = (T) t.zza(zze.zzsa, null, null);
                    try {
/* 27 */                zzmd.zzej().zzq(t2).zza(t2, bArr, 0, i2, new zziz(zzjxVar));
/* 30 */                t2.zzbp();
/* 35 */                if (t2.zzne == 0) {
/* 37 */                    return t2;
                        }
/* 43 */                throw new RuntimeException();
                    } catch (IOException e) {
/* 62 */                if (e.getCause() instanceof zzkq) {
/* 70 */                    throw ((zzkq) e.getCause());
                        }
/* 84 */                throw new zzkq(e.getMessage()).zzg(t2);
                    } catch (IndexOutOfBoundsException unused) {
/* 55 */                throw zzkq.zzdi().zzg(t2);
                    }
                }

                public static <T extends zzkk<?, ?>> T zzd(Class<T> cls) {
/* 7 */             T t = (T) zzrs.get(cls);
/* 9 */             if (t == null) {
                        try {
/* 20 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 29 */                    t = (T) zzrs.get(cls);
                        } catch (ClassNotFoundException e) {
/* 40 */                    throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
/* 41 */            if (t != null) {
/* 70 */                return t;
                    }
/* 56 */            T t2 = (T) ((zzkk) zznd.zzh(cls)).zza(zze.zzsc, (Object) null, (Object) null);
/* 58 */            if (t2 != null) {
/* 62 */                zzrs.put(cls, t2);
/* 65 */                return t2;
                    }
/* 66 */            f42.m3664t();
/* 51 */            return null;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 22 */            if (((zzkk) zza(zze.zzsc, (Object) null, (Object) null)).getClass().isInstance(obj)) {
/* 36 */                return zzmd.zzej().zzq(this).equals(this, (zzkk) obj);
                    }
/* 24 */            return false;
                }

                public int hashCode() {
/* 1 */             int i = this.zzne;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 14 */            int iHashCode = zzmd.zzej().zzq(this).hashCode(this);
/* 18 */            this.zzne = iHashCode;
/* 20 */            return iHashCode;
                }

                @Override // com.google.android.gms.internal.drive.zzls
                public final boolean isInitialized() {
/* 2 */             return zza(this, true);
                }

                public String toString() {
/* 5 */             return zzlt.zza(this, super.toString());
                }

                public abstract Object zza(int i, Object obj, Object obj2);

                @Override // com.google.android.gms.internal.drive.zzlq
                public final void zzb(zzjr zzjrVar) throws IOException {
/* 17 */            zzmd.zzej().zzf(getClass()).zza(this, zzjt.zza(zzjrVar));
                }

                @Override // com.google.android.gms.internal.drive.zzit
                public final int zzbm() {
/* 1 */             return this.zzrr;
                }

                public final void zzbp() {
/* 9 */             zzmd.zzej().zzq(this).zzd(this);
                }

                public final <MessageType extends zzkk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzcw() {
/* 8 */             return (BuilderType) zza(zze.zzsb, (Object) null, (Object) null);
                }

                @Override // com.google.android.gms.internal.drive.zzlq
                public final int zzcx() {
/* 4 */             if (this.zzrr == -1) {
/* 18 */                this.zzrr = zzmd.zzej().zzq(this).zzn(this);
                    }
/* 20 */            return this.zzrr;
                }

                @Override // com.google.android.gms.internal.drive.zzlq
                public final /* synthetic */ zzlr zzcy() {
/* 8 */             zza zzaVar = (zza) zza(zze.zzsb, (Object) null, (Object) null);
/* 10 */            zzaVar.zza(this);
/* 13 */            return zzaVar;
                }

                @Override // com.google.android.gms.internal.drive.zzlq
                public final /* synthetic */ zzlr zzcz() {
/* 8 */             return (zza) zza(zze.zzsb, (Object) null, (Object) null);
                }

                @Override // com.google.android.gms.internal.drive.zzls
                public final /* synthetic */ zzlq zzda() {
/* 8 */             return (zzkk) zza(zze.zzsc, (Object) null, (Object) null);
                }

                @Override // com.google.android.gms.internal.drive.zzit
                public final void zzo(int i) {
/* 1 */             this.zzrr = i;
                }

/* 11 */        public static abstract class zza<MessageType extends zzkk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zziu<MessageType, BuilderType> {
                    private final MessageType zzrt;
                    protected MessageType zzru;
                    private boolean zzrv = false;

                    public zza(MessageType messagetype) {
/* 4 */                 this.zzrt = messagetype;
/* 15 */                this.zzru = (MessageType) messagetype.zza(zze.zzsa, null, null);
                    }

                    private static void zza(MessageType messagetype, MessageType messagetype2) {
/* 9 */                 zzmd.zzej().zzq(messagetype).zzc(messagetype, messagetype2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.drive.zziu
                    public /* synthetic */ Object clone() throws CloneNotSupportedException {
/* 10 */                zza zzaVar = (zza) this.zzrt.zza(zze.zzsb, null, null);
/* 18 */                zzaVar.zza((zzkk) zzde());
/* 21 */                return zzaVar;
                    }

                    @Override // com.google.android.gms.internal.drive.zzls
                    public final boolean isInitialized() {
/* 4 */                 return zzkk.zza(this.zzru, false);
                    }

                    @Override // com.google.android.gms.internal.drive.zziu
                    /* JADX INFO: renamed from: zzbn */
                    public final /* synthetic */ zziu clone() {
/* 5 */                 return (zza) clone();
                    }

                    @Override // com.google.android.gms.internal.drive.zzls
                    public final /* synthetic */ zzlq zzda() {
/* 1 */                 return this.zzrt;
                    }

                    public final void zzdb() {
/* 3 */                 if (this.zzrv) {
/* 14 */                    MessageType messagetype = (MessageType) this.zzru.zza(zze.zzsa, null, null);
/* 18 */                    zza(messagetype, this.zzru);
/* 21 */                    this.zzru = messagetype;
/* 24 */                    this.zzrv = false;
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zzlr
                    /* JADX INFO: renamed from: zzdc, reason: merged with bridge method [inline-methods] */
                    public MessageType zzde() {
/* 1 */                 boolean z = this.zzrv;
/* 3 */                 MessageType messagetype = this.zzru;
/* 5 */                 if (z) {
/* 7 */                     return messagetype;
                        }
/* 8 */                 messagetype.zzbp();
/* 12 */                this.zzrv = true;
/* 14 */                return this.zzru;
                    }

                    @Override // com.google.android.gms.internal.drive.zzlr
                    /* JADX INFO: renamed from: zzdd, reason: merged with bridge method [inline-methods] */
                    public final MessageType zzdf() {
/* 5 */                 MessageType messagetype = (MessageType) zzde();
/* 11 */                if (messagetype.isInitialized()) {
/* 13 */                    return messagetype;
                        }
/* 19 */                throw new zzmw(messagetype);
                    }

                    @Override // com.google.android.gms.internal.drive.zziu
/* 12 */            public final BuilderType zza(MessageType messagetype) {
/* 13 */                zzdb();
/* 14 */                zza(this.zzru, messagetype);
                        return this;
                    }
                }

/* 84 */        public static <T extends zzkk<?, ?>> void zza(Class<T> cls, T t) {
/* 85 */            zzrs.put(cls, t);
                }

/* 85 */        public static Object zza(zzlq zzlqVar, String str, Object[] objArr) {
/* 86 */            return new zzme(zzlqVar, str, objArr);
                }

/* 86 */        public static Object zza(Method method, Object obj, Object... objArr) {
                    try {
/* 87 */                return method.invoke(obj, objArr);
                    } catch (IllegalAccessException e) {
/* 94 */                ds0.m3198o("Couldn't use Java reflection to implement protocol message reflection.", e);
                        return null;
                    } catch (InvocationTargetException e2) {
/* 88 */                Throwable cause = e2.getCause();
/* 89 */                if (!(cause instanceof RuntimeException)) {
/* 90 */                    if (!(cause instanceof Error)) {
/* 91 */                        ds0.m3198o("Unexpected exception thrown by generated accessor method.", cause);
                                return null;
                            }
/* 92 */                    throw ((Error) cause);
                        }
/* 93 */                throw ((RuntimeException) cause);
                    }
                }

/* 94 */        public static final <T extends zzkk<T, ?>> boolean zza(T t, boolean z) {
/* 97 */            byte bByteValue = ((Byte) t.zza(zze.zzrx, null, null)).byteValue();
                    if (bByteValue == 1) {
                        return true;
                    }
                    if (bByteValue == 0) {
                        return false;
                    }
/* 98 */            boolean zZzp = zzmd.zzej().zzq(t).zzp(t);
                    if (z) {
/* 100 */               t.zza(zze.zzry, zZzp ? t : null, null);
                    }
                    return zZzp;
                }

/* 100 */       public static <T extends zzkk<T, ?>> T zza(T t, byte[] bArr, zzjx zzjxVar) throws zzkq {
/* 102 */           T t2 = (T) zza(t, bArr, 0, bArr.length, zzjxVar);
/* 103 */           if (t2 == null || t2.isInitialized()) {
                        return t2;
                    }
/* 106 */           throw new zzkq(new zzmw(t2).getMessage()).zzg(t2);
                }
            }
