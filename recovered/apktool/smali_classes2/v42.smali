.class public final Lv42;
.super Lo01;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final v:Ler;


# direct methods
.method public constructor <init>(Ler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls91;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv42;->v:Ler;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    sget-object p1, Lo42;->b:Lm42;

    .line 2
    .line 3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 4
    .line 5
    iget-object p0, p0, Lv42;->v:Ler;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ler;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
