            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class if1 {

                /* JADX INFO: renamed from: a */
                public Double f9565a;

                /* JADX INFO: renamed from: b */
                public Double f9566b;

                /* JADX INFO: renamed from: c */
                public Boolean f9567c;

                /* JADX INFO: renamed from: d */
                public Boolean f9568d;

                /* JADX INFO: renamed from: e */
                public Boolean f9569e;

                /* JADX INFO: renamed from: f */
                public String f9570f;

                /* JADX INFO: renamed from: g */
                public Boolean f9571g;

                /* JADX INFO: renamed from: h */
                public wf1 f9572h;

                /* JADX INFO: renamed from: i */
                public Boolean f9573i;

                /* JADX INFO: renamed from: j */
                public Boolean f9574j;

                /* JADX INFO: renamed from: k */
                public Boolean f9575k;

                /* JADX INFO: renamed from: l */
                public String f9576l;

                /* JADX INFO: renamed from: m */
                public Double f9577m;

                /* JADX INFO: renamed from: n */
                public String f9578n;

                /* JADX INFO: renamed from: o */
                public Integer f9579o;

                public if1(Double d, Double d2, Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, wf1 wf1Var, Boolean bool5, Boolean bool6, Boolean bool7, String str2, Double d3, String str3, Integer num) {
/* 4 */             this.f9565a = d;
/* 6 */             this.f9566b = d2;
/* 8 */             this.f9567c = bool;
/* 10 */            this.f9568d = bool2;
/* 12 */            this.f9569e = bool3;
/* 14 */            this.f9570f = str;
/* 16 */            this.f9571g = bool4;
/* 18 */            this.f9572h = wf1Var;
/* 20 */            this.f9573i = bool5;
/* 22 */            this.f9574j = bool6;
/* 24 */            this.f9575k = bool7;
/* 26 */            this.f9576l = str2;
/* 28 */            this.f9577m = d3;
/* 30 */            this.f9578n = str3;
/* 32 */            this.f9579o = num;
                }

                /* JADX INFO: renamed from: a */
                public final Integer m4521a() {
/* 1 */             Double d = this.f9566b;
/* 3 */             if (d == null) {
/* 30 */                return null;
                    }
/* 5 */             double dDoubleValue = d.doubleValue();
/* 9 */             Double d2 = this.f9565a;
/* 25 */            return Integer.valueOf((int) (((d2 != null ? d2.doubleValue() : 0.0d) / dDoubleValue) * 100.0d));
                }

                /* JADX INFO: renamed from: b */
                public final void m4522b(if1 if1Var) {
/* 1 */             if1Var.getClass();
/* 4 */             Double d = if1Var.f9565a;
/* 6 */             if (d != null) {
/* 16 */                this.f9565a = Double.valueOf(d.doubleValue());
                    }
/* 18 */            Double d2 = if1Var.f9566b;
/* 20 */            if (d2 != null) {
/* 30 */                this.f9566b = Double.valueOf(d2.doubleValue());
                    }
/* 32 */            Boolean bool = if1Var.f9567c;
/* 34 */            if (bool != null) {
/* 36 */                this.f9567c = bool;
                    }
/* 38 */            Boolean bool2 = if1Var.f9568d;
/* 40 */            if (bool2 != null) {
/* 42 */                this.f9568d = bool2;
                    }
/* 44 */            Boolean bool3 = if1Var.f9569e;
/* 46 */            if (bool3 != null) {
/* 48 */                this.f9569e = bool3;
                    }
/* 50 */            String str = if1Var.f9570f;
/* 52 */            if (str != null) {
/* 54 */                this.f9570f = str;
                    }
/* 56 */            Boolean bool4 = if1Var.f9571g;
/* 58 */            if (bool4 != null) {
/* 60 */                this.f9571g = bool4;
                    }
/* 62 */            wf1 wf1Var = if1Var.f9572h;
/* 64 */            if (wf1Var != null) {
/* 66 */                this.f9572h = wf1Var;
                    }
/* 68 */            Boolean bool5 = if1Var.f9573i;
/* 70 */            if (bool5 != null) {
/* 72 */                this.f9573i = bool5;
                    }
/* 74 */            Boolean bool6 = if1Var.f9574j;
/* 76 */            if (bool6 != null) {
/* 78 */                this.f9574j = bool6;
                    }
/* 80 */            Boolean bool7 = if1Var.f9575k;
/* 82 */            if (bool7 != null) {
/* 84 */                this.f9575k = bool7;
                    }
/* 86 */            String str2 = if1Var.f9576l;
/* 88 */            if (str2 != null) {
/* 90 */                this.f9576l = str2;
                    }
/* 92 */            Double d3 = if1Var.f9577m;
/* 94 */            if (d3 != null) {
/* 104 */               this.f9577m = Double.valueOf(d3.doubleValue());
                    }
/* 106 */           String str3 = if1Var.f9578n;
/* 108 */           if (str3 != null) {
/* 110 */               this.f9578n = str3;
                    }
/* 112 */           Integer num = if1Var.f9579o;
/* 114 */           if (num != null) {
/* 124 */               this.f9579o = Integer.valueOf(num.intValue());
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof if1)) {
/* 7 */                 return false;
                    }
/* 11 */            if1 if1Var = (if1) obj;
                    return Intrinsics.m6216a(this.f9565a, if1Var.f9565a) && Intrinsics.m6216a(this.f9566b, if1Var.f9566b) && Intrinsics.m6216a(this.f9567c, if1Var.f9567c) && Intrinsics.m6216a(this.f9568d, if1Var.f9568d) && Intrinsics.m6216a(this.f9569e, if1Var.f9569e) && Intrinsics.m6216a(this.f9570f, if1Var.f9570f) && Intrinsics.m6216a(this.f9571g, if1Var.f9571g) && this.f9572h == if1Var.f9572h && Intrinsics.m6216a(this.f9573i, if1Var.f9573i) && Intrinsics.m6216a(this.f9574j, if1Var.f9574j) && Intrinsics.m6216a(this.f9575k, if1Var.f9575k) && Intrinsics.m6216a(this.f9576l, if1Var.f9576l) && Intrinsics.m6216a(this.f9577m, if1Var.f9577m) && Intrinsics.m6216a(this.f9578n, if1Var.f9578n) && Intrinsics.m6216a(this.f9579o, if1Var.f9579o);
                }

                public final int hashCode() {
/* 1 */             Double d = this.f9565a;
/* 12 */            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
/* 14 */            Double d2 = this.f9566b;
/* 25 */            int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
/* 27 */            Boolean bool = this.f9567c;
/* 38 */            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
/* 40 */            Boolean bool2 = this.f9568d;
/* 51 */            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 53 */            Boolean bool3 = this.f9569e;
/* 64 */            int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
/* 66 */            String str = this.f9570f;
/* 77 */            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
/* 79 */            Boolean bool4 = this.f9571g;
/* 90 */            int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
/* 92 */            wf1 wf1Var = this.f9572h;
/* 103 */           int iHashCode8 = (iHashCode7 + (wf1Var == null ? 0 : wf1Var.hashCode())) * 31;
/* 105 */           Boolean bool5 = this.f9573i;
/* 116 */           int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
/* 118 */           Boolean bool6 = this.f9574j;
/* 129 */           int iHashCode10 = (iHashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
/* 131 */           Boolean bool7 = this.f9575k;
/* 142 */           int iHashCode11 = (iHashCode10 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
/* 144 */           String str2 = this.f9576l;
/* 155 */           int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 157 */           Double d3 = this.f9577m;
/* 168 */           int iHashCode13 = (iHashCode12 + (d3 == null ? 0 : d3.hashCode())) * 31;
/* 170 */           String str3 = this.f9578n;
/* 181 */           int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 183 */           Integer num = this.f9579o;
/* 192 */           return iHashCode14 + (num != null ? num.hashCode() : 0);
                }

                public final String toString() {
/* 158 */           return "MediaPlayerEntity(currentTime=" + this.f9565a + ", duration=" + this.f9566b + ", ended=" + this.f9567c + ", fullscreen=" + this.f9568d + ", livestream=" + this.f9569e + ", label=" + this.f9570f + ", loop=" + this.f9571g + ", mediaType=" + this.f9572h + ", muted=" + this.f9573i + ", paused=" + this.f9574j + ", pictureInPicture=" + this.f9575k + ", playerType=" + this.f9576l + ", playbackRate=" + this.f9577m + ", quality=" + this.f9578n + ", volume=" + this.f9579o + ')';
                }
            }
