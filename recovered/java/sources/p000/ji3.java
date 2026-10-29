            package p000;

            import android.content.SharedPreferences;
            import com.google.android.gms.internal.measurement.zzhs;
            import java.io.Serializable;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 36 */    public final class ji3 {

                /* JADX INFO: renamed from: a */
                public long f12319a;

                /* JADX INFO: renamed from: b */
                public Object f12320b;

                /* JADX INFO: renamed from: c */
                public Serializable f12321c;

                /* JADX INFO: renamed from: d */
                public Serializable f12322d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ jk3 f12323e;

                public /* synthetic */ ji3(ki3 ki3Var, long j) {
/* 4 */             this.f12323e = ki3Var;
/* 8 */             kb1.m6058k("health_monitor");
/* 20 */            kb1.m6054g(j > 0);
/* 25 */            this.f12320b = "health_monitor:start";
/* 29 */            this.f12321c = "health_monitor:count";
/* 33 */            this.f12322d = "health_monitor:value";
/* 35 */            this.f12319a = j;
                }

                /* JADX WARN: Code duplicated, block: B:22:0x009d  */
                /* JADX WARN: Code duplicated, block: B:25:0x00d0 A[RETURN] */
                /* JADX INFO: renamed from: a */
                public boolean m5839a(long j, zzhs zzhsVar) {
                    int size;
/* 1 */             kb1.m6061n(zzhsVar);
/* 8 */             if (((ArrayList) this.f12322d) == null) {
/* 15 */                this.f12322d = new ArrayList();
                    }
/* 21 */            if (((ArrayList) this.f12321c) == null) {
/* 28 */                this.f12321c = new ArrayList();
                    }
/* 39 */            if (((ArrayList) this.f12322d).isEmpty() || ((((zzhs) ((ArrayList) this.f12322d).get(0)).zzf() / 1000) / 60) / 60 == ((zzhsVar.zzf() / 1000) / 60) / 60) {
/* 80 */                long jZzcn = this.f12319a + ((long) zzhsVar.zzcn());
/* 83 */                mp3 mp3Var = (mp3) this.f12323e;
/* 96 */                if (!mp3Var.m6753d0().m7406J(null, vg3.f18129e1)) {
/* 133 */                   mp3Var.m6753d0();
/* 155 */                   if (jZzcn < Math.max(0, ((Integer) vg3.f18142j.m9011a(null)).intValue())) {
/* 158 */                       this.f12319a = jZzcn;
/* 164 */                       ((ArrayList) this.f12322d).add(zzhsVar);
/* 175 */                       ((ArrayList) this.f12321c).add(Long.valueOf(j));
/* 182 */                       size = ((ArrayList) this.f12322d).size();
/* 186 */                       mp3Var.m6753d0();
/* 206 */                       if (size < Math.max(1, ((Integer) vg3.f18145k.m9011a(null)).intValue())) {
/* 201 */                           return true;
                                }
                            }
                        } else if (((ArrayList) this.f12322d).isEmpty()) {
/* 158 */                   this.f12319a = jZzcn;
/* 164 */                   ((ArrayList) this.f12322d).add(zzhsVar);
/* 175 */                   ((ArrayList) this.f12321c).add(Long.valueOf(j));
/* 182 */                   size = ((ArrayList) this.f12322d).size();
/* 186 */                   mp3Var.m6753d0();
/* 206 */                   if (size < Math.max(1, ((Integer) vg3.f18145k.m9011a(null)).intValue())) {
/* 201 */                       return true;
                            }
                        } else {
/* 108 */                   mp3Var.m6753d0();
/* 130 */                   if (jZzcn < Math.max(0, ((Integer) vg3.f18142j.m9011a(null)).intValue())) {
/* 158 */                       this.f12319a = jZzcn;
/* 164 */                       ((ArrayList) this.f12322d).add(zzhsVar);
/* 175 */                       ((ArrayList) this.f12321c).add(Long.valueOf(j));
/* 182 */                       size = ((ArrayList) this.f12322d).size();
/* 186 */                       mp3Var.m6753d0();
/* 206 */                       if (size < Math.max(1, ((Integer) vg3.f18145k.m9011a(null)).intValue())) {
/* 201 */                           return true;
                                }
                            }
                        }
                    }
/* 38 */            return false;
                }

                /* JADX INFO: renamed from: b */
                public void m5840b() {
/* 3 */             ki3 ki3Var = (ki3) this.f12323e;
/* 5 */             ki3Var.mo1375y();
/* 14 */            ((ij3) ki3Var.f16749a).f9640V.getClass();
/* 17 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 25 */            SharedPreferences.Editor editorEdit = ki3Var.m6113D().edit();
/* 33 */            editorEdit.remove((String) this.f12321c);
/* 40 */            editorEdit.remove((String) this.f12322d);
/* 47 */            editorEdit.putLong((String) this.f12320b, jCurrentTimeMillis);
/* 50 */            editorEdit.apply();
                }

/* 37 */        public /* synthetic */ ji3(mp3 mp3Var) {
                    this.f12323e = mp3Var;
                }
            }
