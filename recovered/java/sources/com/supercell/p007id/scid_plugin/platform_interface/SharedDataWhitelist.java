            package com.supercell.p007id.scid_plugin.platform_interface;

            import android.content.Context;
            import android.util.Log;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.EncryptedStorage;
            import com.supercell.p007id.scid_plugin.PromiseUtilKt;
            import com.supercell.p007id.scid_plugin.SingletonHolder;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.AbstractC1844e;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            import p000.C0197bz;
            import p000.C0899f;
            import p000.C1869kx;
            import p000.C1929mj;
            import p000.C2107qh;
            import p000.C2223tm;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.c60;
            import p000.e70;
            import p000.f42;
            import p000.i13;
            import p000.k50;
            import p000.kd2;
            import p000.ki0;
            import p000.ld2;
            import p000.li0;
            import p000.oc1;
            import p000.od0;
            import p000.pg3;
            import p000.pi2;
            import p000.qj3;
            import p000.u92;
            import p000.y00;
            import p000.y10;
            import p000.z10;
            import p000.z80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 52\u00020\u0001:\u00015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fRt\u0010\b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060 j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006`!2.\u0010\"\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060 j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006`!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010+\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001f\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b/\u00100R-\u00104\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0007020 j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000702`!8F¢\u0006\u0006\u001a\u0004\b3\u0010%¨\u00066"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, SharedDataWhitelist.WHITELIST_STORAGE_KEY, HttpUrl.FRAGMENT_ENCODE_SET, "fromRemote", HttpUrl.FRAGMENT_ENCODE_SET, "completeWhitelist", "(Ljava/util/Map;Z)V", "loadFromPersistentStorage", "(Lc10;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "json", "saveToPersistentStorage", "(Lorg/json/JSONObject;Lc10;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "timeoutMs", "awaitLoaded", "(JLc10;)Ljava/lang/Object;", "update", "(Ljava/util/Map;)V", "Lcom/supercell/id/scid_plugin/EncryptedStorage;", "encryptedStorage", "Lcom/supercell/id/scid_plugin/EncryptedStorage;", "Ly10;", "scope", "Ly10;", "Le70;", "Lcom/supercell/id/scid_plugin/Promise;", FirebaseAnalytics.Param.VALUE, "Le70;", "getWhitelist$scid_plugin_release", "()Le70;", "Ljx;", "loadDeferred", "Ljx;", "cached", "Ljava/util/Map;", "generation", "J", "getGeneration", "()J", "getWhitelistSync", "()Ljava/util/Map;", "whitelistSync", HttpUrl.FRAGMENT_ENCODE_SET, "getWhitelistPackages", "whitelistPackages", "Companion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 4 */     public final class SharedDataWhitelist {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final Map<String, String> HARDCODED_WHITELIST = oc1.m7131e(new Pair("com.supercell.brawlstars", "73:1A:29:E8:0B:7C:A8:9C:7E:9B:39:D3:81:82:1E:E8:DC:CD:1B:04:56:78:2F:78:86:50:94:5E:7D:60:D8:D3"), new Pair("com.supercell.boombeach", "4E:06:BD:0A:53:1F:FE:9E:17:53:C5:23:8E:50:EA:B8:5B:02:F1:78:14:C0:FA:25:65:38:2C:C0:23:D1:57:02"), new Pair("com.supercell.clashofclans", "9E:A1:46:D9:35:C0:BE:2E:4B:57:63:96:E6:A5:E1:DE:6D:CB:69:A7:1A:F4:E4:17:B0:A5:B8:FE:8E:0D:4D:9C"), new Pair("com.supercell.clashroyale", "59:EA:9D:ED:5F:79:29:8A:50:10:3D:25:44:97:CA:71:CA:80:33:24:92:C7:49:37:50:44:87:9B:8F:09:93:57"), new Pair("com.supercell.hayday", "22:65:E9:01:9D:3E:0A:FC:1A:05:53:1D:14:F4:FF:53:46:A3:23:F7:ED:D1:F7:22:16:71:B7:64:C0:CC:1B:AB"), new Pair("com.supercell.squad", "EE:FD:54:C0:3C:80:52:0D:A6:0F:AA:D9:A5:3C:A0:41:F8:09:2F:8F:6A:B2:01:5A:A6:A0:55:48:DC:33:EC:F6"), new Pair("com.supercell.moco", "E0:BD:90:B0:7F:E7:92:98:32:CF:D9:74:0C:13:97:9A:D1:39:7E:DC:65:3A:53:14:C9:E8:05:4F:16:28:31:51"));
                private static final String TAG = "SharedDataWhitelist";
                private static final String WHITELIST_STORAGE_KEY = "whitelist";
                private static final String WHITELIST_STORAGE_NAME = "scid_whitelist";
                private volatile Map<String, String> cached;
                private final EncryptedStorage encryptedStorage;
                private volatile long generation;
                private final InterfaceC1809jx loadDeferred;
                private final y10 scope;
                private e70 whitelist;

                private SharedDataWhitelist(Context context) {
                    EncryptedStorage encryptedStorage;
/* 4 */             c10 c10Var = null;
                    try {
/* 7 */                 Context applicationContext = context.getApplicationContext();
/* 11 */                applicationContext.getClass();
/* 16 */                encryptedStorage = new EncryptedStorage(applicationContext, WHITELIST_STORAGE_NAME);
                    } catch (Exception e) {
/* 37 */                AbstractC1245n0.m4877e(TAG, "Failed to create encrypted storage " + e, e);
/* 40 */                encryptedStorage = null;
                    }
/* 41 */            this.encryptedStorage = encryptedStorage;
/* 54 */            y00 y00VarM5964a = k50.m5964a(AbstractC1844e.m6215c(new pi2(), z80.f19977c));
/* 58 */            this.scope = y00VarM5964a;
/* 65 */            this.whitelist = new C1869kx();
/* 72 */            this.loadDeferred = new C1869kx();
/* 81 */            i13.m4443w(y00VarM5964a, null, new kd2(this, c10Var, 0), 3);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final List _get_whitelistPackages_$lambda$0(Map map) {
/* 1 */             map.getClass();
/* 8 */             return CollectionsKt.m6192K(map.keySet());
                }

                public static /* synthetic */ Object awaitLoaded$default(SharedDataWhitelist sharedDataWhitelist, long j, c10 c10Var, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 j = 3000;
                    }
/* 7 */             return sharedDataWhitelist.awaitLoaded(j, c10Var);
                }

                private final void completeWhitelist(Map<String, String> whitelist, boolean fromRemote) {
                    synchronized (this) {
/* 2 */                 if (fromRemote) {
                            try {
/* 4 */                         this.cached = whitelist;
                            } catch (Throwable th) {
/* 53 */                        throw th;
                            }
                        }
/* 14 */                this.generation++;
/* 16 */                e70 e70Var = this.whitelist;
/* 25 */                InterfaceC1809jx interfaceC1809jx = e70Var instanceof InterfaceC1809jx ? (InterfaceC1809jx) e70Var : null;
/* 26 */                if ((interfaceC1809jx == null || !((C1869kx) interfaceC1809jx).m10238D(whitelist)) && fromRemote) {
/* 42 */                    C1869kx c1869kx = new C1869kx();
/* 45 */                    c1869kx.m10238D(whitelist);
/* 48 */                    this.whitelist = c1869kx;
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v9 */
                public final Object loadFromPersistentStorage(c10 c10Var) {
                    ld2 ld2Var;
                    Map<String, String> map;
/* 3 */             if (c10Var instanceof ld2) {
/* 6 */                 ld2Var = (ld2) c10Var;
/* 8 */                 int i = ld2Var.f13200d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ld2Var.f13200d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ld2Var = new ld2(this, c10Var);
                        }
                    } else {
/* 22 */                ld2Var = new ld2(this, c10Var);
                    }
/* 25 */            Object objM4422D = ld2Var.f13198b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = ld2Var.f13200d;
/* 31 */            boolean z = false;
                    try {
/* 33 */                if (i2 == 0) {
/* 52 */                    pg3.m7417A(objM4422D);
/* 55 */                    c60 c60Var = z80.f19977c;
/* 60 */                    C1929mj c1929mj = new C1929mj(this, z ? 1 : 0, 6);
/* 63 */                    ld2Var.f13197a = this;
/* 65 */                    ld2Var.f13200d = 1;
/* 67 */                    objM4422D = i13.m4422D(c60Var, c1929mj, ld2Var);
                            this = this;
/* 71 */                    if (objM4422D == z10Var) {
/* 73 */                        return z10Var;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 48 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    SharedDataWhitelist sharedDataWhitelist = ld2Var.f13197a;
/* 39 */                    pg3.m7417A(objM4422D);
                            this = sharedDataWhitelist;
                        }
/* 74 */                JSONObject jSONObject = (JSONObject) objM4422D;
/* 76 */                if (jSONObject != null) {
/* 78 */                    Iterator<String> itKeys = jSONObject.keys();
/* 82 */                    itKeys.getClass();
/* 109 */                   li0 li0Var = new li0(new li0(u92.m8981a(itKeys), new C0899f(jSONObject, 4)), new C0197bz(19));
/* 114 */                   LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 119 */                   ki0 ki0Var = new ki0(li0Var);
/* 126 */                   while (ki0Var.hasNext()) {
/* 132 */                       Pair pair = (Pair) ki0Var.next();
/* 138 */                       linkedHashMap.put(pair.f12908a, pair.f12909b);
                            }
/* 142 */                   int size = linkedHashMap.size();
/* 146 */                   if (size == 0) {
/* 181 */                       od0 od0Var = od0.f14715a;
/* 183 */                       od0Var.getClass();
                                map = od0Var;
                            } else if (size != 1) {
                                map = linkedHashMap;
                            } else {
/* 163 */                       Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
/* 173 */                       Map<String, String> mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
/* 177 */                       mapSingletonMap.getClass();
                                map = mapSingletonMap;
                            }
                            synchronized (this) {
                                try {
/* 189 */                           if (this.cached == null) {
/* 191 */                               this.cached = map;
/* 194 */                               this.completeWhitelist(map, false);
                                    } else {
/* 210 */                               new Integer(Log.d(TAG, "Skipping persisted whitelist because remote already applied"));
                                    }
                                } catch (Throwable th) {
/* 216 */                           throw th;
                                }
                            }
                        } else {
                            synchronized (this) {
                                try {
/* 224 */                           if (!this.whitelist.isCompleted()) {
/* 226 */                               e70 e70Var = this.whitelist;
/* 233 */                               InterfaceC1809jx interfaceC1809jx = e70Var instanceof InterfaceC1809jx ? (InterfaceC1809jx) e70Var : null;
/* 238 */                               if (interfaceC1809jx != null) {
/* 244 */                                   ((C1869kx) interfaceC1809jx).m10238D(HARDCODED_WHITELIST);
                                        }
                                    }
                                } catch (Throwable th2) {
/* 259 */                           throw th2;
                                }
                            }
                        }
/* 248 */               InterfaceC1809jx interfaceC1809jx2 = this.loadDeferred;
/* 250 */               Unit unit = Unit.f12910a;
/* 254 */               ((C1869kx) interfaceC1809jx2).m10238D(unit);
/* 257 */               return unit;
                    } catch (Throwable th3) {
/* 266 */               ((C1869kx) this.loadDeferred).m10238D(Unit.f12910a);
/* 269 */               throw th3;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Pair loadFromPersistentStorage$lambda$3(JSONObject jSONObject, String str) {
/* 1 */             str.getClass();
/* 4 */             Object objOpt = jSONObject.opt(str);
/* 9 */             if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
/* 19 */                objOpt = null;
                    }
/* 29 */            String str2 = (objOpt == null || !(objOpt instanceof String)) ? null : (String) objOpt;
/* 30 */            if (str2 != null) {
/* 34 */                return new Pair(str, str2);
                    }
/* 8 */             return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object saveToPersistentStorage(JSONObject jSONObject, c10 c10Var) {
/* 11 */            return i13.m4422D(z80.f19977c, new C2107qh(jSONObject, this, null, 10), c10Var);
                }

                public final Object awaitLoaded(long j, c10 c10Var) {
/* 8 */             return qj3.m7885R(j, new kd2(this, null, 1), c10Var);
                }

                public final long getGeneration() {
/* 1 */             return this.generation;
                }

                /* JADX INFO: renamed from: getWhitelist$scid_plugin_release, reason: from getter */
                public final e70 getWhitelist() {
/* 1 */             return this.whitelist;
                }

                public final e70 getWhitelistPackages() {
/* 10 */            return PromiseUtilKt.then(this.whitelist, new C0197bz(21));
                }

                public final Map<String, String> getWhitelistSync() {
/* 1 */             return this.cached;
                }

                public final void update(Map<String, String> whitelist) {
/* 1 */             whitelist.getClass();
/* 6 */             JSONObject jSONObject = new JSONObject(whitelist);
/* 10 */            completeWhitelist(whitelist, true);
/* 24 */            i13.m4443w(this.scope, null, new C2223tm(this, jSONObject, null, 8), 3);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist$Companion;", "Lcom/supercell/id/scid_plugin/SingletonHolder;", "Lcom/supercell/id/scid_plugin/platform_interface/SharedDataWhitelist;", "Landroid/content/Context;", "<init>", "()V", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "WHITELIST_STORAGE_NAME", "WHITELIST_STORAGE_KEY", "HARDCODED_WHITELIST", HttpUrl.FRAGMENT_ENCODE_SET, "getHardcodedHash", "packageName", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 5 */         public static final class Companion extends SingletonHolder<SharedDataWhitelist, Context> {
                    private Companion() {
/* 3 */                 super(C0786b.f5706a);
                    }

                    public final String getHardcodedHash(String packageName) {
/* 1 */                 packageName.getClass();
/* 12 */                return (String) SharedDataWhitelist.HARDCODED_WHITELIST.get(packageName);
                    }

/* 6 */             public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */                 this();
                    }
                }

/* 84 */        public /* synthetic */ SharedDataWhitelist(Context context, DefaultConstructorMarker defaultConstructorMarker) {
/* 85 */            this(context);
                }
            }
