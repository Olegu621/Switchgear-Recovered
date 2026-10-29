.class public final Lqg2;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lrg2;

.field public b:Lhk0;

.field public c:Lsg2;

.field public d:Lh01;

.field public e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic i:Lrg2;

.field public v:I


# direct methods
.method public constructor <init>(Lrg2;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqg2;->i:Lrg2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ld10;-><init>(Lc10;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lqg2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lqg2;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lqg2;->v:I

    .line 9
    .line 10
    iget-object p1, p0, Lqg2;->i:Lrg2;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lrg2;->collect(Lhk0;Lc10;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lz10;->a:Lz10;

    .line 17
    .line 18
    return-object p0
.end method
