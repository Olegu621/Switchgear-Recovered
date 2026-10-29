.class public final Ldn1;
.super Ld10;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Len1;

.field public c:I


# direct methods
.method public constructor <init>(Len1;Ld10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldn1;->b:Len1;

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
    .locals 2

    .line 1
    iput-object p1, p0, Ldn1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ldn1;->c:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ldn1;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Ldn1;->b:Len1;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, Len1;->h(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
