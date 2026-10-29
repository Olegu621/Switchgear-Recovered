            package p000;

            import android.app.Notification;
            import android.app.PendingIntent;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Icon;
            import android.text.TextUtils;
            import androidx.core.graphics.drawable.IconCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class lo1 {
                /* JADX INFO: renamed from: a */
                public static no1 m6514a(Notification.BubbleMetadata bubbleMetadata) {
                    mo1 mo1Var;
/* 2 */             if (bubbleMetadata == null) {
/* 1 */                 return null;
                    }
/* 9 */             if (bubbleMetadata.getShortcutId() != null) {
/* 13 */                String shortcutId = bubbleMetadata.getShortcutId();
/* 17 */                mo1Var = new mo1();
/* 24 */                if (TextUtils.isEmpty(shortcutId)) {
/* 31 */                    C1951n4.m6868s("Bubble requires a non-null shortcut id");
/* 1 */                     return null;
                        }
/* 26 */                mo1Var.f13893g = shortcutId;
                    } else {
/* 37 */                PendingIntent intent = bubbleMetadata.getIntent();
/* 41 */                Icon icon = bubbleMetadata.getIcon();
/* 45 */                PorterDuff.Mode mode = IconCompat.f1245k;
/* 47 */                IconCompat iconCompatM4017a = gv0.m4017a(icon);
/* 51 */                mo1Var = new mo1();
/* 54 */                if (intent == null) {
/* 151 */                   C1951n4.m6868s("Bubble requires non-null pending intent");
/* 1 */                     return null;
                        }
/* 56 */                mo1Var.f13887a = intent;
/* 58 */                mo1Var.f13888b = iconCompatM4017a;
                    }
/* 65 */            mo1Var.m6716a(1, bubbleMetadata.getAutoExpandBubble());
/* 72 */            mo1Var.f13892f = bubbleMetadata.getDeleteIntent();
/* 79 */            mo1Var.m6716a(2, bubbleMetadata.isNotificationSuppressed());
/* 87 */            if (bubbleMetadata.getDesiredHeight() != 0) {
/* 97 */                mo1Var.f13889c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
/* 99 */                mo1Var.f13890d = 0;
                    }
/* 105 */           if (bubbleMetadata.getDesiredHeightResId() != 0) {
/* 111 */               mo1Var.f13890d = bubbleMetadata.getDesiredHeightResId();
/* 113 */               mo1Var.f13889c = 0;
                    }
/* 115 */           IconCompat iconCompat = mo1Var.f13888b;
/* 117 */           PendingIntent pendingIntent = mo1Var.f13887a;
/* 119 */           String str = mo1Var.f13893g;
/* 121 */           if (str == null && pendingIntent == null) {
/* 128 */               C1951n4.m6868s("Must supply pending intent or shortcut to bubble");
/* 1 */                 return null;
                    }
/* 132 */           if (str != null || iconCompat != null) {
/* 145 */               return new no1();
                    }
/* 139 */           C1951n4.m6868s("Must supply an icon or shortcut for the bubble");
/* 1 */             return null;
                }
            }
