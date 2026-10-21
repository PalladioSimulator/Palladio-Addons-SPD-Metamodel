# The Scaling Policy Definition (SPD) Meta-model

This repository contains the metamodel for defining scaling policies that can be simulated in Palladio and thus 
help self-adaptive system architects to evaluate elasticity policies more efficiently. 

Below is a conceptual overview of the meta-model and the key elements behind the SPD language. 

```mermaid
graph
    A[Scaling Policy]
    B>Adjustment Type]
    C[Scaling Trigger]
    D((Target Group))
    PCon{Policy Constraint's}
    TCon{Target Group Constraint's}
    PCon -- constraints on the policy <br> i.e., cooldown period of three minutes  --> A
    TCon -- constraints on the group <br> i.e., max number of resource containers --> D
    C -- trigger firing <br> i.e., CPU utilization exceeds upper threshold of 80% --> A
    A --> B
    B -- adjusts the target <br> i.e., by adding one more instance --> D
    D --> C
```

# Compatibility with other tools
Other tools build upon the meta-model and the meta-model is in the inception phase, hence it is evolving and being refactored. To help you understand which tool works with which version we rely on tags for now. 



* Graphical Syntax for SPD -> supports the meta-model definition tagged [v0.1](https://git.rss.iste.uni-stuttgart.de/slingshot/spd-meta-model/-/commits/v0.1 ) 

## License

This project is licensed under the [Eclipse Public License 2.0](LICENSE) (EPL-2.0), consistent with most PalladioSimulator projects.