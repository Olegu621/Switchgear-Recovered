.class public final Lqv2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lqi1;

.field public final b:Lo61;

.field public final c:Lyv2;

.field public final d:Lhk2;

.field public final e:Lhk2;


# direct methods
.method public constructor <init>(Lqi1;Lo61;Lyv2;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqv2;->a:Lqi1;

    .line 8
    .line 9
    iput-object p2, p0, Lqv2;->b:Lo61;

    .line 10
    .line 11
    iput-object p3, p0, Lqv2;->c:Lyv2;

    .line 12
    .line 13
    new-instance p1, Lpv2;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p1, p0, p2}, Lpv2;-><init>(Lqv2;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lqv2;->d:Lhk2;

    .line 24
    .line 25
    new-instance p1, Lpv2;

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    invoke-direct {p1, p0, p2}, Lpv2;-><init>(Lqv2;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lqv2;->e:Lhk2;

    .line 36
    .line 37
    return-void
.end method
