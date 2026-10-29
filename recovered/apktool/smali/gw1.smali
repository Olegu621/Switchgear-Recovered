.class public final Lgw1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lh40;


# instance fields
.field public final a:Lh40;


# direct methods
.method public constructor <init>(Lh40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgw1;->a:Lh40;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lfw1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p1, v1, v2}, Lfw1;-><init>(Lkotlin/jvm/functions/Function2;Lc10;I)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lgw1;->a:Lh40;

    .line 9
    .line 10
    invoke-interface {p0, v0, p2}, Lh40;->a(Lkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getData()Lfk0;
    .locals 0

    .line 1
    iget-object p0, p0, Lgw1;->a:Lh40;

    .line 2
    .line 3
    invoke-interface {p0}, Lh40;->getData()Lfk0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
