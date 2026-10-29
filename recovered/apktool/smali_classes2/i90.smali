.class public final Li90;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lfk0;


# instance fields
.field public final a:Lwc0;


# direct methods
.method public constructor <init>(Lwc0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li90;->a:Lwc0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final collect(Lhk0;Lc10;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lh22;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljb1;->c:Lr4;

    .line 7
    .line 8
    iput-object v1, v0, Lh22;->a:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, Lh90;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0, p1}, Lh90;-><init>(Li90;Lh22;Lhk0;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Li90;->a:Lwc0;

    .line 16
    .line 17
    invoke-virtual {p0, v1, p2}, Lwc0;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lz10;->a:Lz10;

    .line 22
    .line 23
    if-ne p0, p1, :cond_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method
