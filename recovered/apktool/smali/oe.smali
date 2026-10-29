.class public final Loe;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcp1;


# static fields
.field public static final a:Loe;

.field public static final b:Leh0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Loe;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loe;->a:Loe;

    .line 7
    .line 8
    new-instance v0, Lwd;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lwd;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-class v1, Lbz1;

    .line 15
    .line 16
    invoke-static {v1, v0}, Len;->s(Ljava/lang/Class;Lwd;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Leh0;

    .line 21
    .line 22
    invoke-static {v0}, Len;->t(Ljava/util/HashMap;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "storageMetrics"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Leh0;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Loe;->b:Leh0;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lhr0;

    .line 2
    .line 3
    check-cast p2, Ldp1;

    .line 4
    .line 5
    sget-object p0, Loe;->b:Leh0;

    .line 6
    .line 7
    iget-object p1, p1, Lhr0;->a:Lgh2;

    .line 8
    .line 9
    invoke-interface {p2, p0, p1}, Ldp1;->a(Leh0;Ljava/lang/Object;)Ldp1;

    .line 10
    .line 11
    .line 12
    return-void
.end method
