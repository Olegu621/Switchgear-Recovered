            package p000;

            import android.app.Notification;
            import android.app.PendingIntent;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Icon;
            import androidx.core.graphics.drawable.IconCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ko1 {
                /* JADX INFO: renamed from: a */
                public static no1 m6171a(Notification.BubbleMetadata bubbleMetadata) {
/* 2 */             if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
/* 1 */                 return null;
                    }
/* 12 */            PendingIntent intent = bubbleMetadata.getIntent();
/* 16 */            Icon icon = bubbleMetadata.getIcon();
/* 20 */            PorterDuff.Mode mode = IconCompat.f1245k;
/* 22 */            gv0.m4017a(icon);
/* 25 */            if (intent == null) {
/* 67 */                C1951n4.m6868s("Bubble requires non-null pending intent");
/* 1 */                 return null;
                    }
/* 27 */            bubbleMetadata.getAutoExpandBubble();
/* 30 */            bubbleMetadata.getDeleteIntent();
/* 33 */            bubbleMetadata.isNotificationSuppressed();
/* 40 */            if (bubbleMetadata.getDesiredHeight() != 0) {
/* 47 */                Math.max(bubbleMetadata.getDesiredHeight(), 0);
                    }
/* 54 */            if (bubbleMetadata.getDesiredHeightResId() != 0) {
/* 56 */                bubbleMetadata.getDesiredHeightResId();
                    }
/* 61 */            return new no1();
                }
            }
