            package p000;

            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            import com.usercentrics.sdk.p009v2.ruleset.data.DefaultGeoRule;
            import com.usercentrics.sdk.p009v2.ruleset.data.GeoRule;
            import com.usercentrics.sdk.p009v2.ruleset.data.RuleSet;
            import com.usercentrics.sdk.p009v2.ruleset.data.SessionGeoRule;
            import java.io.Serializable;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m52 {

                /* JADX INFO: renamed from: a */
                public final k51 f13566a;

                /* JADX INFO: renamed from: b */
                public final p91 f13567b;

                public m52(k51 k51Var, p91 p91Var) {
/* 1 */             p91Var.getClass();
/* 7 */             this.f13566a = k51Var;
/* 9 */             this.f13567b = p91Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m6608a(String str, d10 d10Var) {
                    l52 l52Var;
                    m52 m52Var;
                    boolean z;
                    String str2;
                    boolean z2;
/* 3 */             if (d10Var instanceof l52) {
/* 6 */                 l52Var = (l52) d10Var;
/* 8 */                 int i = l52Var.f13118e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    l52Var.f13118e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    l52Var = new l52(this, d10Var);
                        }
                    } else {
/* 22 */                l52Var = new l52(this, d10Var);
                    }
/* 25 */            Object obj = l52Var.f13116c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = l52Var.f13118e;
/* 31 */            GeoRule geoRule = null;
/* 33 */            if (i2 == 0) {
/* 51 */                pg3.m7417A(obj);
/* 56 */                boolean zM7371a = this.f13567b.m7371a();
/* 62 */                l52Var.f13114a = this;
/* 64 */                l52Var.f13115b = zM7371a;
/* 66 */                l52Var.f13118e = 1;
/* 70 */                Serializable serializableM5994j = this.f13566a.m5994j(str, !zM7371a, l52Var);
/* 74 */                if (serializableM5994j == z10Var) {
/* 76 */                    return z10Var;
                        }
/* 78 */                m52Var = this;
/* 79 */                z = zM7371a;
/* 80 */                obj = serializableM5994j;
                    } else {
/* 35 */                if (i2 != 1) {
/* 47 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                z = l52Var.f13115b;
/* 39 */                m52Var = l52Var.f13114a;
/* 41 */                pg3.m7417A(obj);
                    }
/* 81 */            Pair pair = (Pair) obj;
/* 85 */            UsercentricsLocation usercentricsLocation = (UsercentricsLocation) pair.f12909b;
/* 91 */            if (usercentricsLocation.m2818a()) {
/* 93 */                if (!z) {
/* 107 */                   throw new vz2("Unable to initialise because location is not available; check permission or connectivity.");
                        }
/* 97 */                usercentricsLocation = m52Var.f13567b.f15029b;
                    }
/* 110 */           RuleSet ruleSet = (RuleSet) pair.f12908a;
/* 112 */           m52Var.getClass();
/* 115 */           List<GeoRule> list = ruleSet.f6366a;
/* 117 */           DefaultGeoRule defaultGeoRule = ruleSet.f6367b;
/* 123 */           GeoRule geoRule2 = null;
/* 128 */           for (GeoRule geoRule3 : list) {
/* 144 */               if (geoRule3.f6364b.contains(usercentricsLocation.f6359b)) {
/* 146 */                   geoRule = geoRule3;
                            break;
                        }
/* 156 */               if (geoRule3.f6364b.contains(usercentricsLocation.f6358a)) {
/* 158 */                   geoRule2 = geoRule3;
                        }
                    }
/* 160 */           if (geoRule != null) {
/* 163 */               geoRule2 = geoRule;
                    }
/* 164 */           if (geoRule2 == null) {
/* 166 */               z2 = defaultGeoRule.f6361b;
/* 168 */               str2 = defaultGeoRule.f6360a;
                    } else {
/* 171 */               str2 = geoRule2.f6363a;
/* 173 */               z2 = false;
                    }
/* 178 */           String[] strArr = {defaultGeoRule.f6360a};
/* 188 */           HashSet hashSet = new HashSet(nc1.m6962c(1));
/* 191 */           C2103qd.m7777l(strArr, hashSet);
/* 196 */           Iterator it = ruleSet.f6366a.iterator();
/* 204 */           while (it.hasNext()) {
/* 214 */               hashSet.add(((GeoRule) it.next()).f6363a);
                    }
/* 218 */           return new SessionGeoRule(str2, z2, usercentricsLocation, hashSet);
                }
            }
