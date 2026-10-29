.class public final Lbt2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lzs2;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lew2;

.field public final c:Ljava/lang/Integer;

.field public final d:Lys2;

.field public final e:Z

.field public final f:Lhk2;

.field public final g:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzs2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbt2;->Companion:Lzs2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lew2;Ljava/lang/Integer;Lys2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbt2;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lbt2;->b:Lew2;

    .line 7
    .line 8
    iput-object p3, p0, Lbt2;->c:Ljava/lang/Integer;

    .line 9
    .line 10
    iput-object p4, p0, Lbt2;->d:Lys2;

    .line 11
    .line 12
    iput-boolean p5, p0, Lbt2;->e:Z

    .line 13
    .line 14
    new-instance p1, Lat2;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p0, p2}, Lat2;-><init>(Lbt2;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lbt2;->f:Lhk2;

    .line 25
    .line 26
    new-instance p1, Lat2;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p1, p0, p2}, Lat2;-><init>(Lbt2;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lbt2;->g:Lhk2;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lbt2;->f:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/FrameLayout;

    .line 8
    .line 9
    return-object p0
.end method
