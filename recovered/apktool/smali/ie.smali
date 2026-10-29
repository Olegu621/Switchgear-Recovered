.class public final Lie;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcp1;


# static fields
.field public static final a:Lie;

.field public static final b:Leh0;

.field public static final c:Leh0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lie;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lie;->a:Lie;

    .line 7
    .line 8
    const-string v0, "clientType"

    .line 9
    .line 10
    invoke-static {v0}, Leh0;->a(Ljava/lang/String;)Leh0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lie;->b:Leh0;

    .line 15
    .line 16
    const-string v0, "androidClientInfo"

    .line 17
    .line 18
    invoke-static {v0}, Leh0;->a(Ljava/lang/String;)Leh0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lie;->c:Leh0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lsv;

    .line 2
    .line 3
    check-cast p2, Ldp1;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, Lkf;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lrv;->a:Lrv;

    .line 12
    .line 13
    sget-object v0, Lie;->b:Leh0;

    .line 14
    .line 15
    invoke-interface {p2, v0, p0}, Ldp1;->a(Leh0;Ljava/lang/Object;)Ldp1;

    .line 16
    .line 17
    .line 18
    check-cast p1, Lkf;

    .line 19
    .line 20
    iget-object p0, p1, Lkf;->a:Lze;

    .line 21
    .line 22
    sget-object p1, Lie;->c:Leh0;

    .line 23
    .line 24
    invoke-interface {p2, p1, p0}, Ldp1;->a(Leh0;Ljava/lang/Object;)Ldp1;

    .line 25
    .line 26
    .line 27
    return-void
.end method
