.class public final Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/id/scid_plugin/PromiseUtilKt;->all([Le70;)Le70;
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
    c = "com.supercell.id.scid_plugin.PromiseUtilKt$all$1"
    f = "PromiseUtil.kt"
    l = {
        0xcf
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "T",
        "Ly10;",
        "",
        "<anonymous>",
        "(Ly10;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $promises:[Le70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Le70;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>([Le70;Lc10;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Le70;",
            "Lc10;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->$promises:[Le70;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ltj2;-><init>(ILc10;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 0
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
    new-instance p1, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->$promises:[Le70;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;-><init>([Le70;Lc10;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Ly10;

    check-cast p2, Lc10;

    invoke-virtual {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->invoke(Ly10;Lc10;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget v1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->I$1:I

    .line 11
    .line 12
    iget v3, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->I$0:I

    .line 13
    .line 14
    iget-object v4, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->L$2:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Ljava/util/Collection;

    .line 17
    .line 18
    iget-object v5, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->L$1:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, Ljava/util/Collection;

    .line 21
    .line 22
    iget-object v6, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->L$0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, [Le70;

    .line 25
    .line 26
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->$promises:[Le70;

    .line 41
    .line 42
    new-instance v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    array-length v3, p1

    .line 45
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    array-length v3, p1

    .line 49
    const/4 v4, 0x0

    .line 50
    move v6, v4

    .line 51
    move-object v4, v1

    .line 52
    move v1, v3

    .line 53
    move v3, v6

    .line 54
    move-object v6, p1

    .line 55
    :goto_0
    if-ge v3, v1, :cond_3

    .line 56
    .line 57
    aget-object p1, v6, v3

    .line 58
    .line 59
    iput-object v6, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v4, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v4, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->L$2:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->I$0:I

    .line 66
    .line 67
    iput v1, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->I$1:I

    .line 68
    .line 69
    iput v2, p0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;->label:I

    .line 70
    .line 71
    invoke-interface {p1, p0}, Le70;->await(Lc10;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v0, :cond_2

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_2
    move-object v5, v4

    .line 79
    :goto_1
    invoke-interface {v4, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    add-int/2addr v3, v2

    .line 83
    move-object v4, v5

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    check-cast v4, Ljava/util/List;

    .line 86
    .line 87
    return-object v4
.end method
