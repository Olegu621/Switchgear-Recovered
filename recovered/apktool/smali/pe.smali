.class public final Lpe;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcp1;


# static fields
.field public static final a:Lpe;

.field public static final b:Leh0;

.field public static final c:Leh0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lpe;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpe;->a:Lpe;

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
    new-instance v2, Leh0;

    .line 21
    .line 22
    invoke-static {v0}, Len;->t(Ljava/util/HashMap;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v3, "eventsDroppedCount"

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, Leh0;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, Lpe;->b:Leh0;

    .line 32
    .line 33
    new-instance v0, Lwd;

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v2}, Lwd;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v0}, Len;->s(Ljava/lang/Class;Lwd;)Ljava/util/HashMap;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Leh0;

    .line 44
    .line 45
    invoke-static {v0}, Len;->t(Ljava/util/HashMap;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "reason"

    .line 50
    .line 51
    invoke-direct {v1, v2, v0}, Leh0;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, Lpe;->c:Leh0;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lda1;

    .line 2
    .line 3
    check-cast p2, Ldp1;

    .line 4
    .line 5
    sget-object p0, Lpe;->b:Leh0;

    .line 6
    .line 7
    iget-wide v0, p1, Lda1;->a:J

    .line 8
    .line 9
    invoke-interface {p2, p0, v0, v1}, Ldp1;->e(Leh0;J)Ldp1;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lpe;->c:Leh0;

    .line 13
    .line 14
    iget-object p1, p1, Lda1;->b:Lca1;

    .line 15
    .line 16
    invoke-interface {p2, p0, p1}, Ldp1;->a(Leh0;Ljava/lang/Object;)Ldp1;

    .line 17
    .line 18
    .line 19
    return-void
.end method
