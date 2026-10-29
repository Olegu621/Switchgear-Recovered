.class public final Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/id/scid_plugin/PromiseUtilKt;->both(Le70;Le70;)Le70;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltj2;",
        "Lkotlin/jvm/functions/Function2<",
        "Ly10;",
        "Lc10;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lj50;
    c = "com.supercell.id.scid_plugin.PromiseUtilKt$both$1"
    f = "PromiseUtil.kt"
    l = {
        0xdb,
        0xdb
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T1",
        "T2",
        "Ly10;",
        "Lkotlin/Pair;",
        "<anonymous>",
        "(Ly10;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $promise1:Le70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le70;"
        }
    .end annotation
.end field

.field final synthetic $promise2:Le70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le70;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Le70;Le70;Lc10;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le70;",
            "Le70;",
            "Lc10;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->$promise1:Le70;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->$promise2:Le70;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lc10;",
            ")",
            "Lc10;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->$promise1:Le70;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->$promise2:Le70;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;-><init>(Le70;Le70;Lc10;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Ly10;

    check-cast p2, Lc10;

    invoke-virtual {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->invoke(Ly10;Lc10;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Ly10;Lc10;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly10;",
            "Lc10;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->$promise1:Le70;

    .line 34
    .line 35
    iput v3, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->label:I

    .line 36
    .line 37
    invoke-interface {p1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->$promise2:Le70;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    iput v2, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;->label:I

    .line 49
    .line 50
    invoke-interface {v1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v0, :cond_4

    .line 55
    .line 56
    :goto_1
    return-object v0

    .line 57
    :cond_4
    move-object v4, p1

    .line 58
    move-object p1, p0

    .line 59
    move-object p0, v4

    .line 60
    :goto_2
    new-instance v0, Lkotlin/Pair;

    .line 61
    .line 62
    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method
