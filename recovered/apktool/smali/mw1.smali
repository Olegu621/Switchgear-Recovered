.class public abstract Lmw1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lbc1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ly83;->c:Lu83;

    .line 2
    .line 3
    sget-object v1, Ly83;->e:Lw83;

    .line 4
    .line 5
    invoke-static {}, Lrw1;->v()Lrw1;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Lbc1;

    .line 10
    .line 11
    invoke-direct {v3, v0, v1, v2}, Lbc1;-><init>(Ly83;Ly83;Lrw1;)V

    .line 12
    .line 13
    .line 14
    sput-object v3, Lmw1;->a:Lbc1;

    .line 15
    .line 16
    return-void
.end method
