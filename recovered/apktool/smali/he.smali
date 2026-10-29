.class public final Lhe;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcp1;


# static fields
.field public static final a:Lhe;

.field public static final b:Leh0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lhe;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhe;->a:Lhe;

    .line 7
    .line 8
    const-string v0, "logRequest"

    .line 9
    .line 10
    invoke-static {v0}, Leh0;->a(Ljava/lang/String;)Leh0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lhe;->b:Leh0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lyi;

    .line 2
    .line 3
    check-cast p2, Ldp1;

    .line 4
    .line 5
    check-cast p1, Lcf;

    .line 6
    .line 7
    iget-object p0, p1, Lcf;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    sget-object p1, Lhe;->b:Leh0;

    .line 10
    .line 11
    invoke-interface {p2, p1, p0}, Ldp1;->a(Leh0;Ljava/lang/Object;)Ldp1;

    .line 12
    .line 13
    .line 14
    return-void
.end method
