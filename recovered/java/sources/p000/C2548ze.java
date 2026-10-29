            package p000;
            
            /* JADX INFO: renamed from: ze */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2548ze extends AbstractC2525z7 {

                /* JADX INFO: renamed from: a */
                public final Integer f20109a;

                /* JADX INFO: renamed from: b */
                public final String f20110b;

                /* JADX INFO: renamed from: c */
                public final String f20111c;

                /* JADX INFO: renamed from: d */
                public final String f20112d;

                /* JADX INFO: renamed from: e */
                public final String f20113e;

                /* JADX INFO: renamed from: f */
                public final String f20114f;

                /* JADX INFO: renamed from: g */
                public final String f20115g;

                /* JADX INFO: renamed from: h */
                public final String f20116h;

                /* JADX INFO: renamed from: i */
                public final String f20117i;

                /* JADX INFO: renamed from: j */
                public final String f20118j;

                /* JADX INFO: renamed from: k */
                public final String f20119k;

                /* JADX INFO: renamed from: l */
                public final String f20120l;

                public C2548ze(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
/* 4 */             this.f20109a = num;
/* 6 */             this.f20110b = str;
/* 8 */             this.f20111c = str2;
/* 10 */            this.f20112d = str3;
/* 12 */            this.f20113e = str4;
/* 14 */            this.f20114f = str5;
/* 16 */            this.f20115g = str6;
/* 18 */            this.f20116h = str7;
/* 20 */            this.f20117i = str8;
/* 22 */            this.f20118j = str9;
/* 24 */            this.f20119k = str10;
/* 26 */            this.f20120l = str11;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 166 */               return true;
                    }
/* 7 */             if (!(obj instanceof AbstractC2525z7)) {
/* 168 */               return false;
                    }
/* 9 */             AbstractC2525z7 abstractC2525z7 = (AbstractC2525z7) obj;
/* 22 */            if (!this.f20109a.equals(((C2548ze) abstractC2525z7).f20109a)) {
/* 168 */               return false;
                    }
/* 35 */            if (!this.f20110b.equals(((C2548ze) abstractC2525z7).f20110b)) {
/* 168 */               return false;
                    }
/* 48 */            if (!this.f20111c.equals(((C2548ze) abstractC2525z7).f20111c)) {
/* 168 */               return false;
                    }
/* 61 */            if (!this.f20112d.equals(((C2548ze) abstractC2525z7).f20112d)) {
/* 168 */               return false;
                    }
/* 74 */            if (!this.f20113e.equals(((C2548ze) abstractC2525z7).f20113e)) {
/* 168 */               return false;
                    }
/* 87 */            if (!this.f20114f.equals(((C2548ze) abstractC2525z7).f20114f)) {
/* 168 */               return false;
                    }
/* 100 */           if (!this.f20115g.equals(((C2548ze) abstractC2525z7).f20115g)) {
/* 168 */               return false;
                    }
/* 113 */           if (!this.f20116h.equals(((C2548ze) abstractC2525z7).f20116h)) {
/* 168 */               return false;
                    }
/* 126 */           if (!this.f20117i.equals(((C2548ze) abstractC2525z7).f20117i)) {
/* 168 */               return false;
                    }
/* 139 */           if (!this.f20118j.equals(((C2548ze) abstractC2525z7).f20118j)) {
/* 168 */               return false;
                    }
/* 152 */           if (this.f20119k.equals(((C2548ze) abstractC2525z7).f20119k)) {
                        return this.f20120l.equals(((C2548ze) abstractC2525z7).f20120l);
                    }
/* 168 */           return false;
                }

                public final int hashCode() {
/* 98 */            return this.f20120l.hashCode() ^ ((((((((((((((((((((((this.f20109a.hashCode() ^ 1000003) * 1000003) ^ this.f20110b.hashCode()) * 1000003) ^ this.f20111c.hashCode()) * 1000003) ^ this.f20112d.hashCode()) * 1000003) ^ this.f20113e.hashCode()) * 1000003) ^ this.f20114f.hashCode()) * 1000003) ^ this.f20115g.hashCode()) * 1000003) ^ this.f20116h.hashCode()) * 1000003) ^ this.f20117i.hashCode()) * 1000003) ^ this.f20118j.hashCode()) * 1000003) ^ this.f20119k.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
/* 10 */            sb.append(this.f20109a);
/* 15 */            sb.append(", model=");
/* 20 */            sb.append(this.f20110b);
/* 25 */            sb.append(", hardware=");
/* 30 */            sb.append(this.f20111c);
/* 35 */            sb.append(", device=");
/* 40 */            sb.append(this.f20112d);
/* 45 */            sb.append(", product=");
/* 50 */            sb.append(this.f20113e);
/* 55 */            sb.append(", osBuild=");
/* 60 */            sb.append(this.f20114f);
/* 65 */            sb.append(", manufacturer=");
/* 70 */            sb.append(this.f20115g);
/* 75 */            sb.append(", fingerprint=");
/* 80 */            sb.append(this.f20116h);
/* 85 */            sb.append(", locale=");
/* 90 */            sb.append(this.f20117i);
/* 95 */            sb.append(", country=");
/* 100 */           sb.append(this.f20118j);
/* 105 */           sb.append(", mccMnc=");
/* 110 */           sb.append(this.f20119k);
/* 115 */           sb.append(", applicationBuild=");
/* 122 */           return fm0.m3789o(sb, this.f20120l, "}");
                }
            }
