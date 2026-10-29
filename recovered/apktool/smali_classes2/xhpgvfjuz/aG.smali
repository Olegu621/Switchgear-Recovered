.class public Lxhpgvfjuz/aG;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private final a:Lxhpgvfjuz/as;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lxhpgvfjuz/aG;

    const v1, 0x655f

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lxhpgvfjuz/P;

    invoke-direct {v0, p0}, Lxhpgvfjuz/P;-><init>(Lxhpgvfjuz/aG;)V

    iput-object v0, p0, Lxhpgvfjuz/aG;->a:Lxhpgvfjuz/as;

    return-void
.end method


# virtual methods
.method public native a()I
.end method

.method public native b()Z
.end method

.method public native c()I
.end method

.method public native d()I
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    iget-object p1, p0, Lxhpgvfjuz/aG;->a:Lxhpgvfjuz/as;

    return-object p1
.end method
