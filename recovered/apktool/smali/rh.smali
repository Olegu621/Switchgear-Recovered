.class public final Lrh;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lk61;

.field public final synthetic c:Lth;

.field public final synthetic d:Ldw1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lk61;Lth;Ldw1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrh;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p2, p0, Lrh;->b:Lk61;

    .line 4
    .line 5
    iput-object p3, p0, Lrh;->c:Lth;

    .line 6
    .line 7
    iput-object p4, p0, Lrh;->d:Ldw1;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lcw1;

    .line 2
    .line 3
    iget-object v1, p0, Lrh;->b:Lk61;

    .line 4
    .line 5
    iget-object v1, v1, Lk61;->e:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lrh;->c:Lth;

    .line 8
    .line 9
    iget-object v2, v2, Lth;->g:Lg13;

    .line 10
    .line 11
    iget-object v3, p0, Lrh;->d:Ldw1;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcw1;-><init>(Ljava/lang/String;Lg13;Ldw1;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lrh;->a:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0
.end method
