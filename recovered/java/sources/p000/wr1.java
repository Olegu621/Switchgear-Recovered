            package p000;

            import android.app.Person;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Icon;
            import androidx.core.graphics.drawable.IconCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wr1 {
                /* JADX INFO: renamed from: a */
                public static xr1 m9608a(Person person) {
                    IconCompat iconCompatM4017a;
/* 1 */             CharSequence name = person.getName();
/* 9 */             if (person.getIcon() != null) {
/* 11 */                Icon icon = person.getIcon();
/* 15 */                PorterDuff.Mode mode = IconCompat.f1245k;
/* 17 */                iconCompatM4017a = gv0.m4017a(icon);
                    } else {
/* 22 */                iconCompatM4017a = null;
                    }
/* 23 */            String uri = person.getUri();
/* 27 */            String key = person.getKey();
/* 31 */            boolean zIsBot = person.isBot();
/* 35 */            boolean zIsImportant = person.isImportant();
/* 41 */            xr1 xr1Var = new xr1();
/* 44 */            xr1Var.f19333a = name;
/* 46 */            xr1Var.f19334b = iconCompatM4017a;
/* 48 */            xr1Var.f19335c = uri;
/* 50 */            xr1Var.f19336d = key;
/* 52 */            xr1Var.f19337e = zIsBot;
/* 54 */            xr1Var.f19338f = zIsImportant;
/* 56 */            return xr1Var;
                }

                /* JADX INFO: renamed from: b */
                public static Person m9609b(xr1 xr1Var) {
/* 8 */             Person.Builder name = new Person.Builder().setName(xr1Var.f19333a);
/* 12 */            IconCompat iconCompat = xr1Var.f19334b;
/* 14 */            Icon iconM4023g = null;
/* 15 */            if (iconCompat != null) {
/* 17 */                iconCompat.getClass();
/* 20 */                iconM4023g = gv0.m4023g(iconCompat, null);
                    }
/* 52 */            return name.setIcon(iconM4023g).setUri(xr1Var.f19335c).setKey(xr1Var.f19336d).setBot(xr1Var.f19337e).setImportant(xr1Var.f19338f).build();
                }
            }
